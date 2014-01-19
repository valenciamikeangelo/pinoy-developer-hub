package com.pdh.service.persistence;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.exception.AccountModificationException;
import com.pdh.exception.CreateAccountException;

/**
 * 
 * @author "Michael Valencia"
 * @date Jan 9, 2014
 */
public interface AccountPersistenceService {

	/**
	 * Method Name: createNewAccount
	 * Return Type: Account
	 * Parameters : {params definition}
	 */
	public Account createNewAccount(CreateAccountEvent createAccountEvent) throws CreateAccountException;
	
	/**
	 * 
	 * Method Name: updateAccount
	 * Return Type: Account
	 * Parameters : {params definition}
	 */
	public Account updateAccount(Account account) throws AccountModificationException;
}
