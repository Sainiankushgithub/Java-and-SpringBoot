package in.sp.dijec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.springConfigFile;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(springConfigFile.class);
    	
    	Student std= context.getBean(Student.class);
    	std.display();
    }
}