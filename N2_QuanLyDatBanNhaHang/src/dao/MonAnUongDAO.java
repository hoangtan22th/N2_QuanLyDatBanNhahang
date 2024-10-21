package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import connectDB.connectDB;
import entity.MonAnUong;

public class MonAnUongDAO {

    public List<MonAnUong> loadAllMonAnUong() {
        List<MonAnUong> monAnUongList = new ArrayList<>();
        String sql = "SELECT maMonAnUong, tenMonAnUong, giaTien, loai, soLuong FROM MonAnUong";

        // Sử dụng connectDB để lấy kết nối
        try (Connection connection = connectDB.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

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

        return monAnUongList;
    }
}
