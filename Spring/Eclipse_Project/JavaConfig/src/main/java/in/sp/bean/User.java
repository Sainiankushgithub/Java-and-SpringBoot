package in.sp.bean;

public class User {
	String admin;
	String support;
	int id;
	String email;
	String password;
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getSupport() {
		return support;
	}
	public void setSupport(String support) {
		this.support = support;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void display() {
		System.out.println("Name :  "+ admin);
		System.out.println("Name :  "+ support);
		System.out.println("Name :  "+ id);
		System.out.println("Name :  "+ email);
		System.out.println("Name :  "+ password);
	}
}
