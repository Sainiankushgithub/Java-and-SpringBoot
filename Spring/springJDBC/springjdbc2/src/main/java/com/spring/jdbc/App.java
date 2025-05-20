package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.configuration.config;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
        StudentDao studentDao = context.getBean("getStudentDao",StudentDao.class);
//        Example to fetch the data 
        int studentIdFetch=2206409;
        Student student = studentDao.getStudent(studentIdFetch);
        
        // Student Information 
        System.out.println("Student Information");
        System.out.println("Id : "+student.getId());
        System.out.println("Name : "+student.getName());
        System.out.println("Age : "+student.getAge());
        if(student.getAddress()!=null) {
        	System.out.println("Street : "+student.getAddress().getStreet());
        	System.out.println("City : "+student.getAddress().getCity());
        	System.out.println("State : "+student.getAddress().getState());
        	System.out.println("Zip Code : "+student.getAddress().getZip_code());
        }
        else {
        	System.out.println("Failed to fetch the Address of the Student");
        }
        
        System.out.println("Programm Successfully Executed........");
        
    }
}
