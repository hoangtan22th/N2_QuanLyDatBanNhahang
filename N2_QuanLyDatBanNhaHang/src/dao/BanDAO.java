package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import connectDB.connectDB;
import entity.Ban;
import entity.KhuVucBan;

public class BanDAO {
	public List<String> getTenBansByKhu(String tenKhu) {
		List<String> tenBans = new ArrayList<>();
		String sql = "SELECT b.tenBan " + "FROM Ban b JOIN KhuVucBan k ON b.maKhu = k.maKhu " + "WHERE k.tenKhu = ?";

		try (Connection con = connectDB.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

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
	public List<Ban> getBansByKhu(String tenKhu) {
	    List<Ban> bans = new ArrayList<>();
	    String sql = "SELECT maBan, tenBan, thoiGianDatBan, soChoNgoi, trangThai, loaiBan " +
	                 "FROM Ban WHERE maKhu IN (SELECT maKhu FROM KhuVucBan WHERE tenKhu = ?)";

	    try (Connection con = connectDB.getConnection(); 
	         PreparedStatement pst = con.prepareStatement(sql)) {

	        pst.setString(1, tenKhu);
	        ResultSet rs = pst.executeQuery();

	        while (rs.next()) {
	            String maBan = rs.getString("maBan");
	            String tenBan = rs.getString("tenBan");
	            Timestamp timestamp = rs.getTimestamp("thoiGianDatBan");
	            

	            int soChoNgoi = rs.getInt("soChoNgoi");
	            boolean trangThai = rs.getBoolean("trangThai");
	            boolean loaiBan = rs.getBoolean("loaiBan");

	            
	            Ban ban = new Ban(maBan, tenBan, null, soChoNgoi, trangThai, loaiBan, null);
	            bans.add(ban);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return bans;
	}



	public List<Ban> getAllBans() {
		List<Ban> bans = new ArrayList<>();
		String sql = "SELECT b.*, k.tenKhu FROM Ban b LEFT JOIN KhuVucBan k ON b.maKhu = k.maKhu";
		try (Connection con = connectDB.getConnection(); Statement st = con.createStatement()) {
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				String maBan = rs.getString("maBan");
				String tenBan = rs.getString("tenBan");
				LocalDateTime thoiGianDatBan = rs.getTimestamp("thoiGianDatBan") != null
						? rs.getTimestamp("thoiGianDatBan").toLocalDateTime()
						: null;
				int soChoNgoi = rs.getInt("soChoNgoi");
				boolean trangThai = rs.getBoolean("trangThai");
				boolean loaiBan = rs.getBoolean("loaiBan");
				String maKhu = rs.getString("maKhu");
				String tenKhu = rs.getString("tenKhu");

				KhuVucBan khuVucBan = new KhuVucBan(maKhu, tenKhu, 0);
				Ban ban = new Ban(maBan, tenBan, thoiGianDatBan, soChoNgoi, trangThai, loaiBan, khuVucBan);

				bans.add(ban);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bans;
	}

	public String generateMaBan() {
		String maBan = null;
		String sql = "SELECT MAX(CAST(SUBSTRING(maBan, 2, 5) AS INT)) AS maxMa FROM Ban";

		try (Connection con = connectDB.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				int maxMa = rs.getInt("maxMa");
				if (maxMa > 0) {
					maBan = String.format("B%05d", maxMa + 1);
				} else {
					maBan = "B00001";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return maBan;
	}

	public void insertBan(String maBan, String tenBan, int soChoNgoi, boolean trangThai, boolean loaiBan,
			String maKhu) {
		String sql = "INSERT INTO Ban (maBan, tenBan, soChoNgoi, trangThai, loaiBan, maKhu) VALUES (?, ?, ?, ?, ?, ?)";

		try (Connection con = connectDB.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, maBan);
			pst.setString(2, tenBan);
			pst.setInt(3, soChoNgoi);
			pst.setBoolean(4, trangThai);
			pst.setBoolean(5, loaiBan);
			pst.setString(6, maKhu);

			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateBan(String maBan, String tenBan, int soChoNgoi, boolean trangThai, boolean loaiBan) {
		String sql = "UPDATE Ban SET tenBan = ?, soChoNgoi = ?, trangThai = ?, loaiBan = ? WHERE maBan = ?";

		try (Connection con = connectDB.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, tenBan);
			pst.setInt(2, soChoNgoi);
			pst.setBoolean(3, trangThai);
			pst.setBoolean(4, loaiBan);
			pst.setString(5, maBan);

			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBan(String maBan) {
		String sql = "DELETE FROM Ban WHERE maBan = ?";

		try (Connection con = connectDB.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, maBan);

			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public KhuVucBan getKhuVucByTenKhu(String tenKhu) {
		KhuVucBan khuVuc = null;
		String sql = "SELECT * FROM KhuVucBan WHERE tenKhu = ?";

		try (Connection con = connectDB.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, tenKhu);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				String maKhu = rs.getString("maKhu");
				String tenKhuDb = rs.getString("tenKhu");
				int soLuongBan = rs.getInt("soBan");

				khuVuc = new KhuVucBan(maKhu, tenKhuDb, soLuongBan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return khuVuc;
	}

	public boolean isMaBanExists(String maBan) {
		String sql = "SELECT COUNT(*) FROM Ban WHERE maBan = ?";

		try (Connection con = connectDB.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, maBan);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getInt(1) > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	    public boolean capNhatTrangThaiBan(String maBan, boolean trangThai) {
	        Connection conn = connectDB.getConnection();
	        String sql = "UPDATE Ban SET trangThai = ? WHERE maBan = ?";
	        
	        try {
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            pstmt.setBoolean(1, trangThai);
	            pstmt.setString(2, maBan);
	            int rowsAffected = pstmt.executeUpdate();
	            return rowsAffected > 0; // Trả về true nếu cập nhật thành công
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        } finally {
	            connectDB.closeConnection(conn);
	        }
	    }
	

}
