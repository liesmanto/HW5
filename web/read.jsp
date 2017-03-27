<%-- 
    Document   : read
    Created on : Mar 6, 2017, 5:54:23 PM
    Author     : nliesmanto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Germany Football Team</title>
        <link rel="stylesheet" type="text/css" href="style.css"/>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1><u>Germany Football Team Current Squad</u></h1>
        <%= table %>
        <br>
        <a href="index.jsp">previous page</a>
    </body>
</html>
