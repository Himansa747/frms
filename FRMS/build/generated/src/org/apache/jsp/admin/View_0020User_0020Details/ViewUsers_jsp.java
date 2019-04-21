package org.apache.jsp.admin.View_0020User_0020Details;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>View - Users</title>\n");
      out.write("        <link href=\"./styles/mainstyle.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("        <link href=\"./styles/style.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/style1.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/form.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
      out.write("                ;  // add zero in front of numbers < 10\n");
      out.write("                return i;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background-image:url(Images/backgroundImage.jpg)\"> \n");
      out.write("\n");
      out.write("    <body onload=\"startTime()\">\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"Images/FRMS.png\" style=\"height:100px;width:250px;\"> \n");
      out.write("            <font color=\"white\" size=\"5px\">\n");
      out.write("\n");
      out.write("            <div type=\"text\" disabled=\"\" class=\"warnButton1\"  style=\"float: right;\" id=\"clockText\" ></div>\n");
      out.write("            <a href=\"\"><button class=\"warnButton\"  style=\"float: right;\">Logout</button></a>\n");
      out.write("\n");
      out.write("            <button class=\"activeButton\" onclick=\"document.getElementById('idForm').style.display = 'block'\" style=\"float: right;\">Login</button>\n");
      out.write("\n");
      out.write("            <a href=\"\"><button class=\"warnButton\"  style=\"float: right;background-color:#9db4b7;\">Admin Home</button></a>\n");
      out.write("            <a href=\"\"><button class=\"warnButton\"  style=\"float: right;background-color:#c60084;\">FRMS Home</button></a>\n");
      out.write("            </font>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <center>\n");
      out.write("                <table  id=\"cnLeftTable\">\n");
      out.write("                    <thead><h2 style=\"color: #ffe6e6;font-size: 45px;margin-top: -40px;\"><br/>Select the User Type</h2></thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4\" style=\"border-style:groove;\"><br>\n");
      out.write("                            <a href=\"View_JMO.jsp\"><img src=\"Images/User.png\" width=\"200px\" height=\"200px\" class=\"img-rounded\">\n");
      out.write("                                <h4 style=\"color: #ffe6e6;\">Judicial Medical<br>Officer</h4></a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-4\" style=\"border-style:groove;\"><br>\n");
      out.write("                            <a href=\"View_police.jsp\"><img src=\"Images/police.png\" width=\"200px\" height=\"200px\" class=\"img-rounded\">\n");
      out.write("                                <h4 style=\"color: #ffe6e6;\">Hopital Police<br>Officer</h4></a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-4\" style=\"border-style:groove\"><br>\n");
      out.write("                            <a href=\"View_Registrar.jsp\"><img src=\"Images/registrar.png\" width=\"200px\" height=\"200px\" class=\"img-rounded\">\n");
      out.write("                                <h4 style=\"color: #ffe6e6;\">Registrar</h4></a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        </tbody>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </div>");
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
