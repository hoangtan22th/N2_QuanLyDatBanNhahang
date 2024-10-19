package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import connectDB.connectDB;
import entity.Ban;
import entity.KhuVucBan;

public class BanDAO {
	public List<String> getTenBansByKhu(String tenKhu) {
	    List<String> tenBans = new ArrayList<>();
	    String sql = "SELECT b.tenBan " +
	                 "FROM Ban b JOIN KhuVucBan k ON b.maKhu = k.maKhu " +
	                 "WHERE k.tenKhu = ?";

	    try (Connection con = connectDB.getConnection();
	         PreparedStatement pst = con.prepareStatement(sql)) {
	         
	        pst.setString(1, tenKhu);
	        ResultSet rs = pst.executeQuery();

	        while (rs.next()) {
	            String tenBan = rs.getString("tenBan");
	            tenBans.add(tenBan); 
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return tenBans; 
	}
	public List<Ban> getAllBans() {
        List<Ban> bans = new ArrayList<>();
        String sql = "SELECT * FROM Ban"; 
        try (Connection con = connectDB.getConnection();
             Statement st = con.createStatement()) {        
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String maBan = rs.getString("maBan");
                String tenBan = rs.getString("tenBan");
                LocalDateTime thoiGianDatBan = rs.getTimestamp("thoiGianDatBan") != null ? 
                rs.getTimestamp("thoiGianDatBan").toLocalDateTime() : null; 
                int soChoNgoi = rs.getInt("soChoNgoi");
                boolean trangThai = rs.getBoolean("trangThai");
                String loaiBan = rs.getString("loaiBan");
                String maKhu = rs.getString("maKhu");             
                KhuVucBan khuVucBan = new KhuVucBan(maKhu, null, 0); 
                Ban ban = new Ban(maBan, tenBan, thoiGianDatBan, soChoNgoi, trangThai, loaiBan, khuVucBan);
                bans.add(ban); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return bans; 
    }
}
