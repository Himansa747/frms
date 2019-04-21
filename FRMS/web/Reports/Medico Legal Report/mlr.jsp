<%-- 
    Document   : mlr
    Created on : Jan 2, 2019, 4:18:08 PM
    Author     : Himansa
--%>

<%@page import="model.DbConnect"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
    <link rel="stylesheet" href="assets/css/Contact-Form-Clean.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>
<%
          

            Statement statement ;
            ResultSet resultSet ;
        %> 

<body>
    <nav class="navbar navbar-light navbar-expand-md">
        <div class="container-fluid"><a class="navbar-brand brnlog" href="#"><img src="assets/img/favicon.png" data-bs-hover-animate="shake" style="height:44px;">&nbsp;<strong>Forensic Report Management System</strong></a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="#">Home</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="#">View&nbsp;<i class="fa fa-angle-down"></i></a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="#">User name&nbsp;<i class="fa fa-user-circle-o"></i>&nbsp;<i class="fa fa-angle-down"></i></a></li>
                </ul>
        </div>
        </div>
    </nav>
    <div style="margin-top:29px;"></div> <!--part one-->
    <div class="contact-clean">
        <form method="post" action="${pageContext.request.contextPath}/MLRController" style="width:600px;">
            <h2 class="text-center">MEDICO LEGAL REPORT</h2>
            <h6 class="text-left">Serial No :-</h6>
            <div class="form-group"><input class="form-control" type="text" name="snum" placeholder="Name" style="margin:0px 0px 5px 0px;">
                <h6 class="text-left">Medico Legal Form No. :-</h6><input class="form-control" type="text" name="fnum" placeholder="">
                <h6 class="text-left">Magistrate's Court :-</h6><input class="form-control" type="text" name="court" placeholder="">
                <h6 class="text-left">Date of Issue :-</h6><input class="form-control" type="date" name="doi" placeholder="">
                <h6 class="text-left">Case No.:-</h6><input class="form-control" type="text" name="cnum" placeholder="">
                <h6 class="text-left">Police Station :-</h6><input class="form-control" type="text" name="station" placeholder="">
                <h6 class="text-left">Date of Trial:-</h6><input class="form-control" type="date" name="dot" placeholder=""></div>
            <div class="form-group"><small class="form-text text-danger"></small></div>
        
        
            <h5 class="text-left">(A) IDENTIFICATION</h5> <!--part two-->
            <h6 class="text-left">Full Name :-</h6>
            <div class="form-group"><input class="form-control" type="text" name="name" required placeholder="" style="margin:0px 0px 5px 0px;">
                <h6 class="text-left">Age :-</h6><input class="form-control" type="text" name="age" placeholder="">
                <h6 class="text-left">Sex :-</h6><input class="form-control" type="text" name="sex" placeholder="">
                <h6 class="text-left">Address :-</h6><input class="form-control" type="text" name="addr" placeholder="">
                <h6 class="text-left">Place of examination :-</h6><input class="form-control" type="text" name="place" placeholder="">
                <h6 class="text-left">Date :-</h6><input class="form-control" type="date" name="doe" placeholder="">
                <h6 class="text-left">Date of Admission to Hospital :-</h6><input class="form-control" type="date" name="doa" placeholder="">
                <h6 class="text-left">Time :-</h6><input class="form-control" type="time" name="toa" placeholder="">
                <h6 class="text-left">Date of Discharge :-</h6><input class="form-control" type="date" name="dod" placeholder="">
                <h6 class="text-left">Bead Head Ticket No. :-</h6>
            </div><input class="form-control" type="text" name="bnum" placeholder="">
            <div class="form-group"><small class="form-text text-danger"></small></div>
        
          
            <h5 class="text-left">(B) SHORT HISTORY GIVEN BY PATIENT</h5>
            <h6 class="text-left">Short History Given By Patient :-</h6>
            <div class="form-group"><textarea class="form-control" rows="14" name="short"></textarea></div>
            <div class="form-group"><small class="form-text text-danger"></small></div>
        
        
            <h5 class="text-left">(C) INJURIES</h5>
            <h6 class="text-left">Injuries :-</h6>
            <div class="form-group"><textarea class="form-control" rows="14" name="inj"></textarea>
                <h6 class="text-left">Special Investigations (X-rays ,etc. ) :-</h6><input class="form-control" type="text" name="spin" placeholder=""></div>
            <h6 class="text-left">Injuries:-</h6>
            <div class="form-group"><small class="form-text text-danger"></small></div>
            <div class="table-responsive">
                <table class="table">
                    
                        <tr>
                            <th>No.</th>
                            <th>Nature, Size, Shape, Disposition &amp; Site of Injury</th>
                        </tr>
                        
                   
                    
                    
                    <%
                        try {int a = 1;
                        Connection connection;
                            connection = DbConnect.dbConnect();
                            statement = connection.createStatement();
                            String sql = "SELECT bodyHarmType FROM mlefbodyharm WHERE mlefid='8'";
                            resultSet = statement.executeQuery(sql);
                            while (resultSet.next()) {%>
                        <tr>
                            <td><input class="form-control inj" type="text" name="inj1"  value="<%= a %>"></td>
                            <td><input class="form-control inj" type="text" name="desc1" value="<%= resultSet.getString(1)%>" /></td>
                        </tr>
                        <%      a++;
                                resultSet.getString(1);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>
                        
                                          
                   
                </table>
            </div>
        
        
            <h5 class="text-left">(D) OPINION</h5> <!--part three-->
            <h6 class="text-left"></h6>
            <div class="form-group">
                <h6 class="text-left">Non-Grevious Injuries (Nos.) :-</h6><input class="form-control" type="text" name="nginj" placeholder=""></div>
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th>Grievous Injuries (Nos.)</th>
                            <th>Limb Under Section 311 of Penal Code&nbsp;</th>
                            <th>Explanatory Remarks if Any</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><input class="form-control ginj" type="text" name="ginj1" /></td>
                            <td><input class="form-control ginj" type="text" name="lus1" /></td>
                            <td><input class="form-control ginj" type="text" name="rem1" /></td>
                        </tr>
                        <tr>
                            <td><input class="form-control ginj" type="text" name="ginj2" /></td>
                            <td><input class="form-control ginj" type="text" name="lus2" /></td>
                            <td><input class="form-control ginj" type="text" name="rem2" /></td>
                        </tr>
                        <tr>
                            <td><input class="form-control ginj" type="text" name="ginj3" /></td>
                            <td><input class="form-control ginj" type="text" name="lus3" /></td>
                            <td><input class="form-control ginj" type="text" name="rem3" /></td>
                        </tr>
                        <tr>
                            <td><input class="form-control ginj" type="text" name="ginj4" /></td>
                            <td><input class="form-control ginj" type="text" name="lus4" /></td>
                            <td><input class="form-control ginj" type="text" name="rem4" /></td>
                        </tr>
                        <tr>
                            <td><input class="form-control ginj" type="text" name="ginj5" /></td>
                            <td><input class="form-control ginj" type="text" name="lus5" /></td>
                            <td><input class="form-control ginj" type="text" name="rem5" /></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <h6 class="text-left">Injuries Sufficient In The Course of Nature to Cause Death (Nos.) :-</h6>
            <div class="form-group"><small class="form-text text-danger"></small></div><input class="form-control" type="text" name="iscncd" placeholder="">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr></tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
        
        
            <h5 class="text-left">(D) INJURIES CAUSED BY</h5> <!--part five-->
            <h6 class="text-left"></h6>
            <div class="form-group">
                <h6 class="text-left">(a)Blunt Weapon (Nos.) :-</h6><input class="form-control" type="text" name="bwpn" placeholder=""></div>
            <h6 class="text-left">Cut(Nos.) :-</h6><input class="form-control" type="text" name="bcut" placeholder="">
            <h6 class="text-left">(b)Sharp Cutting Instrument :-</h6><input class="form-control" type="text" name="shrpint" placeholder="">
            <h6 class="text-left">Stab(Nos):-</h6><input class="form-control" type="text" name="shrpstb" placeholder="">
            <h6 class="text-left">(c)Firearms (Nos.):-</h6><input class="form-control" type="text" name="firearms" placeholder="">
            <h6 class="text-left">(d)Burns (Nos.):-</h6><input class="form-control" type="text" name="burns" placeholder="">
            <h6 class="text-left">(e)Bites (Nos.):-</h6><input class="form-control" type="text" name="bites" placeholder="">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr></tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
        
        
            <h5 class="text-left">(E) Liquor&nbsp;</h5> <!--part six-->
            <h6 class="text-left"></h6>
            <div class="form-group">
                <h6 class="text-left">(a)Patient Smelling of liquor :-</h6><input class="form-control" type="text" name="smell" placeholder=""></div>
            <h6 class="text-left">(b)Under Influence of liquor :-</h6><input class="form-control" type="text" name="infl" placeholder="">
        
            <h5 class="text-left">(E) Doctor's Details</h5>
            <h6 class="text-left"></h6>
            <div class="form-group">
                <h6 class="text-left">(a)Name of the medical officer &amp; qualifications :-</h6><input class="form-control" type="text" name="nod" placeholder="Name"></div>
            <h6 class="text-left">(b)Designation :-</h6><input class="form-control" type="text" name="des" placeholder="">
            <h6 class="text-left">(c)Date :-</h6><input class="form-control" name="dor" type="date">
            <h6 class="text-left">(c)District :-</h6><!--<input  class="form-control" name="dor" type="date">-->
            <select input type="text" name="District">
                <option>Colombo</option>
                <option>Galle</option>
                <option>Kandy</option>
                
            </select>
            <h6 class="text-left">(c)Date :-</h6><input class="form-control" name="dor" type="date">
            <input type="submit" value="Submit">
    </form>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>


</html>
