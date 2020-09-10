package com.exe;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) 
	{
	String extra;	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the extratype details");
    extra=sc.nextLine();
    String str[] = extra.split("#");
    System.out.println("ExtraType Details");
    System.out.println("Extra Type:"+str[0]);
    System.out.println("Runs:"+str[1]);
	}

}
