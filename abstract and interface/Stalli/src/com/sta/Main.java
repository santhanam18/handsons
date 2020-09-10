package com.sta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Integer cost,tvSet,projector,screen;
		String gold,premium,executive;
Scanner sc = new Scanner(System.in);
System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
n=sc.nextInt();
sc.nextLine();
switch(n)
{
case 1:System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
gold = sc.nextLine();
String gd[]=gold.split(",");
GoldStall g = new GoldStall();
g.setStallName(gd[0]);
cost=Integer.parseInt(gd[1]);
g.setCost(cost);
g.setOwnerName(gd[2]);
tvSet=Integer.parseInt(gd[3]);
g.setTvSet(tvSet);
g.display();
break;
case 2:System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
premium = sc.nextLine();
String pr[]=premium.split(",");
PremiumStall p = new PremiumStall();
p.setStallName(pr[0]);
cost=Integer.parseInt(pr[1]);
p.setCost(cost);
p.setOwnerName(pr[2]);
projector=Integer.parseInt(pr[3]);
p.setProjector(projector);
p.display();
break;
case 3:System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
executive = sc.nextLine();
String ex[]=executive.split(",");
ExecutiveStall e = new ExecutiveStall();
e.setStallName(ex[0]);
cost=Integer.parseInt(ex[1]);
e.setCost(cost);
e.setOwnerName(ex[2]);
screen=Integer.parseInt(ex[3]);
e.setScreen(screen);
e.display();
break;
}
	}

}
