package com.rem;

public class Removes {
private String name;
private String contactNumber;
private String userName;
private String email;
public Removes()
{
	}
public Removes(String name, String contactNumber, String userName, String email) {
	super();
	this.name = name;
	this.contactNumber = contactNumber;
	this.userName = userName;
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	System.out.println(name+"\t"+contactNumber+"\t"+userName+"\t"+email);
	return super.toString();
}

}
