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
    </head>
    <body>
        <h1>Add A Player</h1>
        
        <form name="addForm" action="addPlayer" method="get">
            
            <label>Jersey Number:</label>
            <input type="tex" name="jNumber" value=""/>
            <br>
            <label>Name:</label>
            <input type="tex" name="name" value=""/>
            <br>
            <label>Age:</label>
            <input type="tex" name="age" value=""/>
            <br>
            <label>Player Place of Birth:</label>
            <input type="tex" name="pob" value=""/>
            <br>
            <label>Player Position:</label>
            <input type="tex" name="position" value=""/>
            <br>
            <label># of Caps:</label>
            <input type="tex" name="caps" value=""/>
            <br>
            <label># of Goals</label>
            <input type="tex" name="name" value=""/>
            <br>
            <label>Domestic Club:</label>
            <input type="tex" name="name" value=""/>
            <br>
            <input type="submit" name="submit" value="Submit"/>
        </form>
    </body>
</html>
