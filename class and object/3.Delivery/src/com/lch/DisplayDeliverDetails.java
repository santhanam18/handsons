package com.lch;

public class DisplayDeliverDetails
{
	public static void display(Delivery d)
	{
	
		    System.out.println("Delivery Details:");
			System.out.println("Over:"+d.getOver());
			System.out.println("Ball:"+d.getBall());
			System.out.println("Runs:"+d.getRuns());
			System.out.println("Batsman:"+d.getBatsman());
			System.out.println("Bowler:"+d.getBowler());
			System.out.println("NonStriker:"+d.getNonStriker());
	}
}
