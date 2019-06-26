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
public class Forgot extends HttpServlet {

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
       
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String security_q = request.getParameter("security_q");
        String ans= request.getParameter("answer");
        String password = request.getParameter("password");
        
         Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        
       // Searching function ar kaj korsi 
        try {
             conn = JavaConnect.ConnecrDb();
       
             String query = "select * from account where Username ='" + username + "' ";

            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                // jodi username correct hoi 
                name= "name" ;
//                name.setText(rs.getString(2));
//                jTextField3.setText(rs.getString(4));
                security_q ="security_q" ;
                 rs.close();
                pst.close();

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username");
            }

        } catch (Exception e) {
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
