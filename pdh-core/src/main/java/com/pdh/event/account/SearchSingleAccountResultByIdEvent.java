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
public class SearchSingleAccountResultByIdEvent extends PersistenceEvent {
	
	private Account searchedAccount;
	private boolean found;

	public SearchSingleAccountResultByIdEvent(Account searchedAccount){
		this.searchedAccount=searchedAccount;
		this.found=true;
	}

	public Account getSearchedAccount() {
		return searchedAccount;
	}

	public boolean isFound() {
		return found;
	}
	
	
}
