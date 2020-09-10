package com.eve;

public class Exhibition extends Event
{
private Integer noOfStall;
public Exhibition()
{
	}
public Exhibition(Integer noOfStall) {
	super();
	this.noOfStall = noOfStall;
}
public Integer getNoOfStall() {
	return noOfStall;
}
public void setNoOfStall(Integer noOfStall) {
	this.noOfStall = noOfStall;
}
double e=10000;
public Double projectedRevenue()
{
	return noOfStall*e;
}
}
