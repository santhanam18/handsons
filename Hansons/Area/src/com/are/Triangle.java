package com.are;

public class Triangle extends Shape
{
private double base;
private double height;
public Triangle()
{
	}

public Triangle(double base, double height) {
	super();
	this.base = base;
	this.height = height;
}

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public void computeArea()
{
	area=(base*height)/2;
	System.out.printf("Area of triangle is %.2f",area);
	}
}
