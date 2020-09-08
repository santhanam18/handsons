package com.are;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		double radius,length,breadth,base,height;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Tringle");
n = sc.nextInt();
switch(n)
{
	case 1:System.out.println("Enter the radius");
       radius = sc.nextDouble();
       Circle c=new Circle();
       c.setRadius(radius);
       c.computeArea();
       break;
	case 2:System.out.println("Enter the length and breadth");
	      length = sc.nextDouble();
	      breadth = sc.nextDouble();
	      Rectangle r=new Rectangle();
	      r.setLength(length);
	      r.setBreadth(breadth);
	      r.computeArea();
	      break;
	case 3:System.out.println("Enter the base and height");
	      base = sc.nextDouble();
	      height = sc.nextDouble();
	      Triangle t = new Triangle();
	      t.setBase(base);
	      t.setHeight(height);
	      t.computeArea();
	      break;
	default:System.out.println("Invalid choice");
	break;
}
	}

}
