package com.complexForm.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String name;
	private String email;
	private String password;
	private int age;
	private String gender;
	private String course;
	private Address address = new Address();
	@DateTimeFormat(pattern="YYYY/MM/DD")
	private LocalDate dob;
	private String type;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", age=" + age + ", gender="
				+ gender + ", course=" + course + ", address=" + address + ", dob=" + dob + ", type=" + type + "]";
	}
	
}
