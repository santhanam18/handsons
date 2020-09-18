package com.ins;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
String san,ste;
int a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Humpty's Sentence");
san=sc.nextLine();
StringBuffer str = new StringBuffer(san);
System.out.println("Humpty Says :"+san);
System.out.println("What Dumpty want to insert & where?");
ste= sc.nextLine();
System.out.println("Enter Position :");
a=sc.nextInt();
System.out.println("Humpty's New Sentence :"+str.insert((a-1),ste));
	}

}
