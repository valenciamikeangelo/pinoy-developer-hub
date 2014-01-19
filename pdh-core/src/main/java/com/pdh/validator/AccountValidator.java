package com.pdh.validator;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.exception.AccountModificationException;
import com.pdh.exception.CreateAccountException;


/**
 * 
 * @author "Michael Valencia"
 * @date Jan 9, 2014
 */
public interface AccountValidator {

	/**
	 * 
	 * Method Name: validateNewAccount
	 * Return Type: boolean
	 * Parameters : {params definition}
	 */
	public boolean validateNewAccount(CreateAccountEvent createAccountEvent) throws CreateAccountException;
	
	/**
	 * 
	 * Method Name: validateUpdateAccount
	 * Return Type: boolean
	 * Parameters : {params definition}
	 */
	public boolean validateUpdateAccount(Account account) throws AccountModificationException;
}
