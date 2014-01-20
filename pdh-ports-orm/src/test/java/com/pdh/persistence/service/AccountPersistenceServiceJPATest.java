/**
 * 
 */
package com.pdh.persistence.service;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.persistence.configuration.PersistenceConfig;
import com.pdh.persistence.model.builders.AccountBuilder;
import com.pdh.persistence.model.repository.AccountRepository;

/**
 * @author Michael
 * Jan 19, 2014
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PersistenceConfig.class)
public class AccountPersistenceServiceJPATest {
	
	@Autowired
	private AccountPersistenceServiceJPA accountPersistenceServiceJPA;
	

	@Before
	public void setup(){
	
	}
	
	@Test
	public void addNewAccounttest() {
		
		CreateAccountEvent createAccountEvent = new CreateAccountEvent();
		createAccountEvent.setAccountName("TestAccount");
		createAccountEvent.setEmailAddress("test@test.com");
		createAccountEvent.setFirstName("Test");
		createAccountEvent.setLastName("Account");
		
		Account newAccount=null;
		try {
			
			newAccount=accountPersistenceServiceJPA.createNewAccount(createAccountEvent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(newAccount.getId());
		
	}

}