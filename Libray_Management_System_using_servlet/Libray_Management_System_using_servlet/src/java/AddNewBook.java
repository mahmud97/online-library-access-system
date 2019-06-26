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
public class AddNewBook extends HttpServlet {

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

        int bid = Integer.valueOf(request.getParameter("b_id"));

        //int book_id = 
        //handling com.mysql.jdbc.exceptions.mysqlintegrityconstraintviolationexception column 'username' cannot be null exception
//        if(username==null) 
//            username="";
        String b_name = request.getParameter("b_name");
        int edition = Integer.valueOf(request.getParameter("edition"));

        String publisher = request.getParameter("publisher");
        int price = Integer.valueOf(request.getParameter("price"));
        int pages = Integer.valueOf(request.getParameter("pages"));
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;

        try {
            conn = JavaConnect.ConnecrDb();
            String query = "Insert into Book(Book_ID,Name,Edition,Publisher,Price,Pages) values(?,?,?,?,?,?)";

            pst = conn.prepareStatement(query);
            pst.setInt(1, bid);
            pst.setString(2, b_name);
            pst.setInt(3, edition);
            pst.setString(4, publisher);
            pst.setInt(5, price);
            pst.setInt(6, pages);
            pst.execute();
            JOptionPane.showMessageDialog(null, "New Book Added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
