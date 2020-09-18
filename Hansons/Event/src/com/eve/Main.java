package com.eve;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name,detail,ownerName;
		int n;
		double a,b;
		Integer noOfStall,noOfShows,noOfSeatsPerShow;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name of the event:");
name = sc.nextLine();
System.out.println("Enter the detail of the event:");
detail = sc.nextLine();
System.out.println("Enter the owner name of the event:");
ownerName = sc.nextLine();
System.out.println("Enter the type of the event\n1.Exhibition\n2.StageEvent");
n = sc.nextInt();
switch(n)
{
case 1:System.out.println("Enter the number of stalls:");
       noOfStall = sc.nextInt();
       Exhibition e = new Exhibition();
       e.setNoOfStall(noOfStall);
       a= e.projectedRevenue();
       System.out.println("The projected revenue of the event is "+a);
       break;
case 2:System.out.println("Enter the number of shows:");
		noOfShows = sc.nextInt();
		System.out.println("Enter the number of seats per show:");
		noOfSeatsPerShow = sc.nextInt();
        StageEvent s = new StageEvent();
        s.setNoOfShows(noOfShows);
        s.setNoOfSeatsPerShow(noOfSeatsPerShow);
        b=s.projectedRevenue();
        System.out.println("The projected revenue of the event is "+b);
        break;
}
	}

}
