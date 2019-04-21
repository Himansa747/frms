<%-- 
    Document   : Add JMO
    Created on : Nov 27, 2018, 04:20:29 PM
    Author     : Januka Dharmapriya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.DbConnect"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <title>View - Hospital Police </title>
        <link href="./styles/mainstyle.css" rel="stylesheet" type="text/css" >
        <link href="./styles/style.css" rel="stylesheet" type="text/css" >
        <link rel="stylesheet" type="text/css" href="styles/style1.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

        <%
            String id = request.getParameter("userId");
            String driverName = "com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://localhost:3306/";
            String dbName = "project_database";
            String userId = "root";
            String password = "";

            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        %> 

        <script>
            function startTime() {
                var today = new Date();
                var h = today.getHours();
                var m = today.getMinutes();
                var s = today.getSeconds();
                m = checkTime(m);
                s = checkTime(s);
                document.getElementById('clockText').innerHTML =
                        h + ":" + m + ":" + s;
                var t = setTimeout(startTime, 500);
            }
            function checkTime(i) {
                if (i < 10) {
                    i = "0" + i
                }
                ;  // add zero in front of numbers < 10
                return i;
            }
        </script>
    </head>

    <body style="background-image:url(Images/backgroundImage.jpg)"> 

    <body onload="startTime()">

        <div class="header">
            <img src="Images/FRMS.png" style="height:100px;width:250px;"> 
            <font color="white" size="5px">

            <div type="text" disabled="" class="warnButton1"  style="float: right;" id="clockText" ></div>
            <a href=""><button class="warnButton"  style="float: right;">Logout</button></a>

            <button class="activeButton" onclick="document.getElementById('idForm').style.display = 'block'" style="float: right;">Login</button>

            <a href=""><button class="warnButton"  style="float: right;background-color:#9db4b7;">Admin Home</button></a>
            <a href=""><button class="warnButton"  style="float: right;background-color:#c60084;">FRMS Home</button></a>
            </font>
        </div><br><br>
        <div class="cont">
            <font color="white" size="4px">
            <h2 align="center"><font><strong>Hospital Police officers' Details</strong></font></h2>
            <table align="center" cellpadding="5" cellspacing="5" border="1">
                <tr>

                </tr>
                <tr bgcolor="blue">
                    <td><b>Name</b></td>
                    <td><b>User Name</b></td>
                    <td><b>Password</b></td>
                    <td><b>email</b></td>
                    <td><b>Contact Number</b></td>
                    <td><b>Police ID Number</b></td>
                    <td><b>Account Type</b></td>
                     <td><b>Police Station</b></td>
                    <td><b>Officer Rank</b></td>
                </tr><br>
                <%
                    try {
                        connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
                        statement = connection.createStatement();
                        String sql = "SELECT * FROM policeofficer";

                        resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                %>
                <tr bgcolor="#DEB887">

                    <td><%=resultSet.getString(1)%></td>
                    <td><%=resultSet.getString(2)%></td>
                    <td><%=resultSet.getString(3)%></td>
                    <td><%=resultSet.getString(4)%></td>
                    <td><%=resultSet.getString(5)%></td>
                    <td><%=resultSet.getString(6)%></td>
                    <td><%=resultSet.getString(7)%></td>
                    <td><%=resultSet.getString(8)%></td>
                    <td><%=resultSet.getString(9)%></td>

                </tr>

                <%
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
            </table><br>

            <form class="example" action="/action_page.php">
                <input type="text" placeholder="Search.." name="id" value=Search">
                <button type="submit">Delete</button>
            </form>
            </font>
    </body>
</html>