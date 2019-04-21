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
import model.InsertPM;

/**
 *
 * @author TOSHIBA
 */
public class PM_Report extends HttpServlet {

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
//            out.println("<title>Servlet PM_Report</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet PM_Report at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
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

        String SR = request.getParameter("Num");
        String Police = request.getParameter("police");
        String Officer = request.getParameter("officer");

        String INQUEST = request.getParameter("inquest");
        String Place = request.getParameter("place1");
        String Court = request.getParameter("court");
        String Date = request.getParameter("date_1");
        String CASE_No = request.getParameter("case");
        String Name_of_Deceased = request.getParameter("name1");
        String Death_date = request.getParameter("time1");
        String Name_of_Medical = request.getParameter("d_name");
        String Examination_date = request.getParameter("time2");
        String Name_of_request = request.getParameter("name2");
        String District = request.getParameter("district");
        String Place_of_Exam = request.getParameter("place2");
        String Name_idendifier = request.getParameter("name3");

        String Examnination_locous = request.getParameter("locus");
        String External_Examination = request.getParameter("external");

        String Height = request.getParameter("height");
        String Age = request.getParameter("age");
        String Sex = request.getParameter("sex");
        String Eyes_pupils = request.getParameter("eyes");
        String Hair = request.getParameter("hair");
        String Tongue = request.getParameter("tongue");
        String Tooth = request.getParameter("tooth");
        String Sign = request.getParameter("sign_death");
        String Flaccidity = request.getParameter("flaccidity");
        String Rigor_mortis = request.getParameter("mortis");
        String Hypostasis = request.getParameter("hypostasis");
        String Puterfaction = request.getParameter("purterfaction");
        String Hand = request.getParameter("condition");

        String Openings = request.getParameter("open");
        String Nose = request.getParameter("nose");
        String Urinary = request.getParameter("urinary");
        String Anal = request.getParameter("anal");
        String Neck = request.getParameter("neck");
        String Soft_tissues = request.getParameter("neck1");
        String Head = request.getParameter("head1");
        String Soft_parts = request.getParameter("cover");
        String Skull = request.getParameter("skull");
        String Membranes = request.getParameter("brain");
        String Brain_substance = request.getParameter("brain1");
        String Blood_vasela_brain = request.getParameter("vessels");
        String Spain_cord = request.getParameter("spain");

        String Thorax = request.getParameter("thorax");
        String Soft_part_1 = request.getParameter("cover1");
        String Ribs = request.getParameter("ribs");
        String Chest = request.getParameter("chest");
        String Pericardium = request.getParameter("peri");
        String Heart = request.getParameter("heart");
        String Coronary_vessels = request.getParameter("coro");
        String Large_blood = request.getParameter("large");
        String Larynax = request.getParameter("larynax");
        String Pleura = request.getParameter("lungs");
        String Gullet = request.getParameter("gull");

        String Abdomen = request.getParameter("abd");
        String Organs = request.getParameter("organs");
        String Peritoneum = request.getParameter("perito");
        String Diaphragm = request.getParameter("dia");
        String Liver = request.getParameter("liver");
        String Spleen = request.getParameter("spleen");
        String Stomach = request.getParameter("stomach");
        String Duodenum = request.getParameter("duod");
        String Large_intenstines = request.getParameter("intes");
        String Pancreas = request.getParameter("pancreas");
        String Kidneys = request.getParameter("kidney");
        String Supra_renal_glands = request.getParameter("renal");

        String Pelvis = request.getParameter("pel");
        String Urinary_bladder = request.getParameter("bladder");
        String Generative_organs = request.getParameter("gen");
        String Blood_vessels = request.getParameter("bv");
        String Vertebrae = request.getParameter("pelvic");
        String Relevent_cause = request.getParameter("cause_r");
        PrintWriter out = response.getWriter();
        out.println("Sucessfully Created!");

//        InsertPM.addPM2(SR, Police, Officer, INQUEST, Place, Court, Date, CASE_No, Name_of_Deceased, Death_date, Name_of_Medical, Examination_date, Name_of_request, District, Place_of_Exam, Name_idendifier, Examnination_locous, External_Examination, Height, Age, Sex, Eyes_pupils, Hair, Tongue, Tooth, Sign, Flaccidity, Rigor_mortis, Hypostasis, Puterfaction, Hand, Openings, Nose, Urinary, Anal, Neck, Soft_tissues, Head, Soft_parts, Skull, Membranes, Brain_substance, Blood_vasela_brain, Spain_cord, Thorax, Soft_part_1, Ribs, Chest, Pericardium, Heart, Coronary_vessels, Large_blood, Larynax, Pleura, Gullet, Abdomen, Organs, Peritoneum, Diaphragm, Liver, Spleen, Stomach, Duodenum, Large_intenstines, Pancreas, Kidneys, Supra_renal_glands, Pelvis, Urinary_bladder, Generative_organs, Blood_vessels, Vertebrae, Relevent_cause);
        InsertPM.addPM2( SR ,  Police , Officer, INQUEST, Place, Court, Date, CASE_No, Name_of_Deceased, Death_date, Name_of_Medical, Examination_date , Name_of_request, District, Place_of_Exam , Name_idendifier , Examnination_locous , External_Examination, Height , Age , Sex , Eyes_pupils , Hair ,Tongue , Tooth , Sign , Flaccidity , Rigor_mortis , Hypostasis , Puterfaction , Hand , Openings , Nose , Urinary , Anal , Neck , Soft_tissues , Head , Soft_parts , Skull , Membranes ,Brain_substance , Blood_vasela_brain , Spain_cord, Thorax , Soft_part_1 , Ribs , Chest , Pericardium , Heart , Coronary_vessels , Large_blood , Larynax , Pleura , Gullet, Abdomen , Organs , Peritoneum , Diaphragm , Liver , Spleen , Stomach , Duodenum , Large_intenstines , Pancreas , Kidneys , Supra_renal_glands , Pelvis , Urinary_bladder , Generative_organs , Blood_vessels , Vertebrae , Relevent_cause);
    
        String btnString = request.getParameter("btnString");
        if(btnString != null){
            PrintWriter out1  = response.getWriter();
            out.println("Btn String");
        }
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
