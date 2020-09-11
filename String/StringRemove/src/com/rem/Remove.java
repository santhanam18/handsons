package com.rem;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
String san,ste;
Scanner sc = new Scanner(System.in);
System.out.println("What Dumpty says :");
san=sc.nextLine();
System.out.println("Dumpty Says : "+san);
System.out.println("What Humty Want To Remove?");
ste = sc.nextLine();
System.out.println("Dumpty's New Sentense :"+san.replace(ste,""));
	}

}
