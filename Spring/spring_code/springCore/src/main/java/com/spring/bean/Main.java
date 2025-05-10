package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
		Student student = context.getBean("temp",Student.class);
		System.out.println("Printing the Student using bean object ");
		student.display();
	}

}
