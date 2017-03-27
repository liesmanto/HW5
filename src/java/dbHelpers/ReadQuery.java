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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.GermanyFootballTeam;

/**
 *
 * @author nliesmanto
 */
public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery() {
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doRead() {
        try {
            String query = "Select * from GermanyFootballTeam";
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getHTMLTable() {
        String table = "";
        table += "<table>";
        
        try {
            while(this.results.next()) {
                GermanyFootballTeam gft = new GermanyFootballTeam();
                gft.setPlayerID(this.results.getInt("playerID"));
                gft.setPlayerJerseyNumber(this.results.getInt("playerJerseyNumber"));
                gft.setPlayerName(this.results.getString("playerName"));
                gft.setPlayerAge(this.results.getInt("playerAge"));
                gft.setPlayerPOB(this.results.getString("playerPOB"));
                gft.setPlayerPosition(this.results.getString("playerPosition"));
                gft.setPlayerCaps(this.results.getInt("playerCaps"));
                gft.setPlayerGoals(this.results.getInt("playerGoals"));
                gft.setPlayerDomesticClub(this.results.getString("PlayerDomesticClub"));
                
                table += "<tr>";
                table += "<td>";
                table += gft.getPlayerID();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerJerseyNumber();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerName();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerAge();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerPOB();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerPosition();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerCaps();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerGoals();
                table += "</td>";
                
                table += "<td>";
                table += gft.getPlayerDomesticClub();
                table += "</td>";
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table +="</table>";
        return table;
    }

}

