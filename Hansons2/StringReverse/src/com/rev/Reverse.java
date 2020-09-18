package com.rev;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String ste,rev="";
		int length;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Humpty's Sentence :");
ste = sc.nextLine();
length = ste.length();
for(int i=length-1;i>=0;i--)
{
rev = rev+ste.charAt(i);
}
System.out.println("Dumpty Says, "+rev);

	}

}
