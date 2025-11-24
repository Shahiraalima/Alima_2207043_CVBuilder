package com.example.cvbuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {
    private static final String DB_URL = "jdbc:sqlite:cv_builder.db";
    private static Connection connection;

    private static final String CREATE_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT NOT NULL," +
                    "email TEXT NOT NULL," +
                    "phone TEXT NOT NULL," +
                    "address TEXT NOT NULL," +
                    "education TEXT NOT NULL," +
                    "skills TEXT NOT NULL," +
                    "work_experience TEXT NOT NULL," +
                    "projects TEXT NOT NULL" +
                    ");";

    public static void initDatabase() {
        try {
            if(connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL);
                createTable();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void createTable() throws SQLException {
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_TABLE_SQL);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public  static Connection getConnection() throws SQLException {
        if(connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(DB_URL);
        }
        return connection;
    }

}
