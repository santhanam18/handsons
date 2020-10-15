package com.hcl;

public class Order {
	private String itemName;
	private double price;

	public Order() {
	}

	public Order(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPrice(double price) {
		this.price = price;
	}
public void display()
{
	System.out.println("Item Name: "+itemName);
	System.out.println("Price: "+price);
	}
}
