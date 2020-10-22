package com.hcl.model;

import javax.validation.constraints.NotNull;

public class User {
	@NotNull(message = "please enter the username")
	private String name;
	@NotNull(message = "plese enter the password")
	private String password;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
