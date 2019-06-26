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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author mahmud97
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.getWriter().println(username);

        Connection con;
        ResultSet rs;
        PreparedStatement pst;

        try {

            con = JavaConnect.ConnecrDb();

            String query = "select * from account where Username=? and Password =?";

            pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            rs = pst.executeQuery();

            if (rs.next()) {
                // username passwork correct hoi tobe next page  a proceed korbe 
//                rs.close();
//                pst.close();

                response.getWriter().println("match");

//                setVisible(false);
//                Loading ob = new Loading();
//                ob.setVisible(true);
                response.sendRedirect("User Panel.jsp");
//                
            } else {
                System.out.println("username and password is not matching ");
                JOptionPane.showMessageDialog(null, "Incorrect username and password");
                response.getWriter().println("not match");
            }

        } catch (Exception e) {
//response.getWriter().println("not match");
           e.printStackTrace();
  //JOptionPane.showMessageDialog(null, "Incorrect username and password");
              
            
        } finally {
            try {
//         rs.close();
//         pst.close();
//            
            } catch (Exception e) {

            }
        }

//        
//        if(username!=null && password !=null){
//            
//            if(username.equals("mahmud") && password.equals("12345") ){
//                response.sendRedirect("User Panel.jsp");
//                
//            }
//            else{
//                
//                System.out.println("invalid username or password");
//            }
//            
//        }else{
//            
//            System.out.println("empty username or password");
//        }
//        */
    }

}
