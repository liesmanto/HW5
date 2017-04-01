<%-- 
    Document   : add
    Created on : Mar 27, 2017, 9:54:25 AM
    Author     : nliesmanto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A Player</title>
        <link rel="stylesheet" type="text/css" href="style2.css"/>
    </head>
    <body>
        <h1>Add A Player</h1>
        
        <form name="addForm" action="addPlayer" method="get">
            <table align="center">
                <tbody>
                    <tr>
                        <td>Jersey Number:</td>
                        <td><input type="tex" name="playerJerseyNumber" value=""/></td>
                    </tr>
                    
                    <tr>
                        <td>Name:</td>
                        <td><input type="tex" name="playerName" value=""/></td>
                    </tr>
            
                    <tr>
                        <td>Age:</td>
                        <td><input type="tex" name="playerAge" value=""/></td>
                    </tr>
            
                    <tr>
                        <td>Place of Birth:</td>
                        <td><input type="tex" name="playerPOB" value=""/></td>
                    </tr>
                    
                    <tr>
                        <td>Position:</td>
                        <td><input type="tex" name="playerPosition" value=""/></td>
                    </tr>
                    
                    <tr>
                        <td># of Caps:</td>
                        <td><input type="tex" name="playerCaps" value=""/></td>
                    </tr>
                    
                    <tr>
                        <td># of Goals:</td>
                        <td><input type="tex" name="playerGoals" value=""/></td>
                    </tr>
                    
                    <tr>
                        <td>Domestic Club:</td>
                        <td><input type="tex" name="playerDomesticClub" value=""/></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" name="submit" value="Submit"/>
        </form>
    </body>
</html>
