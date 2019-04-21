<%-- 
    Document   : index
    Created on : Nov 28, 2018, 7:44:57 PM
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FRMS1</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <nav class="navbar navbar-light navbar-expand-md">
        <div class="container-fluid"><a class="navbar-brand brnlog" href="#"><img src="assets/img/favicon.png" data-bs-hover-animate="" style="height:44px;">&nbsp;Forensic Report Management System</a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="#">Home</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="#">View&nbsp;<i class="fa fa-angle-down"></i></a></li>
                    <li class="dropdown"><a class="dropdown-toggle nav-link dropdown-toggle user" data-toggle="dropdown" aria-expanded="false" href="#">User name&nbsp;<i class="fa fa-user-circle-o"></i> </a>
                        <div class="dropdown-menu" role="menu"><a class="dropdown-item" role="presentation" href="#">Settings</a><a class="dropdown-item" role="presentation" href="#">Logout</a></div>
                    </li>
                </ul>
        </div>
        </div>
    </nav>
    <div style="margin-top:29px;">
        <div class="container">
            <div class="row" style="margin-top:60px;">
                <div class="col align-content-center" style="height:180px;text-align:center;/*box-sizing:border-box;*//*display:block;*/margin-right:2rem;margin-left:2rem;padding:5%;"><button class="btn btn-primary onebtn" type="button">Create MLEF</button></div>
                <div class="col" style="margin-right:2rem;margin-left:2rem;padding:5%;"><button class="btn btn-primary onebtn" type="button">Create PM</button></div>
            </div>
        </div>
    </div>
    <section style="margin-top:50px;">
        <div class="table-container">
            <div class="table-responsive">
                <table class="table">
                    <thead class="justify-content-center align-items-center align-content-center flex-nowrap" style="font-family:Poppins, sans-serif;">
                        <tr style="background-color:#000000;color:#fff;font-weight:400;">
                            <th>SR Number</th>
                            <th>Date</th>
                            <th>Police Area</th>
                            <th>MLEF Number</th>
                            <th>Date of issue (MLEF)</th>
                            <th>Date of Examination</th>
                            <th>Circumstance</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>02</td>
                            <td>2018.08.08</td>
                            <td>Cinnamon Gardens</td>
                            <td>EGQ982HY1</td>
                            <td>2017.01.6</td>
                            <td>2017.01.4</td>
                            <td>Natural</td>
                        </tr>
                        <tr>
                           <td>03</td>
                            <td>2018.08.08</td>
                            <td>Cinnamon Gardens</td>
                            <td>EGQ982HY1</td>
                            <td>2017.01.6</td>
                            <td>2017.01.4</td>
                            <td>Natural</td>
                        </tr>
                        <tr>
                            <td>04</td>
                            <td>2018.08.08</td>
                            <td>Cinnamon Gardens</td>
                            <td>EGQ982HY1</td>
                            <td>2017.01.6</td>
                            <td>2017.01.4</td>
                            <td>Natural</td>
                        </tr>
                        <tr>
                            <td>05</td>
                            <td>2018.08.08</td>
                            <td>Cinnamon Gardens</td>
                            <td>EGQ982HY1</td>
                            <td>2017.01.6</td>
                            <td>2017.01.4</td>
                            <td>Natural</td>
                        </tr>
                         <tr>
                            <td>06</td>
                            <td>2018.08.08</td>
                            <td>Cinnamon Gardens</td>
                            <td>EGQ982HY1</td>
                            <td>2017.01.6</td>
                            <td>2017.01.4</td>
                            <td>Natural</td>
                        </tr>
                         <tr>
                            <td>07</td>
                            <td>2018.08.08</td>
                            <td>Cinnamon Gardens</td>
                            <td>EGQ982HY1</td>
                            <td>2017.01.6</td>
                            <td>2017.01.4</td>
                            <td>Natural</td>
                        </tr>
                        
                    </tbody>
                </table>
            </div>
        </div>
    </section>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>

</html>
