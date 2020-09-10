package com.ven;

import java.util.Scanner;

public class Main {
	public void display(String name,String city)
	{
		System.out.println("Venue Details");
		System.out.println("Venue Name:"+name);
		System.out.println("City Name:"+city);
	}

	public static void main(String[] args)
	{
		int n;
	String name,city;
	Main m = new Main();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the venue name");
	name = sc.nextLine();
	System.out.println("Enter the city name");
	city = sc.nextLine();
	m.display(name, city);
	do
	{
	System.out.println("Verify and Update Venue Details \nMenu \n1.Update Venue Name \n2.Update City Name \n3.All informations Correct/Exit");
	System.out.println("Type 1 or 2 or 3");
	n = sc.nextInt();
	sc.nextLine();
	switch (n)
	{
	case 1:System.out.println("Enter the venue name");
	name = sc.nextLine();
	break;
	case 2:System.out.println("Enter the city name");
	city = sc.nextLine();
	break;
	}
	m.display(name, city);
	}while(n<3);
	}

}
