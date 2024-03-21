package com.akanth.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.akanth.UserData;

public class welcomeDao {
	private static final String URL = "jdbc:mysql://localhost:3306/userDb";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Akanth24@";

	public UserData getUserDetails(String username) {
		String fullname = "";
		String phone = "";
		String email = "";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
				String query = "select * from users where username= ?";
				try (PreparedStatement statement = con.prepareStatement(query)) {
					statement.setString(1, username);

					try (ResultSet rs = statement.executeQuery()) {
						if (rs.next()) {
							fullname = rs.getString("fullname");
							phone = rs.getString("phone");
							email = rs.getString("email");
							password = rs.getString("password");
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new UserData(fullname, username, password, phone, email);
	}
}
