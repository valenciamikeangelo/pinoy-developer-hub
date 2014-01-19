/**
 * 
 */
package com.pdh.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.event.account.CreatedAccountEvent;
import com.pdh.service.persistence.AccountPersistenceService;
import com.pdh.service.utililty.AccountPersistenceHelper;
import com.pdh.validator.AccountValidator;

/**
 * @author "Michael Valencia"
 * @date Jan 9, 2014
 */
public class AccountServiceTest {

	private AccountServiceImpl accountService;
	private AccountValidator accountValidator;
	private AccountPersistenceService accountPersistenceService;
	
	@Before
	public void setup(){
		accountService = new AccountServiceImpl();
		accountValidator = mock(AccountValidator.class);
		accountPersistenceService = mock(AccountPersistenceService.class);
		accountService.setAccountValidator(accountValidator);
		accountService.setAccountPersistenceService(accountPersistenceService);
	}
	
	
	@Test
	public void testCreateNewAccount() {
		Long dummyId=new Long(100);
		CreateAccountEvent createAccountEvent = new CreateAccountEvent();
		
		createAccountEvent.setAccountName("TestAccount");
		createAccountEvent.setEmailAddress("test@test.com");
		createAccountEvent.setFirstName("Test");
		createAccountEvent.setLastName("Account");
		
		CreatedAccountEvent newAccount=null;
		try {
			Mockito.when(accountValidator.validateNewAccount(createAccountEvent)).thenReturn(true);
			Account persistedAccount=AccountPersistenceHelper.createDummyAccountFromRequest(createAccountEvent,dummyId);
			Mockito.when(accountPersistenceService.createNewAccount(createAccountEvent)).thenReturn(persistedAccount);
			newAccount=accountService.createNewAccount(createAccountEvent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(newAccount);
		assertNotNull(newAccount.getCreatedAccount());
		assertEquals(dummyId.longValue(), newAccount.getCreatedAccount().getId());
		AccountPersistenceHelper.removeAccountFrominMemoryAccountMap(dummyId);
	}

	
	@Test
	public void testSearchAccountById(){
		Long dummyId=new Long(100);
		CreateAccountEvent createAccountEvent = new CreateAccountEvent();
		
		createAccountEvent.setAccountName("TestAccount");
		createAccountEvent.setEmailAddress("test@test.com");
		createAccountEvent.setFirstName("Test");
		createAccountEvent.setLastName("Account");
		
		CreatedAccountEvent newAccount=null;
		try {
			Mockito.when(accountValidator.validateNewAccount(createAccountEvent)).thenReturn(true);
			Account persistedAccount=AccountPersistenceHelper.createDummyAccountFromRequest(createAccountEvent,dummyId);
			Mockito.when(accountPersistenceService.createNewAccount(createAccountEvent)).thenReturn(persistedAccount);
			newAccount=accountService.createNewAccount(createAccountEvent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(newAccount);
		assertNotNull(newAccount.getCreatedAccount());
		assertEquals(dummyId.longValue(), newAccount.getCreatedAccount().getId());
	}
	
	
}
