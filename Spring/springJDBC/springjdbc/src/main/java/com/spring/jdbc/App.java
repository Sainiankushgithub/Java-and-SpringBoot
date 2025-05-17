package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.config;
import com.spring.dao.StudentDao;
import com.spring.entities.Student;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        
//        Student student = new Student(1,"sahil salaria","Mumbai");
//        int result= studentDao.insert(student);
//        System.out.println("inserted rows : "+result);
        
        Student retrieved = studentDao.getStudent(1);
        System.out.println("Fetched student: " + retrieved);
        
        List<Student>allStudents= studentDao.getAllStudent();
        System.out.println("All Students :  ");
        for(Student s : allStudents) {
        	System.out.println(s);
        }
        
        
        
        
    }
}
