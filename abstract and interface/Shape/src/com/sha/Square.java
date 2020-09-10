package com.sha;

public class Square extends Shape
{
private float side;
public Square()
{
	}

public Square(float side) {
	super();
	this.side = side;
}

public float getSide() {
	return side;
}

public void setSide(float side) {
	this.side = side;
}
public Double calculatePerimeter()
{
	return h*h*side;
	}
}
