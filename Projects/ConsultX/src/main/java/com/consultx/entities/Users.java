package com.consultx.entities;

public class Users {
	public String name;
	public String email;
	public String number;
	public String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return number;
	}
	public void setPhone_no(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users() {
	}
	public Users(String name, String email, String number, String password) {
		this.name = name;
		this.email = email;
		this.number = number;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", email=" + email + ", phone_no=" + number + ", password=" + password + "]";
	}
	
}
