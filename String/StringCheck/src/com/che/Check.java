package com.che;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
String san,sam;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Humpty's Sentence :");
san=sc.nextLine();
san=san.replaceAll(" ", "");
if(isUppercase(san))
	System.out.println("String is in uppercase");
else
	System.out.println("String is not in uppercase");
	
	}
	private static boolean isUppercase(String san)
	{
		char[] ste = san.toCharArray();
		for(int i=0;i<ste.length;i++)
		{
			if(!Character.isUpperCase(ste[i]))
				return false;
		}
		return true;
	}

}
