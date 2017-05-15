/**
 * 
 */
package io.karthick.springbootstarter.comments;

import org.springframework.data.repository.CrudRepository;

/**
 * @author KarthicK
 *
 * CRUD Repository for messages
 */
public interface CommentRepository extends CrudRepository<Comment, String>{

	
}
