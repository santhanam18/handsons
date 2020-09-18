package com.ime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int n;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter an integer input");
n=sc.nextInt();
System.out.println("Entered value is "+n);
}
catch(InputMismatchException ime)
{
	System.out.println(ime);
	}
	}

}
