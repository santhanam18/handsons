package com.max;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class Main {

	public static void main(String[] args)
	{
		int a;
		String s;
Scanner sc = new Scanner(System.in);
List l=new List();
System.out.println("Enter the number of customers");
a=sc.nextInt();
sc.nextLine();
if(a>0)
{
	for(int i=0;i<a;i++)
	{
	System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
	s=sc.nextLine();
	String str[]=s.split(",");
	int m=Integer.parseInt(str[1]);
	l.add(str[0], m);
	}
	System.out.println(l);
	}
else
{
	System.out.println("Invalid Input");
	}
	}

}
