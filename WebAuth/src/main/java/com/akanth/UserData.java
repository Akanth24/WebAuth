package com.akanth;

public class UserData {
	public String fullname;
	public String username;
	public String password;
	public String confirmPassword;
	public String phone;
	public String email;

	public UserData(String fullname, String username, String password, String phone, String email) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
