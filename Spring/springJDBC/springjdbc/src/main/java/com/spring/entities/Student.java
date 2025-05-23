package com.spring.entities;

public class Student {
	public int id;
	public String name;
	public String city;
	
	public Student() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
}
