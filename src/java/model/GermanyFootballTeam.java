/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nliesmanto
 */
public class GermanyFootballTeam {
    private int playerID;
    private int playerJerseyNumber;
    private String playerName;
    private int playerAge;
    private String playerPOB;
    private String playerPosition;
    private int playerCaps;
    private int playerGoals;
    private String playerDomesticClub;
    
    public GermanyFootballTeam() {
        this.playerID = 0;
        this.playerJerseyNumber = 0;
        this.playerName = "";
        this.playerAge = 0;
        this.playerPOB = "";
        this.playerPosition = "";
        this.playerCaps = 0;
        this.playerGoals = 0;
        this.playerDomesticClub = "";
    }
    
    public GermanyFootballTeam(int playerID, int playerJerseyNumber, String playerName, int playerAge, String playerPOB, String playerPosition, int playerCaps, int playerGoals, String playerDomesticClub) {
        this.playerID = playerID;
        this.playerJerseyNumber = playerJerseyNumber;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerPOB = playerPOB;
        this.playerPosition = playerPosition;
        this.playerCaps = playerCaps;
        this.playerGoals = playerGoals;
        this.playerDomesticClub = playerDomesticClub;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getPlayerJerseyNumber() {
        return playerJerseyNumber;
    }

    public void setPlayerJerseyNumber(int playerJerseyNumber) {
        this.playerJerseyNumber = playerJerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public String getPlayerPOB() {
        return playerPOB;
    }

    public void setPlayerPOB(String playerPOB) {
        this.playerPOB = playerPOB;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getPlayerCaps() {
        return playerCaps;
    }

    public void setPlayerCaps(int playerCaps) {
        this.playerCaps = playerCaps;
    }

    public int getPlayerGoals() {
        return playerGoals;
    }

    public void setPlayerGoals(int playerGoals) {
        this.playerGoals = playerGoals;
    }

    public String getPlayerDomesticClub() {
        return playerDomesticClub;
    }

    public void setPlayerDomesticClub(String playerDomesticClub) {
        this.playerDomesticClub = playerDomesticClub;
    }

    @Override
    public String toString() {
        return "GermanyFootballTeam{" + "playerID=" + playerID + ", playerJerseyNumber=" + playerJerseyNumber + ", playerName=" + playerName + ", playerAge=" + playerAge + ", playerPOB=" + playerPOB + ", playerPosition=" + playerPosition + ", playerCaps=" + playerCaps + ", playerGoals=" + playerGoals + ", playerDomesticClub=" + playerDomesticClub + '}';
    }
    
    
}
