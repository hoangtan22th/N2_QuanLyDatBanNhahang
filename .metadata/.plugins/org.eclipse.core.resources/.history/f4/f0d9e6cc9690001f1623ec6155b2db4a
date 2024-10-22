package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import connectDB.connectDB;
import entity.MonAnUong;

public class MonAnUongDAO {

<<<<<<< HEAD
	public List<MonAnUong> loadAllMonAnUong() {
		List<MonAnUong> monAnUongList = new ArrayList<>();
		String sql = "SELECT maMonAnUong, tenMonAnUong, giaTien, loai, soLuong FROM MonAnUong";
=======
    public List<MonAnUong> loadAllMonAnUong() {
        List<MonAnUong> monAnUongList = new ArrayList<>();
        String sql = "SELECT maMonAnUong, tenMonAnUong, giaTien, loai FROM MonAnUong";
>>>>>>> d7b736e85fac5dda061e9782de5fcaf98def3e83

		try (Connection connection = connectDB.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql)) {

<<<<<<< HEAD
			while (resultSet.next()) {
				String maMonAnUong = resultSet.getString("maMonAnUong");
				String tenMonAnUong = resultSet.getString("tenMonAnUong");
				double giaTien = resultSet.getDouble("giaTien");
				String loai = resultSet.getString("loai");
				int soLuong = resultSet.getInt("soLuong");

				MonAnUong monAnUong = new MonAnUong(maMonAnUong, tenMonAnUong, giaTien, loai, soLuong);
				monAnUongList.add(monAnUong);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
=======
            while (resultSet.next()) {
                String maMonAnUong = resultSet.getString("maMonAnUong");
                String tenMonAnUong = resultSet.getString("tenMonAnUong");
                double giaTien = resultSet.getDouble("giaTien");
                String loai = resultSet.getString("loai");
               

                MonAnUong monAnUong = new MonAnUong(maMonAnUong, tenMonAnUong, giaTien, loai);
                monAnUongList.add(monAnUong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
>>>>>>> d7b736e85fac5dda061e9782de5fcaf98def3e83

		return monAnUongList;
	}

	public boolean addMonAnUong(MonAnUong monAnUong) {
		String sql = "INSERT INTO MonAnUong (maMonAnUong, tenMonAnUong, giaTien, loai, soLuong) VALUES (?, ?, ?, ?, ?)";

<<<<<<< HEAD
		try (Connection connection = connectDB.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, monAnUong.getMaMonAnUong());
			preparedStatement.setString(2, monAnUong.getTenMonAnUong());
			preparedStatement.setDouble(3, monAnUong.getGiaTien());
			preparedStatement.setString(4, "Chưa có");
			preparedStatement.setInt(5, monAnUong.getSoLuong());

			int rowsAffected = preparedStatement.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean updateMonAnUong(MonAnUong monAnUong) {
		String sql = "UPDATE MonAnUong SET tenMonAnUong = ?, giaTien = ?, loai = ?, soLuong = ? WHERE maMonAnUong = ?";

		try (Connection connection = connectDB.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, monAnUong.getTenMonAnUong());
			preparedStatement.setDouble(2, monAnUong.getGiaTien());
			preparedStatement.setString(3, "Chưa có");
			preparedStatement.setInt(4, monAnUong.getSoLuong());
			preparedStatement.setString(5, monAnUong.getMaMonAnUong());

			int rowsAffected = preparedStatement.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean deleteMonAnUong(String maMonAnUong) {
		String sql = "DELETE FROM MonAnUong WHERE maMonAnUong = ?";

		try (Connection connection = connectDB.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, maMonAnUong);

			int rowsAffected = preparedStatement.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
=======
    public boolean addMonAnUong(MonAnUong monAnUong) {
        String sql = "INSERT INTO MonAnUong (maMonAnUong, tenMonAnUong, giaTien, loai) VALUES (?, ?, ?, ?)";
        
        try (Connection connection = connectDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setString(1, monAnUong.getMaMonAnUong());
            preparedStatement.setString(2, monAnUong.getTenMonAnUong());
            preparedStatement.setDouble(3, monAnUong.getGiaTien());
            preparedStatement.setString(4, "Chưa có");
      
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false; 
    }

 
    public boolean updateMonAnUong(MonAnUong monAnUong) {
        String sql = "UPDATE MonAnUong SET tenMonAnUong = ?, giaTien = ?, loai = ?, WHERE maMonAnUong = ?";
        
        try (Connection connection = connectDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setString(1, monAnUong.getTenMonAnUong());
            preparedStatement.setDouble(2, monAnUong.getGiaTien());
            preparedStatement.setString(3, "Chưa có");
       
            preparedStatement.setString(4, monAnUong.getMaMonAnUong());
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false; 
    }
>>>>>>> d7b736e85fac5dda061e9782de5fcaf98def3e83

}
