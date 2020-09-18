package com.stl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name,detail,ownerName,stallType,ste;
		Integer squareFeet,numberOfTV;
		Stall s = new Stall();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		name = sc.nextLine();
		System.out.println("Enter the detail of the stall:");
		detail = sc.nextLine();
		System.out.println("Enter the owner name of the stall:");
		ownerName = sc.nextLine();
		System.out.println("Enter the type of the stall:");
		stallType = sc.nextLine();
		System.out.println("Enter the size of the stall in square feet:");
		squareFeet = sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have TV?(y/n)");
		ste = sc.nextLine();
		if(ste.equals("y") )
		{
			System.out.println("Enter the number of TV:");
			numberOfTV = sc.nextInt();
			double e = s.computeCost(stallType, squareFeet, numberOfTV);
			System.out.println(""+e);
		}
		else
		{
			double f = s.computeCost(stallType, squareFeet);
			System.out.println(""+f);
		}
	}
}
