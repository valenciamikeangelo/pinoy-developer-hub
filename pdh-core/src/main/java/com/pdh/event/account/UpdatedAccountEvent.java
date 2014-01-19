/**
 * 
 */
package com.pdh.event.account;

import com.pdh.core.model.Account;
import com.pdh.event.PersistenceEvent;

/**
 * @author "Michael Valencia"
 * @date Jan 15, 2014
 */
public class UpdatedAccountEvent extends PersistenceEvent {

	private Account updatedAccount;
	private boolean updateSuccess;
	
	public UpdatedAccountEvent(Account updatedAccount){
		this.updatedAccount=updatedAccount;
		this.updateSuccess=true;
	}

	public Account getUpdatedAccount() {
		return updatedAccount;
	}

	public boolean isUpdateSuccess() {
		return updateSuccess;
	}
	
	
	
}
