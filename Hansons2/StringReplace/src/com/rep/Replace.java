package com.rep;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
String san,ste,sys;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Humpty's Sentence :");
san = sc.nextLine();
System.out.println("Word To Repalce :");
ste=sc.nextLine();
System.out.println("Synonym :");
sys=sc.nextLine();
System.out.println("Replaced String :"+san.replace(ste,sys));
	}

}
