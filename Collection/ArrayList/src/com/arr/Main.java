package com.arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String b,c;
		int i=1;
		Scanner sc = new Scanner(System.in);
ArrayList<String> a=new ArrayList<String>();
do
{
System.out.println("Enter the username "+i);
b=sc.nextLine();
a.add(b);
i++;
System.out.println("Do you want to continue?(y/n)");
c=sc.nextLine();
}while(c.equals("y"));
System.out.println("The Names entered are:");
System.out.println(a);

	}

}
