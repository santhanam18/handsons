package com.hcl;

public class User {
	private String name;
	private String password;

	public User() {
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void display() {
		System.out.println("Username: " + name);
		System.out.println("Password: " + password);
	}

}
