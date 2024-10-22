package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	public connectDB() {
		
	}
	public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
<<<<<<< HEAD
       
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDatBanNhaHang;encrypt=false;";
  
            String user = "sa";
            String password = "sapassword";
=======
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDatBanNhaHang;encrypt=false;";
            String user = "dat";
            String password = "12345678";
>>>>>>> 171eba90695dc6a29ef3da3b3592ce0a21842f64
            
            c = DriverManager.getConnection(url, user, password);
//            System.out.println("Kết nối thành công.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return c;
    }
    public static void closeConnection(Connection c) {
        if (c != null) {
            try {
                c.close();
//                System.out.println("Đóng kết nối thành công.");
            } catch (SQLException e) {
            	e.printStackTrace();
            }
        }
        
    }
    
}
