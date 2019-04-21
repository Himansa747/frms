package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Control Panel</title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style1.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/form.css\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body onload=\"startTime()\">\n");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"center\">\n");
      out.write("\n");
      out.write("                <div type=\"text\" disabled=\"\" class=\"warnButton1\"  style=\"float: right;\" id=\"clockText\" ></div>\n");
      out.write("                <a href=\"\"><button class=\"warnButton\"  style=\"float: right;\">Logout</button></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button class=\"activeButton\" onclick=\"document.getElementById('idForm').style.display = 'block'\" style=\"float: right;\">Login</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label id='helloLabel' >Hello \n");
      out.write("\n");
      out.write("\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("                <a href=\"\"><button class=\"warnButton\"  style=\"float: right;background-color:#9db4b7;\">Admin Home</button></a>\n");
      out.write("                <a href=\"\"><button class=\"warnButton\"  style=\"float: right;background-color:#c60084;\">FRMS Home</button></a>\n");
      out.write("\n");
      out.write("                <table  id=\"cnLeftTable\">\n");
      out.write("                    <caption> <h2 style=\"color: #ffe6e6;font-size: 45px;margin-top: -40px;\"><br/>Welcome to the admin Page of FRMS</h2></caption>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/register.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    View <br/>Register\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"Add Users/AddUsers.jsp\">\n");
      out.write("                                    <img src=\"../images/addAdministrator.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    Add <br/>User\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/removeAdmin.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    Remove<br/> User\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"View User Details/ViewUsers.jsp\">\n");
      out.write("                                    <img src=\"../images/user.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    User<br/> Details\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/mlef.png\" class=\"tableImage\"> \n");
      out.write("                                    <br/>\n");
      out.write("                                    Add<br/> MLEF\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"../images/mlrCourt.png\" class=\"tableImage\">\n");
      out.write("                                <br/>\n");
      out.write("                                <a href=\"\">Create <br/> MLR</a>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/validate.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    Validate<br/> Reports\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"../Reports/Postmortem Report/Postmortem.jsp\">\n");
      out.write("                                    <img src=\"../images/autopsy.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    Add <br/> PM Report\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/report.png\" class=\"tableImage\">\n");
      out.write("\n");
      out.write("                                    <br/>Analyse<br/> Reports\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/search.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    View <br> Reports<br/>\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/adminDetails.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    Admin <br/>Details\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"../images/meter.png\" class=\"tableImage\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    System <br/>Usage\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"idForm\" class=\"model\">\n");
      out.write("            <center>\n");
      out.write("                <form action=\"login.php\" class=\"model-content animate\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"imgct\">\n");
      out.write("                        <span onclick=\"document.getElementById('idForm').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("                        <img src=\"../images/loginAvatar.png\" class=\"avatar\" width=\"20%\" height=\"20%\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"fromContainer\">\n");
      out.write("                        <br/>\n");
      out.write("                        <b>Username</b>\n");
      out.write("                        <input type=\"text\" name=\"uName\" required placeholder=\"Enter username\">\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <b>Password</b>\n");
      out.write("                        <input type=\"password\" name=\"psw\" required placeholder=\"Enter username\">\n");
      out.write("                        <br/>\n");
      out.write("                        <button type=\"submit\" class=\"activeButton\">Login</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            var model = document.getElementById(\"idForm\");\n");
      out.write("\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target == model) {\n");
      out.write("                    model.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> ");
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
