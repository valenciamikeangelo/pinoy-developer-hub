/**
 * 
 */
package com.pdh.persistence.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pdh.persistence.model.builders.AccountBuilder;

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
}
