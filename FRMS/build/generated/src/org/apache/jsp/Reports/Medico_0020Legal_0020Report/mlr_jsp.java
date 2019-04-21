package org.apache.jsp.Reports.Medico_0020Legal_0020Report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DbConnect;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class mlr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>FRMS1</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Contact-Form-Clean.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("</head>\n");

          

            Statement statement ;
            ResultSet resultSet ;
        
      out.write(" \n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-light navbar-expand-md\">\n");
      out.write("        <div class=\"container-fluid\"><a class=\"navbar-brand brnlog\" href=\"#\"><img src=\"assets/img/favicon.png\" data-bs-hover-animate=\"shake\" style=\"height:44px;\">&nbsp;<strong>Forensic Report Management System</strong></a><button class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("            <div\n");
      out.write("                class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"#\">Home</a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"#\">View&nbsp;<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"#\">User name&nbsp;<i class=\"fa fa-user-circle-o\"></i>&nbsp;<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div style=\"margin-top:29px;\"></div> <!--part one-->\n");
      out.write("    <div class=\"contact-clean\">\n");
      out.write("        <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MLRController\" style=\"width:600px;\">\n");
      out.write("            <h2 class=\"text-center\">MEDICO LEGAL REPORT</h2>\n");
      out.write("            <h6 class=\"text-left\">Serial No :-</h6>\n");
      out.write("            <div class=\"form-group\"><input class=\"form-control\" type=\"text\" name=\"snum\" placeholder=\"Name\" style=\"margin:0px 0px 5px 0px;\">\n");
      out.write("                <h6 class=\"text-left\">Medico Legal Form No. :-</h6><input class=\"form-control\" type=\"text\" name=\"fnum\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Magistrate's Court :-</h6><input class=\"form-control\" type=\"text\" name=\"court\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Date of Issue :-</h6><input class=\"form-control\" type=\"date\" name=\"doi\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Case No.:-</h6><input class=\"form-control\" type=\"text\" name=\"cnum\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Police Station :-</h6><input class=\"form-control\" type=\"text\" name=\"station\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Date of Trial:-</h6><input class=\"form-control\" type=\"date\" name=\"dot\" placeholder=\"\"></div>\n");
      out.write("            <div class=\"form-group\"><small class=\"form-text text-danger\"></small></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <h5 class=\"text-left\">(A) IDENTIFICATION</h5> <!--part two-->\n");
      out.write("            <h6 class=\"text-left\">Full Name :-</h6>\n");
      out.write("            <div class=\"form-group\"><input class=\"form-control\" type=\"text\" name=\"name\" required placeholder=\"\" style=\"margin:0px 0px 5px 0px;\">\n");
      out.write("                <h6 class=\"text-left\">Age :-</h6><input class=\"form-control\" type=\"text\" name=\"age\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Sex :-</h6><input class=\"form-control\" type=\"text\" name=\"sex\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Address :-</h6><input class=\"form-control\" type=\"text\" name=\"addr\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Place of examination :-</h6><input class=\"form-control\" type=\"text\" name=\"place\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Date :-</h6><input class=\"form-control\" type=\"date\" name=\"doe\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Date of Admission to Hospital :-</h6><input class=\"form-control\" type=\"date\" name=\"doa\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Time :-</h6><input class=\"form-control\" type=\"time\" name=\"toa\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Date of Discharge :-</h6><input class=\"form-control\" type=\"date\" name=\"dod\" placeholder=\"\">\n");
      out.write("                <h6 class=\"text-left\">Bead Head Ticket No. :-</h6>\n");
      out.write("            </div><input class=\"form-control\" type=\"text\" name=\"bnum\" placeholder=\"\">\n");
      out.write("            <div class=\"form-group\"><small class=\"form-text text-danger\"></small></div>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("            <h5 class=\"text-left\">(B) SHORT HISTORY GIVEN BY PATIENT</h5>\n");
      out.write("            <h6 class=\"text-left\">Short History Given By Patient :-</h6>\n");
      out.write("            <div class=\"form-group\"><textarea class=\"form-control\" rows=\"14\" name=\"short\"></textarea></div>\n");
      out.write("            <div class=\"form-group\"><small class=\"form-text text-danger\"></small></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <h5 class=\"text-left\">(C) INJURIES</h5>\n");
      out.write("            <h6 class=\"text-left\">Injuries :-</h6>\n");
      out.write("            <div class=\"form-group\"><textarea class=\"form-control\" rows=\"14\" name=\"inj\"></textarea>\n");
      out.write("                <h6 class=\"text-left\">Special Investigations (X-rays ,etc. ) :-</h6><input class=\"form-control\" type=\"text\" name=\"spin\" placeholder=\"\"></div>\n");
      out.write("            <h6 class=\"text-left\">Injuries:-</h6>\n");
      out.write("            <div class=\"form-group\"><small class=\"form-text text-danger\"></small></div>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    \n");
      out.write("                        <tr>\n");
      out.write("                            <th>No.</th>\n");
      out.write("                            <th>Nature, Size, Shape, Disposition &amp; Site of Injury</th>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");

                        try {int a = 1;
                        Connection connection;
                            connection = DbConnect.dbConnect();
                            statement = connection.createStatement();
                            String sql = "SELECT bodyHarmType FROM mlefbodyharm WHERE mlefid='8'";
                            resultSet = statement.executeQuery(sql);
                            while (resultSet.next()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"form-control inj\" type=\"text\" name=\"inj1\"  value=\"");
      out.print( a );
      out.write("\"></td>\n");
      out.write("                            <td><input class=\"form-control inj\" type=\"text\" name=\"desc1\" value=\"");
      out.print( resultSet.getString(1));
      out.write("\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
      a++;
                                resultSet.getString(1);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    
      out.write("\n");
      out.write("                        \n");
      out.write("                                          \n");
      out.write("                   \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <h5 class=\"text-left\">(D) OPINION</h5> <!--part three-->\n");
      out.write("            <h6 class=\"text-left\"></h6>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <h6 class=\"text-left\">Non-Grevious Injuries (Nos.) :-</h6><input class=\"form-control\" type=\"text\" name=\"nginj\" placeholder=\"\"></div>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Grievous Injuries (Nos.)</th>\n");
      out.write("                            <th>Limb Under Section 311 of Penal Code&nbsp;</th>\n");
      out.write("                            <th>Explanatory Remarks if Any</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"ginj1\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"lus1\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"rem1\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"ginj2\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"lus2\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"rem2\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"ginj3\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"lus3\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"rem3\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"ginj4\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"lus4\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"rem4\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"ginj5\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"lus5\" /></td>\n");
      out.write("                            <td><input class=\"form-control ginj\" type=\"text\" name=\"rem5\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <h6 class=\"text-left\">Injuries Sufficient In The Course of Nature to Cause Death (Nos.) :-</h6>\n");
      out.write("            <div class=\"form-group\"><small class=\"form-text text-danger\"></small></div><input class=\"form-control\" type=\"text\" name=\"iscncd\" placeholder=\"\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr></tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody></tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <h5 class=\"text-left\">(D) INJURIES CAUSED BY</h5> <!--part five-->\n");
      out.write("            <h6 class=\"text-left\"></h6>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <h6 class=\"text-left\">(a)Blunt Weapon (Nos.) :-</h6><input class=\"form-control\" type=\"text\" name=\"bwpn\" placeholder=\"\"></div>\n");
      out.write("            <h6 class=\"text-left\">Cut(Nos.) :-</h6><input class=\"form-control\" type=\"text\" name=\"bcut\" placeholder=\"\">\n");
      out.write("            <h6 class=\"text-left\">(b)Sharp Cutting Instrument :-</h6><input class=\"form-control\" type=\"text\" name=\"shrpint\" placeholder=\"\">\n");
      out.write("            <h6 class=\"text-left\">Stab(Nos):-</h6><input class=\"form-control\" type=\"text\" name=\"shrpstb\" placeholder=\"\">\n");
      out.write("            <h6 class=\"text-left\">(c)Firearms (Nos.):-</h6><input class=\"form-control\" type=\"text\" name=\"firearms\" placeholder=\"\">\n");
      out.write("            <h6 class=\"text-left\">(d)Burns (Nos.):-</h6><input class=\"form-control\" type=\"text\" name=\"burns\" placeholder=\"\">\n");
      out.write("            <h6 class=\"text-left\">(e)Bites (Nos.):-</h6><input class=\"form-control\" type=\"text\" name=\"bites\" placeholder=\"\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr></tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody></tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <h5 class=\"text-left\">(E) Liquor&nbsp;</h5> <!--part six-->\n");
      out.write("            <h6 class=\"text-left\"></h6>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <h6 class=\"text-left\">(a)Patient Smelling of liquor :-</h6><input class=\"form-control\" type=\"text\" name=\"smell\" placeholder=\"\"></div>\n");
      out.write("            <h6 class=\"text-left\">(b)Under Influence of liquor :-</h6><input class=\"form-control\" type=\"text\" name=\"infl\" placeholder=\"\">\n");
      out.write("        \n");
      out.write("            <h5 class=\"text-left\">(E) Doctor's Details</h5>\n");
      out.write("            <h6 class=\"text-left\"></h6>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <h6 class=\"text-left\">(a)Name of the medical officer &amp; qualifications :-</h6><input class=\"form-control\" type=\"text\" name=\"nod\" placeholder=\"Name\"></div>\n");
      out.write("            <h6 class=\"text-left\">(b)Designation :-</h6><input class=\"form-control\" type=\"text\" name=\"des\" placeholder=\"\">\n");
      out.write("            <h6 class=\"text-left\">(c)Date :-</h6><input class=\"form-control\" name=\"dor\" type=\"date\">\n");
      out.write("            <h6 class=\"text-left\">(c)District :-</h6><!--<input  class=\"form-control\" name=\"dor\" type=\"date\">-->\n");
      out.write("            <select input type=\"text\" name=\"District\">\n");
      out.write("                <option>Colombo</option>\n");
      out.write("                <option>Galle</option>\n");
      out.write("                <option>Kandy</option>\n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("            <h6 class=\"text-left\">(c)Date :-</h6><input class=\"form-control\" name=\"dor\" type=\"date\">\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-animation.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
