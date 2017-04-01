/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.GermanyFootballTeam;

/**
 *
 * @author nliesmanto
 */
public class AddQuery {
    private Connection conn;
    public AddQuery() {
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doAdd(GermanyFootballTeam germanyfootballteam) {
        try {
            String query = "INSERT INTO GermanyFootballTeam (playerJerseyNumber, playerName, playerAge, playerPOB, playerPosition, playerCaps, playerGoals, playerDomesticClub) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, germanyfootballteam.getPlayerJerseyNumber());
            ps.setString(2, germanyfootballteam.getPlayerName());
            ps.setInt(3, germanyfootballteam.getPlayerAge());
            ps.setString(4, germanyfootballteam.getPlayerPOB());
            ps.setString(5, germanyfootballteam.getPlayerPosition());
            ps.setInt(6, germanyfootballteam.getPlayerCaps());
            ps.setInt(7, germanyfootballteam.getPlayerGoals());
            ps.setString(8, germanyfootballteam.getPlayerDomesticClub());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
