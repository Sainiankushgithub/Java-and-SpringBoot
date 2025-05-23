package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm.configuration.config;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello world!");
    	ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
    	StudentDao studentDao = context.getBean(StudentDao.class);
    	
    	Student student = new Student(67,"Ankush","city");
    	int result=studentDao.insert(student);
    	System.out.println("Inserted Student ID : "+result);
    }
}
