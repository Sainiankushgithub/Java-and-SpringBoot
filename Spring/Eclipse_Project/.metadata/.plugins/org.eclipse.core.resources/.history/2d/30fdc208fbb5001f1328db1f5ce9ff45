package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class javaConfigFile {
	@Bean
	public Address AddressObj1() {
		Address addr= new Address();
		addr.setCity("Jammu & Kashmir");
		addr.setPincode(180003);
		addr.setHouseNo(404);
		return addr;
	}
	
	@Bean 
	public Address AddressObj2() {
		Address addr=new Address();
		addr.setCity("Mumbai");
		addr.setHouseNo(104);
		addr.setPincode(190002);
		return addr;
	}
	@Bean
	public Student StudentObj1() {
		Student std=new Student();
		std.setName("Ankush saini");
		std.setRoll_no(2206409);
		return std;
	}
}
