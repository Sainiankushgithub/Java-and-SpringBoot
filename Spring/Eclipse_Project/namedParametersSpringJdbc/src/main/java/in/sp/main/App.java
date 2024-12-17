package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.springConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context  = new AnnotationConfigApplicationContext(springConfig.class);
    	
    	NamedParameterJdbcTemplate npjdbcTemplate=context.getBean(NamedParameterJdbcTemplate.class);
    	
    	Map<String, Object>map = new HashMap<String,Object>();
    	map.put("key_roll",2206419);
    	map.put("key_name", "Suhani sharma");
    	map.put("key_marks",494);
    	
    	String insert_sql_query="INSERT INTO Student VALUES (:key_name,:key_roll,:key_marks)";
    	
    	int count=npjdbcTemplate.update(insert_sql_query, map);
    	if(count>0) {
    		System.out.println("Insetion successfull");
    	}
    	else {
    		System.out.println("Insetion failed");
    	}
    			
    }
}
