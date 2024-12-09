package in.sp.beans;

public class Address {
	int pincode;
	String city;
	int houseNo;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	
	@Override
	public String toString() {
		return "#"+houseNo+"-"+city+","+pincode;
	}
}
