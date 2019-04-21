package org.apache.jsp.Reports.Medico_0020Legal_0020Report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DbConnect;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class mlrsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>View - MLR Reports</title>\n");
      out.write("        <link href=\"./styles/mainstyle.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("        <link href=\"./styles/style.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/style1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        ");

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
        
      out.write(" \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function startTime() {\n");
      out.write("                var today = new Date();\n");
      out.write("                var h = today.getHours();\n");
      out.write("                var m = today.getMinutes();\n");
      out.write("                var s = today.getSeconds();\n");
      out.write("                m = checkTime(m);\n");
      out.write("                s = checkTime(s);\n");
      out.write("                document.getElementById('clockText').innerHTML =\n");
      out.write("                        h + \":\" + m + \":\" + s;\n");
      out.write("                var t = setTimeout(startTime, 500);\n");
      out.write("            }\n");
      out.write("            function checkTime(i) {\n");
      out.write("                if (i < 10) {\n");
      out.write("                    i = \"0\" + i\n");
      out.write("                }\n");
      out.write("                ; // add zero in front of numbers < 10\n");
      out.write("                return i;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background-image:url(backgroundImage.jpg)\"> \n");
      out.write("\n");
      out.write("    <body onload=\"startTime()\">\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"FRMS.png\" style=\"height:100px;width:250px;\"> \n");
      out.write("            <font color=\"white\" size=\"5px\">\n");
      out.write("\n");
      out.write("            <div type=\"text\" disabled=\"\" class=\"warnButton1\"  style=\"float: right;\" id=\"clockText\" ></div>\n");
      out.write("            <a href=\"\"><button class=\"warnButton\"  style=\"float: right;\">Logout</button></a>\n");
      out.write("\n");
      out.write("<!--            <button class=\"activeButton\" onclick=\"document.getElementById('idForm').style.display = 'block'\" style=\"float: right;\">Login</button>-->\n");
      out.write("\n");
      out.write("            <a href=\"../index.jsp\"><button class=\"warnButton\"  style=\"float: right;background-color:#9db4b7;\">Admin Home</button></a>\n");
      out.write("            <a href=\"\"><button class=\"warnButton\"  style=\"float: right;background-color:#c60084;\">FRMS Home</button></a>\n");
      out.write("            </font>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <font color=\"white\" size=\"4px\">\n");
      out.write("            <h2 align=\"center\"><font><strong>MLR Reports Details</strong></font></h2><br>\n");
      out.write("\n");
      out.write("            <form align=\"center\" action=\"view.jsp\">\n");
      out.write("                <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for Serial Number:-\" name=\"number\">\n");
      out.write("                <button type=\"submit\">View<i class=\"fa fa-search\"></i></button>\n");
      out.write("            </form><br>\n");
      out.write("\n");
      out.write("            <table align=\"center\" cellpadding=\"15\" cellspacing=\"5\" border=\"1\"  width = \"90%\" id=\"myTable\">\n");
      out.write("                <tr bgcolor=\"#5ba0d8\">\n");
      out.write("                    <td><b><center>Serial Number</center></b></td>\n");
      out.write("                    <td><b><center>Date of Issue</center></b></td>\n");
      out.write("                    <td><b><center>Magistrate Court</center></b></td>\n");
      out.write("                    <td><b><center>Case Number</center></b></td>\n");
      out.write("                    <td><b><center>Police Station</center></b></td>\n");
      out.write("                    <td><b><center>Date of Trial</center></b></td>\n");
      out.write("                    <td><b><center>Injuries</center></b></td>\n");
      out.write("                    \n");
      out.write("                </tr><br>\n");
      out.write("                ");

                    try {
                        connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
                        statement = connection.createStatement();
                        String sql = "SELECT S_no, Date_of_issue, Mgs_court, Case_no, Station, Date_of_trial , Injuries FROM mlrform ORDER BY Mgs_court DESC LIMIT 15";

                        resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                
      out.write("\n");
      out.write("                <tr bgcolor=\"#62a1b2\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(resultSet.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString(2));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString(3));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString(4));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString(5));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString(6));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString(7));
      out.write("</td>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    function myFunction() {\n");
      out.write("                        // Declare variables \n");
      out.write("                        var input, filter, table, tr, td, i, txtValue;\n");
      out.write("                        input = document.getElementById(\"myInput\");\n");
      out.write("                        filter = input.value.toUpperCase();\n");
      out.write("                        table = document.getElementById(\"myTable\");\n");
      out.write("                        tr = table.getElementsByTagName(\"tr\");\n");
      out.write("\n");
      out.write("                        // Loop through all table rows, and hide those who don't match the search query\n");
      out.write("                        for (i = 0; i < tr.length; i++) {\n");
      out.write("                            td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("                            if (td) {\n");
      out.write("                                txtValue = td.textContent || td.innerText;\n");
      out.write("                                if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                                    tr[i].style.display = \"\";\n");
      out.write("                                } else {\n");
      out.write("                                    tr[i].style.display = \"none\";\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
