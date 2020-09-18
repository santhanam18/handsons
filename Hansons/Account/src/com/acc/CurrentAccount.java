package com.acc;

public class CurrentAccount extends Account
{
private String tinNumber;
public CurrentAccount()
{
	}
public CurrentAccount(String tinNumber) {
	super();
	this.tinNumber = tinNumber;
}
public String getTinNumber() {
	return tinNumber;
}
public void setTinNumber(String tinNumber) {
	this.tinNumber = tinNumber;
}
public void display()
{
	super.display();
	System.out.println("TIN Number:"+getTinNumber());
	}
}
