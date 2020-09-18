package com.cta;

import java.util.ArrayList;
import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		int a,j;
		String b,c;
		ArrayList s = new ArrayList();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of halls:");
a=sc.nextInt();
sc.nextLine();
for(int i=1;i<=a;i++)
{
	System.out.println("Enter the Hall Name "+i);
	b=sc.nextLine();
	s.add(b);
	}
System.out.println("Enter the hall name to be searched:");
c=sc.nextLine();
if(s.contains(c))
{
	j=s.indexOf(c);
	System.out.println(c+" hall is found in the list at position "+j);
	}
else
{
	System.out.println(c+" hall is not found");
	}
	}

}
