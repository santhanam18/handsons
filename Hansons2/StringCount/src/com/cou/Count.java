package com.cou;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		String san,ste;
		int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Humpty's Sentence :");
san=sc.nextLine();
System.out.println("Enter Dumpty's Sentence :");
ste=sc.nextLine();
a=san.length();
b=ste.length();
if(a==b)
	System.out.println("Both have used equal number of words");
else if(a>b)
	System.out.println("Humpty has used more words");
else
	System.out.println("Dumpty has used more words");
	}

}
