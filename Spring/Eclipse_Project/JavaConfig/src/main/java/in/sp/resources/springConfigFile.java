package in.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.bean.User;

@Configuration
public class springConfigFile {
	
	@Bean("userObj1")
	public User user1() {
		User user= new User();
		user.setAdmin("Ankush saini");
		user.setEmail("ankushsaini@123gmail.com");
		user.setPassword("Ankush@123");
		user.setId(2206409);
		user.setSupport("No support needed");
		
		return user;
	}
}
