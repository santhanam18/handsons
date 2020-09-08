package com.acc;

public class SavingsAccount extends Account
{
	private String orgName;
	public SavingsAccount()
	{
		
	}
	public SavingsAccount(String orgName) {
		super();
		this.orgName = orgName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
public void display()
{
	super.display();
	System.out.println("Organisation Name:"+getOrgName());
	}
}
