package com.spring.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="employee")
public class Employee {
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToOne
	@JoinColumn(name="job_id",referencedColumnName = "id")
	private JobDetail job;
	public Employee() {
		
	}
	@Autowired
	public Employee(@Value("${employee.id}")int id,
					@Value("${employee.name}")String name,
					@Value("${employee.age}")int age,JobDetail job) {
		this.id=id;
		this.name = name;
		this.age=age;
		this.job=job;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
}
