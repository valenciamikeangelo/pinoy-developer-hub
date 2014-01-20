/**
 * 
 */
package com.pdh.persistence.service;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pdh.core.model.Account;
import com.pdh.event.account.CreateAccountEvent;
import com.pdh.persistence.configuration.HibernateJPAConfigTest;
import com.pdh.persistence.configuration.PersistenceConfig;
import com.pdh.service.persistence.AccountPersistenceService;

/**
 * @author Michael
 * Jan 19, 2014
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={HibernateJPAConfigTest.class,PersistenceConfig.class})
public class AccountPersistenceServiceJPATest {
	
	@Autowired
	private AccountPersistenceService accountPersistenceService;

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
			
			newAccount=accountPersistenceService.createNewAccount(createAccountEvent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(newAccount.getId());
	
	}

}