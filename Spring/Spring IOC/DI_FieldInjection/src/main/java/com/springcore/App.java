package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.configuration.ConfigFile;
import com.springcore.entities.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        Student std = context.getBean(Student.class);
        System.out.println(std);
    }
}
