package com.rem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String c,str;
		String name;
		int i=1,h,j;
		Scanner sc = new Scanner(System.in);
ArrayList a=new ArrayList();
do
{
	Removes r[]= new Removes[10];
	r[i]= new Removes();
System.out.println("Enter the user "+i+" details in csv format");
str=sc.nextLine();
String s[]=str.split(",");
r[i].setName(s[0]);
r[i].setContactNumber(s[1]);
r[i].setUserName(s[2]);
r[i].setEmail(s[3]);
a.add(r[i]);
i++;
System.out.println("Do you want to continue?(y/n)");
c=sc.nextLine();
}while(c.equals("y"));
System.out.println("Name\tContactNumber\tUsername\tEmail");
System.out.println(a);
System.out.println("Enter the range to be removed from array list");
h=sc.nextInt();
j=sc.nextInt();
a.remove(h);
System.out.println("Name\tContactNumber\tUsername\tEmail");
System.out.println(a);
	}

}
