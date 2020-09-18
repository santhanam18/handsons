package com.det;

public class AccountBO {
	String ste[];
	public void getAccountDetails(String details)
	{
		String ste[] = details.split(",");
		System.out.println("Account Details:");
		System.out.println("Account Number\tBalance\tAccount holder name\tMinimum balancee\tLocking period");
		System.out.println(ste[0]+"\t\t"+ste[1]+"\t"+ste[2]+"\t\t"+ste[3]+"\t\t\t"+ste[4]);
		}

}
