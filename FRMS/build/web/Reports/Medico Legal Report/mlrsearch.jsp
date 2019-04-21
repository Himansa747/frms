<%-- 
    Document   : mlrsearch
    Created on : Jan 6, 2019, 1:58:55 PM
    Author     : Himansa
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
        <title>View - MLR Reports</title>
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
            String dbName = "frms";
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
                ; // add zero in front of numbers < 10
                return i;
            }
        </script>
    </head>

    <body style="background-image:url(backgroundImage.jpg)"> 

    <body onload="startTime()">

        <div class="header">
            <img src="FRMS.png" style="height:100px;width:250px;"> 
            <font color="white" size="5px">

            <div type="text" disabled="" class="warnButton1"  style="float: right;" id="clockText" ></div>
            <a href=""><button class="warnButton"  style="float: right;">Logout</button></a>

<!--            <button class="activeButton" onclick="document.getElementById('idForm').style.display = 'block'" style="float: right;">Login</button>-->

            <a href="../index.jsp"><button class="warnButton"  style="float: right;background-color:#9db4b7;">Admin Home</button></a>
            <a href=""><button class="warnButton"  style="float: right;background-color:#c60084;">FRMS Home</button></a>
            </font>
        </div><br><br>
        <div class="cont">
            <font color="white" size="4px">
            <h2 align="center"><font><strong>MLR Reports Details</strong></font></h2><br>

            <form align="center" action="view.jsp">
                <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Serial Number:-" name="number">
                <button type="submit">View<i class="fa fa-search"></i></button>
            </form><br>

            <table align="center" cellpadding="15" cellspacing="5" border="1"  width = "90%" id="myTable">
                <tr bgcolor="#5ba0d8">
                    <td><b><center>Serial Number</center></b></td>
                    <td><b><center>Date of Issue</center></b></td>
                    <td><b><center>Magistrate Court</center></b></td>
                    <td><b><center>Case Number</center></b></td>
                    <td><b><center>Police Station</center></b></td>
                    <td><b><center>Date of Trial</center></b></td>
                    <td><b><center>Injuries</center></b></td>
                    
                </tr><br>
                <%
                    try {
                        connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
                        statement = connection.createStatement();
                        String sql = "SELECT S_no, Date_of_issue, Mgs_court, Case_no, Station, Date_of_trial , Injuries FROM mlrform ORDER BY Mgs_court DESC LIMIT 15";

                        resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                %>
                <tr bgcolor="#62a1b2">

                    <td><%=resultSet.getString(1)%></td>
                    <td><%=resultSet.getString(2)%></td>
                    <td><%=resultSet.getString(3)%></td>
                    <td><%=resultSet.getString(4)%></td>
                    <td><%=resultSet.getString(5)%></td>
                    <td><%=resultSet.getString(6)%></td>
                    <td><%=resultSet.getString(7)%></td>
                    




                </tr>

                <%
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>

                <script>
                    function myFunction() {
                        // Declare variables 
                        var input, filter, table, tr, td, i, txtValue;
                        input = document.getElementById("myInput");
                        filter = input.value.toUpperCase();
                        table = document.getElementById("myTable");
                        tr = table.getElementsByTagName("tr");

                        // Loop through all table rows, and hide those who don't match the search query
                        for (i = 0; i < tr.length; i++) {
                            td = tr[i].getElementsByTagName("td")[0];
                            if (td) {
                                txtValue = td.textContent || td.innerText;
                                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                                    tr[i].style.display = "";
                                } else {
                                    tr[i].style.display = "none";
                                }
                            }
                        }
                    }
                </script>


            </table>

    </body>
</html>