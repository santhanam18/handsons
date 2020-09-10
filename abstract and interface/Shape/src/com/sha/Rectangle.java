package com.sha;

public class Rectangle extends Shape
{
private float length;
private float breadth;
public Rectangle()
{
	}

public Rectangle(float length, float breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

public float getLength() {
	return length;
}

public void setLength(float length) {
	this.length = length;
}

public float getBreadth() {
	return breadth;
}

public void setBreadth(float breadth) {
	this.breadth = breadth;
}

public Double calculatePerimeter()
{
	return h*(length+breadth);
	}
}
