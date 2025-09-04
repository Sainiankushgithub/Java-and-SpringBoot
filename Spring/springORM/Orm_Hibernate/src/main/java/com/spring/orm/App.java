package com.spring.orm;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm.configuration.ConfigFile;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Student Deatils here  . . . . . . " );
        ApplicationContext context = new  AnnotationConfigApplicationContext(ConfigFile.class);
        Student std =context.getBean(Student.class);
        System.out.println(std);
        
        System.out.println("Checking for the database connection  . . . . . . ");
        DataSource dataSource = context.getBean(DataSource.class);
        try(Connection conn = dataSource.getConnection()){
        	if(conn!=null && !conn.isClosed()) {
        		System.out.println("Database connection is successfull. . . . . ");
        		System.out.println("Connected to : "+conn.getMetaData().getURL());
        		System.out.println("User : "+conn.getMetaData().getUserName());
        		StudentDao dao = context.getBean(StudentDao.class);
        		int value = dao.insert(std);
        		System.out.println(value);
//        		Fetched student deatils 
        		Student dbstd = dao.getById(value);
        		System.out.println("Data Base Student : \n"+dbstd);
        	}
        }catch(Exception e) {
        	System.out.println("Connection Failed ! ");
        	e.printStackTrace();
        }
    }
}
