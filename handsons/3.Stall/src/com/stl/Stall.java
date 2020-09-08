package com.stl;
public class Stall
{
protected String name;
protected String detail;
protected String ownerName;
double a,b;
public Stall()
{
	}
public Stall(String name, String detail, String ownerName) {
	super();
	this.name = name;
	this.detail = detail;
	this.ownerName = ownerName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
double e=200;
double f=10000;
public Double computeCost(String stallType,Integer squareFeet)
{
	return squareFeet*e;
	}
public double computeCost(String stallType,Integer squareFeet,Integer numberOfTV)
{
	double a =(squareFeet*e);
	double b = (a+(numberOfTV*f));
		return b;
}
}
