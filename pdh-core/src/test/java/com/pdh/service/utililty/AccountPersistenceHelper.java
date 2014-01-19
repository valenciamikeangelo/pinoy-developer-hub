/**
 * 
 */
package com.pdh.service.utililty;

import java.util.HashMap;
import java.util.Map;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;

/**
 * @author "Michael Valencia"
 * @date Jan 15, 2014
 */
public class AccountPersistenceHelper {

	private static Map<Long,Account> inMemoryAccountMap= new HashMap<Long,Account>();
	
	
	/**
	 * 
	 * Method Name: createDummyAccountFromRequest
	 * Return Type: Account
	 * Parameters : {params definition}
	 */
	public static Account createDummyAccountFromRequest(CreateAccountEvent createAccountEvent,Long dummyId){
		Account persistedAccount = new Account();
		persistedAccount.setAccountName(createAccountEvent.getAccountName());
		persistedAccount.setEmailAddress(createAccountEvent.getEmailAddress());
		persistedAccount.setFirstName(createAccountEvent.getFirstName());
		persistedAccount.setLastName(createAccountEvent.getLastName());
		persistedAccount.setId(dummyId.longValue());
		inMemoryAccountMap.put(dummyId, persistedAccount);
		return persistedAccount;
	}
	
	public static void removeAccountFrominMemoryAccountMap(Long id){
		inMemoryAccountMap.remove(id);
	}
}
