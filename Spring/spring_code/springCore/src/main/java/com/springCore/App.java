package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
    	Student student=context.getBean("firststudent",Student.class);
    	System.out.println(student);
        System.out.println( "Hello World!" );
        student.display();
    }
}
