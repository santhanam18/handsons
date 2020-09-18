package com.sha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		double a,b,d;
		float radius,length,breadth,side;
Scanner sc = new Scanner(System.in);
System.out.println("List of Shapes\n1.Circle\n2.Rectangle\n3.Square\nEnter your choice:");
n=sc.nextInt();
switch(n)
{
case 1:System.out.println("Enter the radius of the Circle:");
       radius = sc.nextFloat();
       Circle c = new Circle();
       c.setRadius(radius);
       a=c.calculatePerimeter();
       System.out.printf("The perimeter is %.2f",a);
       break;
case 2:System.out.println("Enter the length of the Rectangle:");
		length = sc.nextFloat();
		System.out.println("Enter the breadth of the Rectangle:");
		breadth = sc.nextFloat();
		Rectangle r = new Rectangle();
		r.setLength(length);
		r.setBreadth(breadth);
		b=r.calculatePerimeter();
		System.out.printf("The perimeter is %.2f",b);
		break;
case 3:System.out.println("Enter the side of the Square:");
		side = sc.nextFloat();
		Square s = new Square();
		s.setSide(side);
		d=s.calculatePerimeter();
		System.out.printf("The perimeter is %.2f",d);
		break;
       
}
	}

}
