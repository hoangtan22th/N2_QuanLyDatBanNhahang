package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	public connectDB() {

	}

	public static Connection getConnection() {
<<<<<<< HEAD
		Connection c = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDatBanNhaHang;encrypt=false;";
			String user = "dat";
			String password = "12345678";

			c = DriverManager.getConnection(url, user, password);
=======
        Connection c = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDatBanNhaHang;encrypt=false;";
  
            String user = "sa";
            String password = "sapassword";

            c = DriverManager.getConnection(url, user, password);
>>>>>>> d7b736e85fac5dda061e9782de5fcaf98def3e83
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
