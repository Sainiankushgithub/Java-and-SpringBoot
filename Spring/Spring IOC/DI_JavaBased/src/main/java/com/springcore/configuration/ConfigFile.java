package com.springcore.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.entities.Address;
import com.springcore.entities.Student;

@Configuration
public class ConfigFile {
	
	@Bean
	public Address getAddress() {
		return new Address("Jammu","J&k",180003);
	}
	
	@Bean
	public Student getStudent(Address address) {
		Map<String, String>courses = new HashMap<>();
		courses.put("Dsa", "Data Structure & Algoruthm");
		courses.put("DBMS", "DataBase Management System");
		return new Student("Ankush saini",22,courses,address);
	}
}
