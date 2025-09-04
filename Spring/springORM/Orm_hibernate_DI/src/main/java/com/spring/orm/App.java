package com.spring.orm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm.configuration.ConfigFile;
import com.spring.orm.dao.EmployeeDao;
import com.spring.orm.dao.JobDao;
import com.spring.orm.entities.Employee;
import com.spring.orm.entities.JobDetail;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        JobDetail jobdetail=context.getBean(JobDetail.class);
        Employee emp = context.getBean(Employee.class);
        System.out.println(emp);
        System.out.println(jobdetail);
        try {
        	JobDao jdao = context.getBean(JobDao.class);
            jdao.saveJob(jobdetail);
            EmployeeDao dao=context.getBean(EmployeeDao.class);
            int result= dao.saveEmployee(emp);
            System.out.println("Result : "+result);
            if(result>0) System.out.println("Inserted successfully  . . . . .");
            else System.out.println("Failed to insert . . .  . . .");
        }catch(Exception e) {
        	System.out.println("Sql Exception may be duplicate a entry  . . . . . . ");
        }
    }
}
