package in.sp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("Ankush saini")
	String name;
	@Value("ankush@1gmial.com")
	String email;
	@Value("ankush123")
	String password;
	@Value("2206409")
	int roll_no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
		System.out.println("Roll_no : " + roll_no);
	}
}
