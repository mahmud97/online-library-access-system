/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author mahmud97
 */
public class AddNewStident extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         
        }
    }

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
        processRequest(request, response);
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
        int s_id = Integer.valueOf(request.getParameter("s_id"));
        String s_name = request.getParameter("s_name");
        String department = request.getParameter("department");
        int year = Integer.valueOf(request.getParameter("year"));
        int semester = Integer.valueOf(request.getParameter("semester"));
        
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        
        
        
         
        try{
              conn = JavaConnect.ConnecrDb();
               String query = "Insert into Student(Student_ID,Name,Department,Year,Semester) values(?,?,?,?,?)";
        
          
            pst = conn.prepareStatement(query);
            pst.setInt(1, s_id);
            pst.setString(2,s_name);
            pst.setString(3, department);
            pst.setInt(4, year);
            pst.setInt(5, semester);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "New Student Registered");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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
