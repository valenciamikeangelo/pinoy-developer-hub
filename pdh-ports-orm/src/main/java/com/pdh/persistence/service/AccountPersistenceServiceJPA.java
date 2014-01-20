/**
 * 
 */
package com.pdh.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.exception.AccountModificationException;
import com.pdh.exception.CreateAccountException;
import com.pdh.persistence.model.AccountJPA;
import com.pdh.persistence.model.builders.AccountBuilder;
import com.pdh.persistence.model.repository.AccountRepository;
import com.pdh.service.persistence.AccountPersistenceService;

/**
 * @author "Michael Valencia"
 * @date Jan 17, 2014
 */
public class AccountPersistenceServiceJPA implements AccountPersistenceService {
	
	@Autowired
	private AccountBuilder accountBuilder;
	@Autowired
	private AccountRepository accountRepository;
	

	/* (non-Javadoc)
	 * @see com.pdh.service.persistence.AccountPersistenceService#createNewAccount(com.pdh.event.account.CreateAccountEvent)
	 */
	public Account createNewAccount(CreateAccountEvent createAccountEvent)throws CreateAccountException {
		AccountJPA newAccountJPA = accountBuilder.createAccountJPAFromRequest(createAccountEvent);
		accountRepository.save(newAccountJPA);
		return accountBuilder.buildCoreAccount(newAccountJPA);
	}

	/* (non-Javadoc)
	 * @see com.pdh.service.persistence.AccountPersistenceService#updateAccount(com.pdh.core.model.Account)
	 */
	public Account updateAccount(Account account)
			throws AccountModificationException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAccountBuilder(AccountBuilder accountBuilder) {
		this.accountBuilder = accountBuilder;
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

}
