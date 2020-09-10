package com.are;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cost,n,item;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the cost of the item for n days");
cost = sc.nextInt();
System.out.println("Enter the value of n");
n= sc.nextInt();
try
{
item= cost/n;
System.out.println("Cost per day of the item is "+item);
}
catch(ArithmeticException ae)
{
	System.out.println(ae);;
	}

	}

}
