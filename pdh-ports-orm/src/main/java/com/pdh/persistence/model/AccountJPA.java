package com.pdh.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;



/**
 * 
 * @author "Michael Valencia"
 * @date Jan 17, 2014
 */

@Entity
public class AccountJPA {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String accountName;
	private String emailAddress;
	private String firstName;
	private String lastName;
	
	
	public AccountJPA(){
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
	@Override
	public String toString() {
		   return ReflectionToStringBuilder.toString(this);
		}
}
