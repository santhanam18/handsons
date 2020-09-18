package com.det;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		String details;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the account Detail:");
details = sc.nextLine();
AccountBO a = new AccountBO();
a.getAccountDetails(details);
	}

}
