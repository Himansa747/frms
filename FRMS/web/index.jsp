<%-- 
    Document   : index
    Created on : 15-Sep-2018, 21:03:19
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
        <h1>Hello World!</h1>


        <form action="validate" method="post">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"/></td>
                    <td><input type="reset" name="Clear All"/></td>
                </tr>
            </table>
        </form>
        
        <%out.println(session.getId());%>
        
        <%LoginValidator.sessionID = session.getId();%>
        
        
    </body>
</html>
