package com.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
//	We can also give name according to us just by using a name tag in the bean 
	@Bean(name= {"Student","temp","con"})
	public Student getStudent() {
		Student student= new Student(getSamosa());
		return student;
	}
}
