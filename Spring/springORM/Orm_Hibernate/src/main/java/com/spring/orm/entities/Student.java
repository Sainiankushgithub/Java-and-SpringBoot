package com.spring.orm.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private int id;
	private String name;
	private int age;
	private String courses;
	@Embedded
	private Address address;
	public Student() {
	}
	public Student(String name , int age , String courses,Address address){
		this.name=name;
		this.age=age;
		this.courses=courses;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", courses=" + courses + ", address=" + address + "]";
	}
}
