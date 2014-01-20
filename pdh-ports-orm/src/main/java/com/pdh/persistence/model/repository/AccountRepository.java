/**
 * 
 */
package com.pdh.persistence.model.repository;



import org.springframework.data.repository.CrudRepository;

import com.pdh.persistence.model.AccountJPA;

/**
 * @author "Michael Valencia"
 * @date Jan 17, 2014
 */

public interface AccountRepository extends CrudRepository<AccountJPA, Long> {
	
}
