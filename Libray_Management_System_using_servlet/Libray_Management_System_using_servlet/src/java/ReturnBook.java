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
public class ReturnBook extends HttpServlet {

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
        
     
        //int book_id = 
        //handling com.mysql.jdbc.exceptions.mysqlintegrityconstraintviolationexception column 'username' cannot be null exception
//        if(username==null) 
//            username="";
     
     
        int s_id = Integer.valueOf(request.getParameter("s_id"));
        String s_name = request.getParameter("s_name");
        String department = request.getParameter("department");
        int year = Integer.valueOf(request.getParameter("year"));
        int semester = Integer.valueOf(request.getParameter("semester"));
           int bid = Integer.valueOf(request.getParameter("b_id"));
   String b_name = request.getParameter("b_name");
        int edition = Integer.valueOf(request.getParameter("b_edition"));
   String publisher = request.getParameter("publisher");
        int price = Integer.valueOf(request.getParameter("price"));
        int pages = Integer.valueOf(request.getParameter("pages"));
        
        String issuedate = request.getParameter("i_date");
        String returndate = request.getParameter("r_date");
     
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        conn = JavaConnect.ConnecrDb();
        
        // deleting information from issue table 
        

        try {
            String query = "delete from Issue where Student_ID=?";

            pst = conn.prepareStatement(query);
            pst.setInt(1,s_id);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        
        // inserting data into return_t table 
        
          String query1= "Insert into Return_t(Student_ID,Name,Department,Year,Semester,Book_ID,Book_Name,Edition,Publisher,Price,Pages,Issue_date,Return_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            pst = conn.prepareStatement(query1);
           
            pst.setInt(1, s_id);
            pst.setString(2, s_name);
            pst.setString(3, department);
            pst.setInt(4, year);
            pst.setInt(5, semester);
            
            pst.setInt(6, bid);

            pst.setString(7, b_name);
            pst.setInt(8, edition);
            pst.setString(9, publisher);

            pst.setInt(10, price);
            pst.setInt(11, pages);

            pst.setString(12, issuedate);

            pst.setString(13, returndate);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Succesfully Book Returned");

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
