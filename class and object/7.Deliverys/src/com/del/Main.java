package com.del;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
		    Deliverys d = new Deliverys();
		    d.setOver(over);
		    d.setBall(ball);
		    d.setRuns(runs);
		    d.setBatsman(batsman);
		    d.setBowler(bowler);
		    d.setNonStriker(nonStriker);
			System.out.println("Over:"+d.getOver());
			System.out.println("Ball:"+d.getBall());
			System.out.println("Runs:"+d.getRuns());
			System.out.println("Batsman:"+d.getBatsman());
			System.out.println("Bowler:"+d.getBowler());
			System.out.println("NonStriker:"+d.getNonStriker());
	}

}
