package com.springCore;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	public void display() {
		System.out.println("Hello I am student ");
	}
}
