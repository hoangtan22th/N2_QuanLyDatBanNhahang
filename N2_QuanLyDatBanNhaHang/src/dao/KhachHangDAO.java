package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectDB.connectDB;
import entity.KhachHang;

public class KhachHangDAO {
	public void xuatKhachHangDauTien() {
		KhachHang khDauTien = null;
		
		try {
			
			Connection con = connectDB.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT TOP 1 maKH, tenKH, ngaySinh, sdt FROM KhachHang ORDER BY maKH ASC";
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {				
				String maKH = rs.getString("maKH");   
                String tenKH = rs.getString("tenKH");    
                Date ngaySinh = rs.getDate("ngaySinh");   
                String sdt = rs.getString("sdt");  
                
                System.out.println("Khách hàng đầu tiên:");
                
                System.out.println("maKH: " + maKH);
                System.out.println("tenKH: " + tenKH);
                System.out.println("ngaySinh: " + ngaySinh);
                System.out.println("sdt: " + sdt);
             
            }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
}
