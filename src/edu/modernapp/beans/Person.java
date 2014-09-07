/*
 * Person.java
 * @author Zhan.
 * Copyright (c) 2014 Company. All rights reserved. 
 */
package edu.modernapp.beans;

public abstract class Person {
	protected String name;
	protected String email;
	protected String phone;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
