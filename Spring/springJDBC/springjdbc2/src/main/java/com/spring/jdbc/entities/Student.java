package com.spring.jdbc.entities;

public class Student {
	int id;
	String name;
	int age;
	int address_id;
	Address address;
	
	
	public Student() {
		
	}
	public Student(int id, String name, int age, int address_id, Address address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address_id = address_id;
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address_id=" + address_id + ", address="
				+ address + "]";
	}
}
