package com.consultx.entities;

public class Consultor {
	String name;
	String email;
	String number;
	String password;
	String specialization;
	String experience;
	public Consultor(String name, String email, String number, String password, String specialization,
			String experience) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.password = password;
		this.specialization = specialization;
		this.experience = experience;
	}
	public Consultor() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Consultor [name=" + name + ", email=" + email + ", number=" + number + ", password=" + password
				+ ", specialization=" + specialization + ", experience=" + experience + "]";
	}
	
	
}
