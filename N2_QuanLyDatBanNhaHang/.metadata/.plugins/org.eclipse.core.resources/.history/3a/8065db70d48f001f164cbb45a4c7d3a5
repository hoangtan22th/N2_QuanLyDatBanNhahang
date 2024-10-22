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
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyNhaHang;encrypt=false;";
=======
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDatBanNhaHang;encrypt=false;";
<<<<<<< HEAD
            String user = "dat";
            String password = "12345678";
=======
>>>>>>> origin/main
            String user = "sa";
            String password = "sapassword";
>>>>>>> a65386afc9a4ee001ff18fcc3ab235dab387e953
            
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
