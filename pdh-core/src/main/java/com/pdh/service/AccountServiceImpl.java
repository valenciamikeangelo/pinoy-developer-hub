package com.pdh.service;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.event.account.CreatedAccountEvent;
import com.pdh.event.account.SearchAccountEvent;
import com.pdh.event.account.SearchAccountResultEvent;
import com.pdh.event.account.UpdatedAccountEvent;
import com.pdh.service.persistence.AccountPersistenceService;
import com.pdh.validator.AccountValidator;

/**
 * 
 * @author "Michael Valencia"
 * @date Jan 9, 2014
 */
public class AccountServiceImpl implements AccountService {

	private AccountValidator accountValidator;
	private AccountPersistenceService accountPersistenceService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pdh.service.AccountService#createNewAccount(com.pdh.event.account
	 * .CreateAccountEvent)
	 */
	public CreatedAccountEvent createNewAccount(
			CreateAccountEvent createAccountEvent) throws Exception {
		if (accountValidator.validateNewAccount(createAccountEvent)) {
			Account createdAccount = accountPersistenceService
					.createNewAccount(createAccountEvent);
			return new CreatedAccountEvent(createdAccount);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pdh.service.AccountService#updateAccount(com.pdh.model.persisted.
	 * Account)
	 */
	public UpdatedAccountEvent updateAccount(Account account) throws Exception {
		if (accountValidator.validateUpdateAccount(account)) {
			Account updatedAccount = accountPersistenceService
					.updateAccount(account);
			return new UpdatedAccountEvent(updatedAccount);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pdh.service.AccountService#addConnection(com.pdh.service.Account)
	 */
	public void addConnection(Account account) throws Exception {
		// TODO Auto-generated method stub

	}
	
	/* (non-Javadoc)
	 * @see com.pdh.service.AccountService#searchAccount(com.pdh.event.account.SearchAccountEvent)
	 */
	public SearchAccountResultEvent searchAccount(
			SearchAccountEvent searchAccountEvent) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountValidator getAccountValidator() {
		return accountValidator;
	}

	public void setAccountValidator(AccountValidator accountValidator) {
		this.accountValidator = accountValidator;
	}

	public AccountPersistenceService getAccountPersistenceService() {
		return accountPersistenceService;
	}

	public void setAccountPersistenceService(
			AccountPersistenceService accountPersistenceService) {
		this.accountPersistenceService = accountPersistenceService;
	}

	

	

}
