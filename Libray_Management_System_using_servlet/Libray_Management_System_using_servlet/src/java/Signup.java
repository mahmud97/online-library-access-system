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
public class Signup extends HttpServlet {

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
   //     processRequest(request, response);
        
        
        String username = request.getParameter("username");
        //handling com.mysql.jdbc.exceptions.mysqlintegrityconstraintviolationexception column 'username' cannot be null exception
        
//        if(username==null) 
//            username="";
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        String security_q = request.getParameter("security_q");
        String ans= request.getParameter("answer");
        
         Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        
         try{
              conn = JavaConnect.ConnecrDb();
       
            String sql = "Insert into account(Username,Name,Password,Security_Q,Answer) values(?,?,?,?,?)" ;
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, name);
            pst.setString(3, password);
            pst.setString(4, security_q);
            pst.setString(5, ans);
            pst.execute();
           JOptionPane.showMessageDialog(null, "New account created");
            
            
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
