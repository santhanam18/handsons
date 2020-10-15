package com.hcl;

public class Box {
	private User user;
	private int length;
	private int width;

	public Box() {
	}

	public Box(User user, int length, int width) {
		super();
		this.user = user;
		this.length = length;
		this.width = width;
	}

	public User getUser() {
		return user;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void display() {
		System.out.println("The hall of length " + length + " and width " + width + " is owned by " + user.getName());
	}

}
