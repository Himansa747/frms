package org.apache.jsp.Reports.Postmoretem_0020Report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Postmortem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Post-Mortem Report</title>\n");
      out.write("\n");
      out.write("        <!--    <link href=\"./styles/mainstyle.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("            <link href=\"./styles/style.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/style1.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>-->\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background-image:url(../admin/Images/backgroundImage.jpg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #regForm {\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                margin: 100px auto;\n");
      out.write("                font-family: Raleway;\n");
      out.write("                padding: 40px;\n");
      out.write("                width: 70%;\n");
      out.write("                min-width: 300px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;  \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                font-size: 17px;\n");
      out.write("                font-family: Raleway;\n");
      out.write("                border: 1px solid #aaaaaa;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Mark input boxes that gets an error on validation: */\n");
      out.write("            input.invalid {\n");
      out.write("                background-color: #ffdddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Hide all steps by default:*/ \n");
      out.write("            .tab {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                background-color: #1a6d6c;\n");
      out.write("                color: #434244;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                font-family: Raleway;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover {\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #prevBtn {\n");
      out.write("                background-color: #3cd1cf;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Make circles that indicate the steps of the form: */\n");
      out.write("            .step {\n");
      out.write("                height: 15px;\n");
      out.write("                width: 15px;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                background-color: #e2467d;\n");
      out.write("                border: none;  \n");
      out.write("                border-radius: 50%;\n");
      out.write("                display: inline-block;\n");
      out.write("                opacity: 0.5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .step.active {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Mark the steps that are finished and valid: */\n");
      out.write("            .step.finish {\n");
      out.write("                background-color: #f26d9b;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body onload=\"startTime()\">\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"admin/Images/FRMS.png\" style=\"height:100px;width:250px;\"> \n");
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
      out.write("        </div><hr>\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <form id=\"regForm\" action=\"PM_Report\" method=\"POST\">\n");
      out.write("            <h1>POST-MORTEM REPORT</h1>\n");
      out.write("            <!-- One \"tab\" for each step in the form: -->\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <b>SR No:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"SR No...\"  name=\"Num\"></p>\n");
      out.write("\n");
      out.write("                <b>Police:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Police Station Name...\"  name=\"police\"></p>\n");
      out.write("\n");
      out.write("                <b>Investigating Officer:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Officer Name...\"  name=\"officer\"></p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tab\">\n");
      out.write("\n");
      out.write("                <b>INQUEST No.:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"INQUEST No.\"  name=\"inquest\"></p>\n");
      out.write("\n");
      out.write("                <b>Place:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Place\"  name=\"place1\"></p>\n");
      out.write("\n");
      out.write("                <b>Court:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Court Name\"  name=\"court\"></p>\n");
      out.write("\n");
      out.write("                <b> Date:</b>\n");
      out.write("                <p><input type=\"date\" placeholder=\"\"  name=\"date_1\"></p>\n");
      out.write("\n");
      out.write("                <b> CASE No.:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Case No.\"  name=\"case\"></p>\n");
      out.write("\n");
      out.write("                <b> Name of Deceased Person:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Full Name\"  name=\"name1\"></p>\n");
      out.write("\n");
      out.write("                <b>Date and Time of Death (if known):</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Date & Time\"  name=\"time1\"></p>\n");
      out.write("\n");
      out.write("                <b>Name of Medical Officer who conducted the Post-Mortem Examination:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Doctor Name\"  name=\"d_name\"></p>\n");
      out.write("\n");
      out.write("                <b>  Date and Time of Post-Mortem Examination:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Date & Time\"  name=\"time2\"></p>\n");
      out.write("\n");
      out.write("                <b> Name and designation of the person who requested the Post-Mortem Examination:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Name\"  name=\"name2\"></p>\n");
      out.write("\n");
      out.write("                <b> District:</b>\n");
      out.write("                <p><select name=\"district\">\n");
      out.write("                        <option value=\"Ampara\">Ampara</option>\n");
      out.write("                        <option value=\"Anuradhapura\">Anuradhapura</option>\n");
      out.write("                        <option value=\"Badulla\">Badulla</option>\n");
      out.write("                        <option value=\"Batticaloa\">Batticaloa</option>\n");
      out.write("                        <option value=\"Colombo\">Colombo</option>\n");
      out.write("                        <option value=\"Galle\">Galle</option>\n");
      out.write("                        <option value=\"Gampaha\">Gampaha</option>\n");
      out.write("                        <option value=\"Hambantota\">Hambantota</option>\n");
      out.write("                        <option value=\"Jaffna\">Jaffna</option>\n");
      out.write("                        <option value=\"Kalutara\">Kalutara</option>\n");
      out.write("                        <option value=\"Kandy\">Kandy</option>\n");
      out.write("                        <option value=\"Kegalle\">Kegalle</option>\n");
      out.write("                        <option value=\"Kilinochchi\">Kilinochchi</option>\n");
      out.write("                        <option value=\"Kurunegala\">Kurunegala</option>\n");
      out.write("                        <option value=\"Mannar\">Mannar</option>\n");
      out.write("                        <option value=\"Matale\">Matale</option>\n");
      out.write("                        <option value=\"Matara\">Matara</option>\n");
      out.write("                        <option value=\"Moneragala\">Moneragala</option>\n");
      out.write("                        <option value=\"Mullaitivu\">Mullaitivu</option>\n");
      out.write("                        <option value=\"Nuwara Eliya\">Nuwara Eliya</option>\n");
      out.write("                        <option value=\"Polonnaruwa\">Polonnaruwa</option>\n");
      out.write("                        <option value=\"Puttalam\">Puttalam</option>\n");
      out.write("                        <option value=\"Ratnapura\">Ratnapura</option>\n");
      out.write("                        <option value=\"Trincomalee\">Trincomalee</option>\n");
      out.write("                        <option value=\"Vavuniya\">Vavuniya</option>\n");
      out.write("                    </select></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <b>Place of Examination:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Place\"  name=\"place2\"></p>\n");
      out.write("\n");
      out.write("                <b> Names and Address of Persons who identified the body:</b>\n");
      out.write("                <p><input type=\"text\" placeholder=\"Name & address\"  name=\"name3\"></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <b>1.Examination of the locus (Site and Position of body):</b>\n");
      out.write("                <p><textarea name=\"locus\" rows=\"20\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>2.External Examination of body (clothing, nourishment, colour, marks and product of disease etc.):</b>\n");
      out.write("                <p><textarea name=\"external\" rows=\"20\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <p><b>3.Injuries (inflicted before or after death)(Use continuation sheet, and Health 1135A if necessary)</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <b>4.Height (By measurement):</b>\n");
      out.write("                <p><textarea name=\"height\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>5.Age (estimated when relevent):</b>\n");
      out.write("                <p><textarea name=\"age\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>6.Sex:</b>\n");
      out.write("                <p><textarea name=\"sex\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>7.Eyes and pupils:</b>\n");
      out.write("                <p><textarea name=\"eyes\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>8.Length,colour and condion of hair:</b>\n");
      out.write("                <p><textarea name=\"hair\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>9.Position and condition of tongue:</b>\n");
      out.write("                <p><textarea name=\"tongue\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>10.Number of tooth (Complete,incomplete,peculiarities):</b>\n");
      out.write("                <p><textarea name=\"tooth\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <b>11.Sign of death (Record temperature where necessary):</b>\n");
      out.write("                <p><textarea name=\"sign_death\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><b>Primary flaccidity:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"flaccidity\"></p></li>\n");
      out.write("\n");
      out.write("                    <li><b>Rigor mortis:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"mortis\"></p></li>\n");
      out.write("\n");
      out.write("                    <li><b>Hypostasis:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"hypostasis\"></p></li>\n");
      out.write("\n");
      out.write("                    <li><b>Puterfaction:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"purterfaction\"></p></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <b>12.Condition and contenets of hand and nails:</b>\n");
      out.write("                <p><textarea name=\"condition\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <b>13.Natural openings (especially with refernce to presence of foreign substance,poisons,presence or absence of the signs of virginity and recent injury about the parts):</b>\n");
      out.write("                <p><textarea name=\"open\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><b>Nose,mouth and ears:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"nose\"></p></li>\n");
      out.write("\n");
      out.write("                    <li><b>Urinary and sexual:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"urinary\"></p></li>\n");
      out.write("\n");
      out.write("                    <li><b>Anal:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"anal\"></p></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <b>14.Neck:</b>\n");
      out.write("                <p><textarea name=\"neck\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <b>Soft tissues and blood vessels of neck,and cervical vartebrae (special attention to strangulation)::</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"neck1\"></p>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <b>15.Head:</b>\n");
      out.write("                <p><textarea name=\"head1\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <ol type=\"i\">\n");
      out.write("                    <li>\n");
      out.write("                        <b>Soft parts covering it:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"cover\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Bones of skull:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"skull\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Membranes and sinuses of brain:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"brain\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Brain substance and ventricles:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"brain1\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Blood vessels of brain:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"vessels\"></p>\n");
      out.write("                    </li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <b>16.Spain cord:</b>\n");
      out.write("                <p><textarea name=\"spain\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <b>17.Thorax:</b>\n");
      out.write("                <p><textarea name=\"thorax\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <ol type=\"i\">\n");
      out.write("                    <li>\n");
      out.write("                        <b>Soft parts covering it:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"cover1\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Bones (ribs,sternum,vertebrae):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"ribs\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Chest cavity (position of organs,contents of pleural cavities):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"chest\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Pericardium and its contents:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"peri\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Heart (cavities and contents,values myocardium):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"heart\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Coronary vessels:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"coro\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Large blood vessels:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"large\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Larynax,trachea and bronchi(condition and contents):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"larynax\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Pleura and Lungs:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"lungs\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Gullet:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"gull\"></p>\n");
      out.write("                    </li>\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <b>18.Abdomen:</b>\n");
      out.write("                <p><textarea name=\"abd\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <ol type=\"i\">\n");
      out.write("                    <li>\n");
      out.write("                        <b>Contents, vessels and position of organs:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"organs\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Peritoneum:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"perito\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Diaphragm:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"dia\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Liver and Gall Bladder:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"liver\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Spleen:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"spleen\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Stomach (condition and contents):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"stomach\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Duodenum,jegunum,ileum (condition and contents;where relevent passage of food):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"duod\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Large intestines(condition and contents):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"intes\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Pancreas:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"pancreas\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Kidneys:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"kidney\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Supra-renal glands:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"renal\"></p>\n");
      out.write("                    </li>\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <b>19.Pelvis:</b>\n");
      out.write("                <p><textarea name=\"pel\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("                <ol type=\"i\">\n");
      out.write("                    <li>\n");
      out.write("                        <b>Urinary bladder prostate (Condition and contents):</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"bladder\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Generative organs:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"gen\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Blood vessels:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"bv\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <b>Vertebrae and pelvic bones:</b>\n");
      out.write("                        <p><input type=\"text\" placeholder=\"\"  name=\"pelvic\"></p>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <b>20.Cause of death and other relevant opinions:</b>\n");
      out.write("                <p><textarea name=\"cause_r\" rows=\"10\" cols=\"100%\"></textarea></p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"overflow:auto;\">\n");
      out.write("            <div style=\"float:right;\">\n");
      out.write("                <button type=\"button\" id=\"prevBtn\" onclick=\"nextPrev(-1)\">Previous</button>\n");
      out.write("                <button type=\"button\" id=\"nextBtn\" onclick=\"nextPrev(1)\">Next</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Circles which indicates the steps of the form: -->\n");
      out.write("        <div style=\"text-align:center;margin-top:40px;\">\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("            <span class=\"step\"></span>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var currentTab = 0; // Current tab is set to be the first tab (0)\n");
      out.write("        showTab(currentTab); // Display the crurrent tab\n");
      out.write("\n");
      out.write("        function showTab(n) {\n");
      out.write("            // This function will display the specified tab of the form...\n");
      out.write("            var x = document.getElementsByClassName(\"tab\");\n");
      out.write("            x[n].style.display = \"block\";\n");
      out.write("            //... and fix the Previous/Next buttons:\n");
      out.write("            if (n == 0) {\n");
      out.write("                document.getElementById(\"prevBtn\").style.display = \"none\";\n");
      out.write("            } else {\n");
      out.write("                document.getElementById(\"prevBtn\").style.display = \"inline\";\n");
      out.write("            }\n");
      out.write("            if (n == (x.length - 1)) {\n");
      out.write("                document.getElementById(\"nextBtn\").innerHTML = \"Submit\";\n");
      out.write("            } else {\n");
      out.write("                document.getElementById(\"nextBtn\").innerHTML = \"Next\";\n");
      out.write("            }\n");
      out.write("            //... and run a function that will display the correct step indicator:\n");
      out.write("            fixStepIndicator(n)\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function nextPrev(n) {\n");
      out.write("            // This function will figure out which tab to display\n");
      out.write("            var x = document.getElementsByClassName(\"tab\");\n");
      out.write("            // Exit the function if any field in the current tab is invalid:\n");
      out.write("            if (n == 1 && !validateForm())\n");
      out.write("                return false;\n");
      out.write("            // Hide the current tab:\n");
      out.write("            x[currentTab].style.display = \"none\";\n");
      out.write("            // Increase or decrease the current tab by 1:\n");
      out.write("            currentTab = currentTab + n;\n");
      out.write("            // if you have reached the end of the form...\n");
      out.write("            if (currentTab >= x.length) {\n");
      out.write("                // ... the form gets submitted:\n");
      out.write("                document.getElementById(\"regForm\").submit();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            // Otherwise, display the correct tab:\n");
      out.write("            showTab(currentTab);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function validateForm() {\n");
      out.write("            // This function deals with validation of the form fields\n");
      out.write("            var x, y, i, valid = true;\n");
      out.write("            x = document.getElementsByClassName(\"tab\");\n");
      out.write("            y = x[currentTab].getElementsByTagName(\"input\");\n");
      out.write("            // A loop that checks every input field in the current tab:\n");
      out.write("            for (i = 0; i < y.length; i++) {\n");
      out.write("                // If a field is empty...\n");
      out.write("                if (y[i].value == \"\") {\n");
      out.write("                    // add an \"invalid\" class to the field:\n");
      out.write("                    y[i].className += \" invalid\";\n");
      out.write("                    // and set the current valid status to false\n");
      out.write("                    valid = false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            // If the valid status is true, mark the step as finished and valid:\n");
      out.write("            if (valid) {\n");
      out.write("                document.getElementsByClassName(\"step\")[currentTab].className += \" finish\";\n");
      out.write("            }\n");
      out.write("            return valid; // return the valid status\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function fixStepIndicator(n) {\n");
      out.write("            // This function removes the \"active\" class of all steps...\n");
      out.write("            var i, x = document.getElementsByClassName(\"step\");\n");
      out.write("            for (i = 0; i < x.length; i++) {\n");
      out.write("                x[i].className = x[i].className.replace(\" active\", \"\");\n");
      out.write("            }\n");
      out.write("            //... and adds the \"active\" class on the current step:\n");
      out.write("            x[n].className += \" active\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
