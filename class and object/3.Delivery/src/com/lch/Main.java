package com.lch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		long over,ball,runs;
		String batsman,bowler,nonStriker;
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the over");
		    over = sc.nextInt();
		    System.out.println("Enter the ball");
		    ball = sc.nextInt();
		    System.out.println("Enter the runs");
		    runs = sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the batsman name");
		    batsman = sc.nextLine();
		    System.out.println("Enter the bowler name");
		    bowler = sc.nextLine();
		    System.out.println("Enter the nonStriker name");
		    nonStriker = sc.nextLine();
			 Delivery d = new Delivery(over,ball,runs,batsman,bowler,nonStriker);
			 DisplayDeliverDetails.display(d);

	}

}
