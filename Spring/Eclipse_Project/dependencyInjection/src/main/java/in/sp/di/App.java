package in.sp.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.StudentConfigFile;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfigFile.class);
    	
    	Student std=(Student) context.getBean(Student.class);
    	std.display();
    }
}


