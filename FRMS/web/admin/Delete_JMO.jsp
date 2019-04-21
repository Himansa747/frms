<%-- 
    Document   : Delete_JMO
    Created on : Oct 13, 2018, 7:13:04 PM
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Delete - JMO</title>
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
            <form action="DeleteJMOController" method="POST">

                <table cellspecing="500" cellpadding="20" align="center">
                    <thead> <tr> <td colspan="20"><b><center>DELETE USER FORM </center></b><td></tr></thead>
                    <tbody>
                        <tr>
                            <td>User Name</td>
                            <td><input type="text" placeholder="user name" name="u_name"></td>
                        </tr>
                        <tr>
                            <td>E-Mail</td>
                            <td><input type="email" placeholder="E-mail" name="email"></td>
                        </tr>
                        <tr>
                            <td>ID-Number</td>
                            <td><input type="text" placeholder="Id number" name="id"></td>
                        </tr>
                        <tr>
                            <td>Medi-ID-Number</td>
                            <td><input type="text" placeholder="medical id number" name="med-id"></td>
                        </tr>
                        <tr>
                            <td><input type="reset" name="cancel" value="Cancel"></td>
                            <td><input type="submit" name="delete" value="delete details"></td>
                        </tr > 
                    </tbody>	
                </table>

            </form></font>
        </div>


        <script type="text/javascript">

            var model = document.getElementById("idForm");

            window.onclick = function (event) {
                if (event.target == model) {
                    model.style.display = "none";
                }
            }
        </script>


    </body>
</html>

