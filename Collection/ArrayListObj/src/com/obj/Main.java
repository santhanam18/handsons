package com.obj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		String c;
		String name;
		double deposit,costPerDay;
		int i=1;
		Scanner sc = new Scanner(System.in);
ArrayList a=new ArrayList();
do
{
	ItemType t[]= new ItemType[10];
	t[i]= new ItemType();
System.out.println("Enter the details of Item Type "+i);
System.out.println("Name:");
name=sc.nextLine();
t[i].setName(name);
System.out.println("Deposit:");
deposit=sc.nextDouble();
t[i].setDeposit(deposit);
System.out.println("Cost Per Day:");
costPerDay=sc.nextDouble();
sc.nextLine();
t[i].setCostPerDay(costPerDay);
a.add(t[i]);
i++;
System.out.println("Do you want to continue?(y/n)");
c=sc.nextLine();
}while(c.equals("y"));
System.out.println("Name\tDeposit\tCostPerDay");
System.out.println(a);
	}
}
