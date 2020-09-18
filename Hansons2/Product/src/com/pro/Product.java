package com.pro;

public class Product {
private int product_code;
private String product_name;
private double Price;
private int Stock;
public Product()
{
	}

public Product(int product_code, String product_name, double price, int stock) {
	super();
	this.product_code = product_code;
	this.product_name = product_name;
	Price = price;
	Stock = stock;
}

public int getProduct_code() {
	return product_code;
}
public void setProduct_code(int product_code) {
	this.product_code = product_code;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public int getStock() {
	return Stock;
}
public void setStock(int stock) {
	Stock = stock;
}
public void

}
