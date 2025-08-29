package com.springcore.entities;

import java.util.Map;

public class Student {
	private String name;
	private int age;
	private Map<String,String>courses;
	private Address address;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", courses=" + courses + ", address=" + address + "]";
	}

	public Student(String name,int age , Map<String , String>courses,Address address){
		this.name= name;
		this.age = age;
		this.courses= courses;
		this.address= address;
	}
}
