package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class StudentConfigFile {

	@Bean
	public Student studentObj() {
		Student std= new Student();
		std.setName("Ankush");
		std.setRoll_no(2206409);
		std.setAddress(addressObj());
		return std;
	}
	
	@Bean
	public Address addressObj() {
		Address addr=new Address();
		addr.setCity("Jammu");
		addr.setHouseNo(104);
		addr.setPincode(181132);
		return addr;
	}
}
