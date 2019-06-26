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
public class issuebook extends HttpServlet {

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

        int bid = Integer.valueOf(request.getParameter("book_id"));

        //int book_id = 
        //handling com.mysql.jdbc.exceptions.mysqlintegrityconstraintviolationexception column 'username' cannot be null exception
//        if(username==null) 
//            username="";
        String b_name = request.getParameter("b_name");
        int edition = Integer.valueOf(request.getParameter("book_edition"));

        String publisher = request.getParameter("publisher");
        int price = Integer.valueOf(request.getParameter("price"));
        int pages = Integer.valueOf(request.getParameter("pages"));

        int s_id = Integer.valueOf(request.getParameter("s_id"));
        String s_name = request.getParameter("s_name");
        String department = request.getParameter("department");
        int year = Integer.valueOf(request.getParameter("year"));
        int semester = Integer.valueOf(request.getParameter("semester"));
        String doi = request.getParameter("date_of_issue");

        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        
        
        
           
        
                try{
                    conn = JavaConnect.ConnecrDb();
        
            String sql = "Insert into Issue(Book_ID,Name,Edition,Publisher,Price,Pages,Student_ID,Sname,Department,Year,Semester,Issue_date) values(?,?,?,?,?,?,?,?,?,?,?,?)" ;
        
            pst = conn.prepareStatement(sql);
             
            pst.setInt(1, bid);
            pst.setString(2,b_name);
            pst.setInt(3, edition);
            pst.setString(4, publisher);
            pst.setInt(5, price);
            pst.setInt(6, pages);
           
            pst.setInt(7, s_id);
            pst.setString(8, s_name);
            pst.setString(9, department);
          
            pst.setInt(10, year);
            pst.setInt(11, semester);
          
            pst.setString(12, doi);
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Succesfully Book Issued");
            
            
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
