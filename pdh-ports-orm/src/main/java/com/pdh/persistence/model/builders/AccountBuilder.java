/**
 * 
 */
package com.pdh.persistence.model.builders;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.persistence.model.AccountJPA;

/**
 * @author "Michael Valencia"
 * @date Jan 17, 2014
 */
public class AccountBuilder {

	
	public AccountJPA createAccountJPAFromRequest(CreateAccountEvent newAccount){
		
		AccountJPA accountJPA = new AccountJPA();
		accountJPA.setAccountName(newAccount.getAccountName());
		accountJPA.setEmailAddress(newAccount.getEmailAddress());
		accountJPA.setFirstName(newAccount.getFirstName());
		accountJPA.setLastName(newAccount.getLastName());
		return accountJPA;
	}
	
	
	public Account buildCoreAccount(AccountJPA accountJPA){
		Account coreAccount = new Account();
		coreAccount.setId(accountJPA.getId());
		coreAccount.setAccountName(accountJPA.getAccountName());
		coreAccount.setEmailAddress(accountJPA.getEmailAddress());
		coreAccount.setFirstName(accountJPA.getFirstName());
		coreAccount.setLastName(accountJPA.getLastName());
		return coreAccount;
	}
}
