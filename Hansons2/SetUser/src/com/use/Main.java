package com.use;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name,b;
Scanner sc = new Scanner(System.in);
HashSet h= new HashSet();
do
{
System.out.println("Enter Username");
name =sc.nextLine();
h.add(name);
System.out.println("Do you want to continue?(yes/no)");
b=sc.nextLine();
}while(b.equals("yes"));
System.out.println("Number of User="+h.size());
	}

}
