package com.are;

public class Circle extends Shape
{
private double radius;
public Circle()
{
	
	}
public Circle(double radius) {
	super();
	this.radius = radius;
}

public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public void computeArea()
{
	area = (radius*radius*22)/7;
	System.out.printf("Area of circle is %.2f",area);
	}
}
