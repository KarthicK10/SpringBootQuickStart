/**
 * 
 */
package io.karthick.springbootstarter.comments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author KarthicK
 *
 */
@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	public List<Comment> getAllComments(String messageId){
		List<Comment> comments = new ArrayList<>();
		commentRepository.findByMessageId(messageId)
				.forEach(comments::add);
		return comments;
	}
	
	public Comment getComment(String id){
		return commentRepository.findOne(id);
	}
	
	public void addComment(Comment comment){
		commentRepository.save(comment);
	}

	public void updateComment(Comment comment) {
		commentRepository.save(comment);
	}

	public void deleteComment(String id) {
		commentRepository.delete(id);
	}
		
}
