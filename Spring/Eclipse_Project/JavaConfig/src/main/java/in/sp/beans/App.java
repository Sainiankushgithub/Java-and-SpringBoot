package in.sp.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.bean.User;
import in.sp.resources.springConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(springConfigFile.class);
        // way 1 :::: 
		/*
		 * User user1= (User) context.getBean("user1"); user1.display();
		 * System.out.println("-----------------------");
		 */
        
        // way 3 ::::
		/*
		 * User user2=context.getBean(User.class); user2.display();
		 * System.out.println("-----------------------");
		 */
        
        // way 3 ::::
		
		 User user3=(User) context.getBean("userObj1"); 
		 user3.display();
		 
    }
}