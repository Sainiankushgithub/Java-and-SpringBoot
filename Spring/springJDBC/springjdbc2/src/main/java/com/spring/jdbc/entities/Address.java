package com.spring.jdbc.entities;

public class Address {
	int id;
	String street;
	String city;
	String state;
	String zip_code;
	
	
	public Address() {
	}


	public Address(int id, String street, String city, String state, String zip_code) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip_code() {
		return zip_code;
	}


	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	
}
