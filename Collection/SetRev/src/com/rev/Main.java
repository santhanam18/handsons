package com.rev;

import java.util.Scanner;
import java.util.TreeSet;

public class Main
{
	public static void main(String[] args) {
		String s;
Scanner sc = new Scanner(System.in);
TreeSet t = new TreeSet();
for(int i=0;i<4;i++)
{
	System.out.println("Enter the details");
	s=sc.nextLine();
	t.add(s);
	}
TreeSet rev = (TreeSet)t.descendingSet();
System.out.println(rev);
	}

}
