
package as;
import java.sql.*;

public class DBConnection {
    public static Connection connectDB(){
        Connection con = null;
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/ams", "root", "");
          return con;
      }catch (Exception ex){
        System.out.println("There are error");
        return null;
      }
        
    }
    
}
