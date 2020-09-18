package com.fou;

import java.util.Scanner;

public class Found {

	public static void main(String[] args) {
		String san,ste;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Humpty's Sentence");
san = sc.nextLine();
System.out.println("Enter Dumpty's Sentence");
ste = sc.nextLine();
if(san.contains(ste))
{
  System.out.println("Found");
	}
else
{
	System.out.println("Not Found");
	}
	}

}
