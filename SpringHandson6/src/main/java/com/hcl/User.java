package com.hcl;

public class User {
	private String name;
	private Integer age;
	private String city;
	private Order order;

	public User() {
	}

	public User(String name, Integer age, String city, Order order) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public Order getOrder() {
		return order;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
		System.out.println("Order: " );
		order.display();
	}
}
