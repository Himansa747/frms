package org.apache.jsp.AJMO;

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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>FRMS1</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-light navbar-expand-md\">\n");
      out.write("        <div class=\"container-fluid\"><a class=\"navbar-brand brnlog\" href=\"#\"><img src=\"assets/img/favicon.png\" data-bs-hover-animate=\"shake\" style=\"height:44px;\">&nbsp;Forensic Report Management System</a><button class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("            <div\n");
      out.write("                class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"#\">Home</a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"#\">View&nbsp;<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("                    <li class=\"dropdown\"><a class=\"dropdown-toggle nav-link dropdown-toggle user\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">User name&nbsp;<i class=\"fa fa-user-circle-o\"></i> </a>\n");
      out.write("                        <div class=\"dropdown-menu\" role=\"menu\"><a class=\"dropdown-item\" role=\"presentation\" href=\"#\">Settings</a><a class=\"dropdown-item\" role=\"presentation\" href=\"#\">Logout</a></div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div style=\"margin-top:29px;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" style=\"margin-top:60px;\">\n");
      out.write("                <div class=\"col align-content-center\" style=\"height:180px;text-align:center;/*box-sizing:border-box;*//*display:block;*/margin-right:3rem;margin-left:2rem;padding:5%;padding-right:0;padding-left:0;\"><button class=\"btn btn-primary onebtn\" type=\"button\" >Create MLEF</button></div>\n");
      out.write("                <div class=\"col\" style=\"margin-right:3rem;margin-left:3rem;padding:5%;padding-right:0;padding-left:0;\"><button class=\"btn btn-primary onebtn\" type=\"button\" >Create PM</button></div>\n");
      out.write("                <div class=\"col\" style=\"margin-right:3rem;margin-left:3rem;padding:5%;padding-right:0;padding-left:0;\"><button class=\"btn btn-primary onebtn\" type=\"button\" >Create MLR</button></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <section style=\"margin-top:50px;\">\n");
      out.write("        <div class=\"table-container\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead class=\"justify-content-center align-items-center align-content-center flex-nowrap\" style=\"font-family:Poppins, sans-serif;\">\n");
      out.write("                        <tr style=\"background-color:#000000;color:#fff;font-weight:400;\">\n");
      out.write("                            <th>SR Number</th>\n");
      out.write("                            <th>Date</th>\n");
      out.write("                            <th>Police Area</th>\n");
      out.write("                            <th>MLEF Number</th>\n");
      out.write("                            <th>Date of issue (MLEF)</th>\n");
      out.write("                            <th>Date of Examination</th>\n");
      out.write("                            <th>Circumstance</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>01</td>\n");
      out.write("                            <td>2018.08.08</td>\n");
      out.write("                            <td>Cinnamon Gardens</td>\n");
      out.write("                            <td>EGQ982HY1</td>\n");
      out.write("                            <td>2017.01.6</td>\n");
      out.write("                            <td>2017.01.4</td>\n");
      out.write("                            <td>Natural</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>01</td>\n");
      out.write("                            <td>2018.08.08</td>\n");
      out.write("                            <td>Cinnamon Gardens</td>\n");
      out.write("                            <td>EGQ982HY1</td>\n");
      out.write("                            <td>2017.01.6</td>\n");
      out.write("                            <td>2017.01.4</td>\n");
      out.write("                            <td>Natural</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           <td>01</td>\n");
      out.write("                            <td>2018.08.08</td>\n");
      out.write("                            <td>Cinnamon Gardens</td>\n");
      out.write("                            <td>EGQ982HY1</td>\n");
      out.write("                            <td>2017.01.6</td>\n");
      out.write("                            <td>2017.01.4</td>\n");
      out.write("                            <td>Natural</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>01</td>\n");
      out.write("                            <td>2018.08.08</td>\n");
      out.write("                            <td>Cinnamon Gardens</td>\n");
      out.write("                            <td>EGQ982HY1</td>\n");
      out.write("                            <td>2017.01.6</td>\n");
      out.write("                            <td>2017.01.4</td>\n");
      out.write("                            <td>Natural</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>01</td>\n");
      out.write("                            <td>2018.08.08</td>\n");
      out.write("                            <td>Cinnamon Gardens</td>\n");
      out.write("                            <td>EGQ982HY1</td>\n");
      out.write("                            <td>2017.01.6</td>\n");
      out.write("                            <td>2017.01.4</td>\n");
      out.write("                            <td>Natural</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>01</td>\n");
      out.write("                            <td>2018.08.08</td>\n");
      out.write("                            <td>Cinnamon Gardens</td>\n");
      out.write("                            <td>EGQ982HY1</td>\n");
      out.write("                            <td>2017.01.6</td>\n");
      out.write("                            <td>2017.01.4</td>\n");
      out.write("                            <td>Natural</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>01</td>\n");
      out.write("                            <td>2018.08.08</td>\n");
      out.write("                            <td>Cinnamon Gardens</td>\n");
      out.write("                            <td>EGQ982HY1</td>\n");
      out.write("                            <td>2017.01.6</td>\n");
      out.write("                            <td>2017.01.4</td>\n");
      out.write("                            <td>Natural</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-animation.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
