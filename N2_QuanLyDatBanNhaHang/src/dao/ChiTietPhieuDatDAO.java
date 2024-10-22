package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectDB.connectDB;
import entity.ChiTietPhieuDat;

public class ChiTietPhieuDatDAO {
	public boolean themChiTietPhieuDat(ChiTietPhieuDat chiTiet) {
	    Connection con = connectDB.getConnection();
	    String sql = "INSERT INTO ChiTietPhieuDat (maPhieuDat, maMonAnUong, soLuong, maBan) VALUES (?, ?, ?, ?)";
	    
	    try {
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, chiTiet.getPhieuDatBan().getMaPhieuDat()); // Lấy mã phiếu đặt
	        ps.setString(2, chiTiet.getMonAnUong().getMaMonAnUong()); // Lấy mã món ăn
	        ps.setInt(3, chiTiet.getSoLuong()); // Lấy số lượng
	        ps.setString(4, chiTiet.getBan().getMaBan()); // Lấy mã bàn

	        return ps.executeUpdate() > 0; // Trả về true nếu thêm thành công
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        connectDB.closeConnection(con);
	    }
	    return false; // Trả về false nếu thêm thất bại
	}


}
