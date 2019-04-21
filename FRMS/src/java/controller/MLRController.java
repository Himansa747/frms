/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MLR;

/**
 *
 * @author Himansa
 */
public class MLRController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet MLRController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet MLRController at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String Serial_no = request.getParameter("snum");
        String Form_num = request.getParameter("fnum");
        String Court = request.getParameter("court");
        String Date_of_Issue = request.getParameter("doi");
        String Case_num = request.getParameter("cnum");
        String Station = request.getParameter("station");
        String Date_of_Trial = request.getParameter("dot");

        String Name = request.getParameter("name");
        String Age = request.getParameter("age");
        String Sex = request.getParameter("sex");
        String Address = request.getParameter("addr");
        String Place_of_examination = request.getParameter("place");
        String Date_of_examination = request.getParameter("doe");
        String Date_of_addmission = request.getParameter("doa");
        String Time_of_admission = request.getParameter("toa");
        String Date_of_discharge = request.getParameter("dod");
        String Beadhead_num = request.getParameter("bnum");
        String Short_history = request.getParameter("short");
        String Injuries = request.getParameter("inj");
        String Spcl_invst = request.getParameter("spin");
////        
//        String inj1 = request.getParameter("inj1");
//        String inj2 = request.getParameter("inj2");
//        String inj3 = request.getParameter("inj3");
//        String inj4 = request.getParameter("inj4");
//        String desc1 = request.getParameter("desc1");
//        String desc2 = request.getParameter("desc2");
//        String desc3 = request.getParameter("desc3");
//        String desc4 = request.getParameter("desc4");
//        
        String Ginj1 = request.getParameter("ginj1");
        String Lus1 = request.getParameter("lus1");
        String Rem1 = request.getParameter("rem1");
        String Ginj2 = request.getParameter("ginj2");
        String Lus2 = request.getParameter("lus2");
        String Rem2 = request.getParameter("rem2");
        String Ginj3 = request.getParameter("ginj3");
        String Lus3 = request.getParameter("lus3");
        String Rem3 = request.getParameter("rem3");
        String Ginj4 = request.getParameter("ginj4");
        String Lus4 = request.getParameter("lus4");
        String Rem4 = request.getParameter("rem4");
        String Ginj5 = request.getParameter("ginj5");
        String Lus5 = request.getParameter("lus5");
        String Rem5 = request.getParameter("rem5");
//        
//        
        String Injuries_suff = request.getParameter("iscncd");
        String non_grv = request.getParameter("nginj");
////        
        String Blunt_wpn = request.getParameter("bwpn");
        String Blunt_cut = request.getParameter("bcut");
        String Shrp_wpn = request.getParameter("shrpint");
        String Shrp_stb = request.getParameter("shrpstb");
        String Firearms = request.getParameter("firearms");
        String Burns = request.getParameter("burns");
        String Bites = request.getParameter("bwpn");
        
        String Smelling_liquor = request.getParameter("smell");
        String Infl_liquor = request.getParameter("infl");
        
        String Name_of_Doctor = request.getParameter("nod");
        String Designation = request.getParameter("des");
        String Date_of_report = request.getParameter("dor");
        String District = request.getParameter("District");
        
        
       
        
        PrintWriter out = response.getWriter();
        out.println("Success");
       
        MLR.addMLR( Serial_no ,  Form_num,Court,Date_of_Issue,Case_num,Station,Date_of_Trial,Name,Age,Sex,Address,Place_of_examination,Date_of_examination,Date_of_addmission,Time_of_admission,Date_of_discharge,Beadhead_num,Short_history,Injuries,Spcl_invst,Ginj1,Lus1,Rem1,Ginj2,Lus2,Rem2,Ginj3,Lus3,Rem3,Ginj4,Lus4,Rem4,Ginj5,Lus5,Rem5,Injuries_suff,non_grv,Blunt_wpn,Blunt_cut,Shrp_wpn,Shrp_stb,Firearms,Burns,Bites,Smelling_liquor,Infl_liquor,Name_of_Doctor,Designation,Date_of_report,District);
        // Date_of_Issue, Case_num, Station, Date_of_Trial,Name, Age, Sex , Address, Place_of_examination,Date_of_examination,Date_of_addmission,Time_of_admission,Date_of_discharge,Beadhead_num,Short_history,Injuries,Spcl_invst,Injuries_suff,non_grv,Blunt_wpn,Blunt_cut,Shrp_wpn,Shrp_stb,Firearms,Burns,Bites,Smelling_liquor,Infl_liquor,Name_of_Doctor,Designation,Date_of_report);
//        MLR.addMLR2(inj1, inj2, inj3, inj4, desc1, desc2, desc3, desc4);
        
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
