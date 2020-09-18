package com.max;

public class TicketBooking implements Comparable
{
private String customerName;
private Integer price;
public TicketBooking()
{
	}
public TicketBooking(String customerName, Integer price) {
	super();
	this.customerName = customerName;
	this.price = price;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
@Override
public int compareTo(Object arg0) {

	return 0;
}

}
