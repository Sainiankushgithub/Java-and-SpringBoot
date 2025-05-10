package com.spring.bean;

public class Student {
	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void display() {
		samosa.display();
		System.out.println("Hello, I am Student class");
	}
}
