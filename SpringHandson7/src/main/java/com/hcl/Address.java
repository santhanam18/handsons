package com.hcl;

public class Address {
	private String line1;
	private String line2;
	private String city;
	private String pincode;
	public Address()
	{
		
	}
	public Address(String line1, String line2, String city, String pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pincode = pincode;
	}
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line2;
	}
	public String getCity() {
		return city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public void display()
	{
		System.out.println("Line1"+line1);
		System.out.println("Line2"+line2);
		System.out.println("City"+city);
		System.out.println("Pincode"+pincode);
	}

}
