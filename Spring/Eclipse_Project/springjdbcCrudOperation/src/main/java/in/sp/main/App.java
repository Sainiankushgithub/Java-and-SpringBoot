package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.*;

import in.sp.beans.Student;
import in.sp.mapper.StudentRowMapper;
import in.sp.resources.springConfig;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		// INSERT OPERATION
//    	String std_name="vijay thakur";
//    	int std_roll=2206409;
//    	int std_marks=490;
//    	String insert_sql_query="INSERT INTO Student VALUES (?,?,?)";
//    	int count=jdbcTemplate.update(insert_sql_query,std_name,std_roll,std_marks);
//    	
//    	if(count>0) {
//    		System.out.println("Insertion successFull");
//    	}
//    	else {
//    		System.out.println("Insertion Failed");
//    	}

		// LOOP INSERTION OPERATION
		
		
//		int n;
//		System.out.println("Enter the total number of user you want to insert");
//		n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			System.out.println("Enter the student" + (i + 1) + " name :");
//			String std_name;
//			sc.nextLine();
//			std_name = sc.nextLine();
//			System.out.println("Enter the student" + (i + 1) + " roll_no :");
//			int std_roll;
//			std_roll = sc.nextInt();
//			System.out.println("Enter total marks of the Student" + (i + 1));
//			int std_marks;
//			std_marks = sc.nextInt();
//
//			String insert_sql_query = "INSERT INTO Student VALUES (?,?,?)";
//			int count = jdbcTemplate.update(insert_sql_query, std_name, std_roll, std_marks);
//			if (count > 0) {
//				System.out.println("Insertion Successfully");
//			} else {
//				System.out.println("Insertion failed");
//			}
//
//		}

		// UPDATE OPERATION

//    	int std_marks=492;
//    	int std_roll=2206409;
//    	String update_sql_query="UPDATE Student SET std_marks=? WHERE std_roll=?";
//    	int count=jdbcTemplate.update(update_sql_query,std_marks,std_roll);
//    	if(count>0) {
//    		System.out.println("Updation Successfull");
//    	}
//    	else {
//    		System.out.println("Updation failed");
//    	}

		// DELETION OPERATION
//    	int std_roll=2206409;
//    	String delete_sql_query="DELETE FROM Student WHERE std_roll=?";
//    	int count=jdbcTemplate.update(delete_sql_query,std_roll);
//    	if(count>0) {
//    		System.out.println("Deletion successfully");
//    	}
//    	else {
//    		System.out.println("Deletion failed");
//    	}

		
		
		// SELECT * FROM TABLE TABLE_NAME
		
		String select_sql_query="SELECT * FROM Student";
		List<Student>std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper());
		System.out.println("|  Name       |   Roll_no  |  Marks   |");
		for(Student std: std_list) {
			System.out.print("  "+std.getStd_name()+"  ");
			System.out.print("  "+std.getStd_roll()+"  ");
			System.out.print("  "+std.getStd_marks()+"  ");
			System.out.println();
		}
		sc.close();
	}
}