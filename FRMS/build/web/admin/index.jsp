
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Control Panel</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="css/style1.css">
        <link rel="stylesheet" type="text/css" href="css/form.css">


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


    <body onload="startTime()">

        <div id="content">


            <div id="center">

                <div type="text" disabled="" class="warnButton1"  style="float: right;" id="clockText" ></div>
                <a href=""><button class="warnButton"  style="float: right;">Logout</button></a>



                <button class="activeButton" onclick="document.getElementById('idForm').style.display = 'block'" style="float: right;">Login</button>


                <label id='helloLabel' >Hello 


                </label>

                <a href=""><button class="warnButton"  style="float: right;background-color:#9db4b7;">Admin Home</button></a>
                <a href=""><button class="warnButton"  style="float: right;background-color:#c60084;">FRMS Home</button></a>

                <table  id="cnLeftTable">
                    <caption> <h2 style="color: #ffe6e6;font-size: 45px;margin-top: -40px;"><br/>Welcome to the admin Page of FRMS</h2></caption>
                    <tbody>
                        <tr>
                            <td>
                                <a href="">
                                    <img src="../images/register.png" class="tableImage">
                                    <br/>
                                    View <br/>Register
                                </a>
                            </td>
                            <td>
                                <a href="Add Users/AddUsers.jsp">
                                    <img src="../images/addAdministrator.png" class="tableImage">
                                    <br/>
                                    Add <br/>User
                                </a>
                            </td>
                            <td>
                                <a href="">
                                    <img src="../images/removeAdmin.png" class="tableImage">
                                    <br/>
                                    Remove<br/> User
                                </a>
                            </td>
                            <td>
                                <a href="View User Details/ViewUsers.jsp">
                                    <img src="../images/user.png" class="tableImage">
                                    <br/>
                                    User<br/> Details
                                </a>
                            </td>
                            <td>
                                <a href="">
                                    <img src="../images/mlef.png" class="tableImage"> 
                                    <br/>
                                    Add<br/> MLEF
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <img src="../images/mlrCourt.png" class="tableImage">
                                <br/>
                                <a href="">Create <br/> MLR</a>
                            </td>

                            <td>
                                <a href="">
                                    <img src="../images/validate.png" class="tableImage">
                                    <br/>
                                    Validate<br/> Reports
                                </a>
                            </td>
                            <td>
                                <a href="../Reports/Postmortem Report/Postmortem.jsp">
                                    <img src="../images/autopsy.png" class="tableImage">
                                    <br/>
                                    Add <br/> PM Report
                                </a>
                            </td>
                            <td>
                                <a href="">
                                    <img src="../images/report.png" class="tableImage">

                                    <br/>Analyse<br/> Reports
                                </a>
                            </td>
                            <td>
                                <a href="">
                                    <img src="../images/search.png" class="tableImage">
                                    <br/>
                                    View <br> Reports<br/>
                                </a>
                            </td>

                        </tr>
                        <tr>
                            <td>
                                <a href="">
                                    <img src="../images/adminDetails.png" class="tableImage">
                                    <br/>
                                    Admin <br/>Details
                                </a>
                            </td>

                            <td>
                                <a href="">
                                    <img src="../images/meter.png" class="tableImage">
                                    <br/>
                                    System <br/>Usage
                                </a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>


        <div id="idForm" class="model">
            <center>
                <form action="login.php" class="model-content animate" method="post">

                    <div class="imgct">
                        <span onclick="document.getElementById('idForm').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                        <img src="../images/loginAvatar.png" class="avatar" width="20%" height="20%">
                    </div>

                    <div class="fromContainer">
                        <br/>
                        <b>Username</b>
                        <input type="text" name="uName" required placeholder="Enter username">
                        <br/><br/>
                        <b>Password</b>
                        <input type="password" name="psw" required placeholder="Enter username">
                        <br/>
                        <button type="submit" class="activeButton">Login</button>
                    </div>
                </form>
            </center>
        </div>




        <style type="text/css">

        </style>




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