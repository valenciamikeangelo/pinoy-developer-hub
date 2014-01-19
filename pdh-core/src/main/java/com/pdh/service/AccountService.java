package com.pdh.service;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.event.account.CreatedAccountEvent;
import com.pdh.event.account.SearchAccountEvent;
import com.pdh.event.account.SearchAccountResultEvent;
import com.pdh.event.account.UpdatedAccountEvent;


/**
 * 
 * @author "Michael Valencia"
 * @date Jan 9, 2014
 */
public interface AccountService {

	/**
	 * Method Name: createNewAccount
	 * Return Type: CreatedAccountEvent
	 * Parameters : {params definition}
	 */
	public CreatedAccountEvent createNewAccount(CreateAccountEvent createAccountEvent) throws Exception;
	
	/**
	 * 
	 * Method Name: updateAccount
	 * Return Type: UpdatedAccountEvent
	 * Parameters : {params definition}
	 */
	public UpdatedAccountEvent updateAccount(Account account) throws Exception;
	
	/**
	 * 
	 * Method Name: addConnection
	 * Return Type: void
	 * Parameters : {params definition}
	 */
	public void addConnection(Account account) throws Exception;
	
	/**
	 * 
	 * Method Name: searchAccount
	 * Return Type: SearchAccountResultEvent
	 * Parameters : {params definition}
	 */
	public SearchAccountResultEvent searchAccount(SearchAccountEvent searchAccountEvent) throws Exception;
	
}
