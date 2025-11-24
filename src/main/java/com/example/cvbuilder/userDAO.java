package com.example.cvbuilder;

import java.sql.*;

public class userDAO {

    public int insertUser(String name, String email, String phone, String address,
                          String education, String skills, String workExperience, String projects) throws SQLException {
        String insertSQL = "INSERT INTO users (name, email, phone, address, education, skills, work_experience, projects) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DataBaseHelper.getConnection();
             PreparedStatement pstmt = con.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, phone);
            pstmt.setString(4, address);
            pstmt.setString(5, education);
            pstmt.setString(6, skills);
            pstmt.setString(7, workExperience);
            pstmt.setString(8, projects);
            pstmt.executeUpdate();

            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return -1;
    }

    public ResultSet fetchUserById(int userId) {
        String selectSQL = "SELECT * FROM users WHERE id = ?";
        try {
            Connection conn = DataBaseHelper.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(selectSQL);
            pstmt.setInt(1, userId);

            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateUser(int userId, String name, String email, String phone, String address,
                              String education, String skills, String workExperience, String projects) {
        String updateSQL = "UPDATE users SET name = ?, email = ?, phone = ?, address = ?, education = ?, skills = ?, work_experience = ?, projects = ? " +
                " WHERE id = ? ";

        try (Connection conn = DataBaseHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, phone);
            pstmt.setString(4, address);
            pstmt.setString(5, education);
            pstmt.setString(6, skills);
            pstmt.setString(7, workExperience);
            pstmt.setString(8, projects);
            pstmt.setInt(9, userId);

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteUser(int userId) {
        String deleteSQL = "DELETE FROM users WHERE id = ?";
        try (Connection conn = DataBaseHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

            pstmt.setInt(1, userId);

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
