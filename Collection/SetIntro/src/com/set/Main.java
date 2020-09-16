package com.set;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name,b;
Scanner sc = new Scanner(System.in);
HashSet h= new HashSet();
do
{
System.out.println("Enter the username");
name =sc.nextLine();
h.add(name);
System.out.println("Do you want to continue?(Y/N)");
b=sc.nextLine();
}while(b.equals("Y"));
System.out.println("The unique number of username is "+h.size());
	}

}

