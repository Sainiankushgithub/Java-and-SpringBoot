package com.springcore.entities;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	int age;
	Map<String, String>courses;
	private  Address address;
	@Autowired
	public Student(@Value("${student.name}")String name,
			@Value("${student.age}")int age,
			@Value("#{${student.courses}}")Map<String ,String>courses,
			Address address) {
		this.name= name;
		this.age = age;
		this.courses= courses;
		this.address= address;
		
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", courses=" + courses + ", address=" + address + "]";
	}
}
