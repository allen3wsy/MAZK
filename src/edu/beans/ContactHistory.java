/*
 * ContactHistory.java
 * @author Zhan.
 * Copyright (c) 2014 Company. All rights reserved. 
 */
package edu.beans;
import edu.beans.Agent;
import edu.beans.Customer;



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
