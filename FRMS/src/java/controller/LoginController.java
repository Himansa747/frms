/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DbConnect;
import model.LoginValidator;

/**
 *
 * @author Lahiru Chandima
 */
public class LoginController extends HttpServlet {

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
//            out.println("<title>Servlet LoginController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
        
        String uName = request.getParameter("username");
        String pass = request.getParameter("password");
        
//        PrintWriter out = response.getWriter();
//        out.println(uName);
//        out.println(pass);
////        
        LoginValidator lg = new LoginValidator();
         out.println(lg.lgValidator(uName, pass));
         
         
          out.println(LoginValidator.userAccountType);
         
//         
//         
//        
//        
        if(lg.lgValidator(uName, pass)){
            
            if (LoginValidator.userAccountType.equals("CJMO")){
                request.getRequestDispatcher("SuccessCJMO.jsp").forward(request, response);
                
            }
            else if( LoginValidator.userAccountType.equals("AJMO")){
                 request.getRequestDispatcher("SuccessAJMO.jsp").forward(request, response);
            }
            
             else if( LoginValidator.userAccountType.equals("HPLO")){
                 request.getRequestDispatcher("Police.jsp").forward(request, response);
            }
            //LoginValidator.userAccountType;
            //out.println(LoginValidator.userAccountType);
        }
        else{
            response.sendRedirect("Failure.jsp");
           out.println("Unsuccessull");
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
