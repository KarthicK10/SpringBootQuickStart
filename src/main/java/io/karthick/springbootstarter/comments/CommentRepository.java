/**
 * 
 */
package io.karthick.springbootstarter.comments;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import io.karthick.springbootstarter.comments.Comment;

/**
 * @author KarthicK
 *
 * CRUD Repository for messages
 */
public interface CommentRepository extends CrudRepository<Comment, String>{

	public List<Comment> findByMessageId(String messageId);
}
