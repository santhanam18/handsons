package com.wic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n,i,j;
		long over,ball;
		String wicketType,playerName,bowlerName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		n = sc.nextInt();
		String str[] = new String[n+1];
		sc.nextLine();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter the details of wicket "+i);
			str[i] = sc.nextLine();
		}
		System.out.println("Wicket Details");
		for(j=1;j<=n;j++)
		{
			String wic[] = str[j].split(",");
	    	System.out.println("Over:"+wic[0]);
	    	System.out.println("Ball:"+wic[1]);
	    	System.out.println("WicketType:"+wic[2]);
	    	System.out.println("PlayerName:"+wic[3]);
	    	System.out.println("BowlerName:"+wic[4]);
      }
	}

}
