package in.sp.beans;

public class Address
{
	private int houseno;
	private String street;
	private String city;
	private long pincode;
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
}
