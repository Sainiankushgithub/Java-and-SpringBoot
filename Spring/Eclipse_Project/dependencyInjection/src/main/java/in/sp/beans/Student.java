package in.sp.beans;
public class Student {
	
	private String name;
	private int roll_no;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll no : "+roll_no);
		System.out.println("Addresss : "+address);
	}
	
}
