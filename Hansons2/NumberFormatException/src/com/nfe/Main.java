package com.nfe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception
	 {
		String name;
		double deposit,costPerDay;
Scanner sc = new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
ItemType i = new ItemType();
System.out.println("Enter the Item type details:\nEnter the name");
name = sc.nextLine();
try
{
	System.out.println("Enter the deposit");
	deposit=Double.parseDouble(br.readLine());
	i.setDeposit(deposit);
	System.out.println("Enter the cost per day");
	costPerDay = sc.nextDouble();
	i.setCostPerDay(costPerDay);
	System.out.println("The details of the item type are:\nName:"+name);
	System.out.println("Deposit:"+i.getDeposit());
	System.out.println("Cost Per Day"+i.getCostPerDay());
	}
catch(NumberFormatException nfe)
{
	System.out.println(nfe);
	}

	}

}
