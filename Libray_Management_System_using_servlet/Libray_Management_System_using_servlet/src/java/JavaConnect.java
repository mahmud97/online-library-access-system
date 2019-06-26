

/**
 *
 * @author mahmud97
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
//
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
//    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/online_library";

    
    Connection con ;
    public static Connection ConnecrDb() {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/online_library", "root", "");
//here sonoo is database name, root is username and password  
           // Statement stmt = con.createStatement();
           // ResultSet rs = stmt.executeQuery("select * from Account");
           // while (rs.next()) {
           //     System.out.println(rs.getString(2) + "  " + rs.getString(2) + "  " + rs.getString(3));
           // }
            //con.close();
            return con ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);    
	return null ;
        }
    }
}
