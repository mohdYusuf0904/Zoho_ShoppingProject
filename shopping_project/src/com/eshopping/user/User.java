package com.eshopping.user;

public class User {

	private String name;
	private String email;
	private String phone;
	private String password;
	private String address;

	public User() {

	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public String getAddress() {
		return address;
	}

}
