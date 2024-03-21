package com.akanth.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    private static final String URL = "jdbc:mysql://localhost:3306/userDb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Akanth24@";
    
    public boolean loginCheck(String username, String password) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection to the database
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                // Prepare SQL query
                String sql = "SELECT * FROM Users WHERE username = ? and password = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, username);
                    statement.setString(2, password);

                    // Execute query
                    try (ResultSet resultSet = statement.executeQuery()) {
                        // Check if any rows are returned
                        return resultSet.next();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
//    public static void main(String[] args) {
//		LoginDao d = new LoginDao();
////		d.loginCheck("akanth_24", "Akanth24@");
//		System.out.println(d.loginCheck("akanth_24", "Akanth24@"));
//	}
}
