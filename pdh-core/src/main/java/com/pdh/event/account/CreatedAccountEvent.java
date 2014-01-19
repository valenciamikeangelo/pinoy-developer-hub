package com.pdh.event.account;

import com.pdh.core.model.Account;
import com.pdh.event.PersistenceEvent;

/**
 * 
 * @author "Michael Valencia"
 * @date Jan 9, 2014
 */
public class CreatedAccountEvent extends PersistenceEvent {
	
	private Account createdAccount;
	
	private boolean createSuccess;

	public CreatedAccountEvent(Account createdAccount){
		this.createdAccount=createdAccount;
		createSuccess=true;
	}

	public Account getCreatedAccount() {
		return createdAccount;
	}

	public boolean isCreateSuccess() {
		return createSuccess;
	}
	
}
