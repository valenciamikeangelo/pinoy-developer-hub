package com.pdh.event.account;

import com.pdh.event.Event;

/**
 * 
 * @author "Michael Valencia"
 * @date Jan 9, 2014
 */
public class CreateAccountEvent extends Event{

	private String accountName;
	private String emailAddress;
	private String firstName;
	private String lastName;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
