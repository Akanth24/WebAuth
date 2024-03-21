package com.akanth.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.akanth.UserData;

public class RegistrationDao {
    private static final String URL = "jdbc:mysql://localhost:3306/userDb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Akanth24@";
    
    public boolean registrationCheck(UserData data) {
    	
    	String fullname  = data.fullname;
    	String username = data.username;
    	String password = data.password;
    	String phone = data.phone;
    	String email = data.email;
    	
    	try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish Connection to the database
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// Prepare SQL query
			String query = "INSERT INTO Users (fullname, username, password, phone, email) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, fullname);
			statement.setString(2, username);
			statement.setString(3, password);
			statement.setString(4, phone);
			statement.setString(5, email);

			// Execute query
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				return true;
				
			}
			// Close resources
			statement.close();
			connection.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
