package com.air;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,m;
		String data;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the country count");
n= sc.nextInt();
sc.nextLine();
for(int i=1;i<=n;i++)
{
	System.out.println("Enter country"+i+"details");
	data= sc.nextLine();
		CountryBO co = new CountryBO();
		co.createCountry(data);
	}
System.out.println("Enter the airport count");
m= sc.nextInt();
sc.nextLine();
for(int j=0;j<=m;j++)
{
	}

	}

}
