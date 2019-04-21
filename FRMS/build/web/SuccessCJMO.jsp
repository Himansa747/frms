<%-- 
    Document   : Sucess
    Created on : 16-Sep-2018, 08:34:27
    Author     : Lahiru Chandima
--%>

<%@page import="model.LoginValidator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% out.println(session.getId());
         
//            if(session.getId() != LoginValidator.sessionID){
//                 request.getRequestDispatcher("index.jsp").forward(request, response);
//            }
         
         %>
         
        <h1>Successful CJMO Page</h1>
        
         
    </body>
</html>
