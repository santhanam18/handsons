package com.are;

public class Shape {
protected double area;
public Shape()
{
	}
public Shape(double area) {
	super();
	this.area = area;
}

public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public void computeArea()
{
	area=0;
	}
}
