/**
 * 
 */
package com.pdh.persistence.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pdh.persistence.model.builders.AccountBuilder;
import com.pdh.persistence.service.AccountPersistenceServiceJPA;
import com.pdh.service.persistence.AccountPersistenceService;

/**
 * @author "Michael Valencia"
 * @date Jan 17, 2014
 */

@Configuration
public class PersistenceConfig {

	
	@Bean
	public AccountBuilder accountBuilder(){
		return new AccountBuilder();
	}
	
	@Bean AccountPersistenceService accountPersistenceService(){
		return new AccountPersistenceServiceJPA();
	}
}
