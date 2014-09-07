/*
 * ContactHistory.java
 * @author Zhan.
 * Copyright (c) 2014 Company. All rights reserved. 
 */
package edu.modernapp.beans;
import edu.modernapp.beans.Customer;
import edu.modernapp.beans.Agent;



public class ContactHistory {
	public enum Model {
		EMAIL, PHONE;
	}
	
	private Customer customer;
	private Agent agent;
	private String data;
	private String textSummary;
	private String hID;
	private Model model; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
