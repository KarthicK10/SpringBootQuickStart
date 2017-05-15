/**
 * 
 */
package io.karthick.springbootstarter.message;

import org.springframework.data.repository.CrudRepository;

/**
 * @author KarthicK
 *
 * CRUD Repository for messages
 */
public interface MessageRepository extends CrudRepository<Message, String>{

	
}
