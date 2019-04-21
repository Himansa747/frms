<%-- 
    Document   : view
    Created on : Jan 6, 2019, 2:31:59 PM
    Author     : Himansa
--%>


<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.InsertPM"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="javax.swing.text.DateFormatter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="model.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Postmortem Details</title>
        <link href="./styles/mainstyle.css" rel="stylesheet" type="text/css" >
        <link href="./styles/style.css" rel="stylesheet" type="text/css" >
        <link rel="stylesheet" type="text/css" href="styles/style1.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

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

    <body style="background-image:url(backgroundImage.jpg)"> 

    <body onload="startTime()">

        <div class="header">
            <img src="Images/FRMS.png" style="height:100px;width:250px;"> 
            <font color="white" size="5px">

            <div type="text" disabled="" class="warnButton1"  style="float: right;" id="clockText" ></div>
            <a href=""><button class="warnButton"  style="float: right;">Logout</button></a>

            <!--<button class="activeButton" onclick="document.getElementById('idForm').style.display = 'block'" style="float: right;">Login</button>-->

           <button onclick="goBack()" class="warnButton"  style="float: right;background-color:#9db4b7;">Go Back</button>
            <a href=""><button class="warnButton"  style="float: right;background-color:#c60084;">FRMS Home</button></a>
            </font>
        </div><hr>
        <br><br>

        <script>
            function goBack() {
                window.history.back();
            }
        </script>

        <font color="white" size="4px">
        <form class="example" align="center">
            <a href=""><button type="submit" class="btn btn-danger">Download PDF</button></a>
        </form><br>
        <table align="center" cellpadding="15" cellspacing="5" border="1"  width = "40%" id="myTable">

            <thead bgcolor="#6a91c1">
            <th><center>Field Name</center></th>
            <th><center>Value</center></th>
</thead>
<tbody>
    <!--SELECT data FROM medico legal report table-->
    <%
        String Serial_no = request.getParameter("number");
        String sql = "Select * from mlrform where S_no = ?";
        PreparedStatement ps;
            ps = DbConnect.dbConnect().prepareStatement(sql);
            ps.setString(1, Serial_no);
            ResultSet rs = ps.executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int colCount = metaData.getColumnCount();
        //String s[] = new String[colCount] ;
        String s;
        String coulmnValue;
        while (rs.next()) {
            for (int i = 1; i < metaData.getColumnCount(); i++) {

                s = metaData.getColumnName(i);
    %> 
    <tr bgcolor="#74a9af">
        <td><center><%= s%></center></td>
<td><center><%= rs.getString(i)%></center></td>

</tr>

<%

        }
    }

%>
</tbody>
</table>
</font>
</body>
</html>
