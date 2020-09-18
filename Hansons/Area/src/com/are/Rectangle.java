package com.are;

public class Rectangle extends Shape
{
private double length;
private double breadth;
public Rectangle()
{
	}

public Rectangle(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}

public double getBreadth() {
	return breadth;
}

public void setBreadth(double breadth) {
	this.breadth = breadth;
}

public void computeArea()
{
	area = (length*breadth);
	System.out.printf("Area of rectangle is %.2f",area);
	}
}
