/**
 * 
 */
package io.karthick.springbootstarter.comments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.karthick.springbootstarter.message.Message;



/**
 * @author KarthicK
 *
 */
@RestController
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/messages/{id}/comments")
	public List<Comment> getAllComments(){
		return commentService.getAllComments();
	}
	
	@RequestMapping("/messages/{messageId}/comments/{id}")
	public Comment getComment(@PathVariable String id){
		return commentService.getComment(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/messages/{messageId}/comments")
	public void addComment(@RequestBody Comment comment, @PathVariable String messageId){
		comment.setMessage(new Message(messageId, ""));
		commentService.addComment(comment);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/messages/{messageId}/comments/{id}")
	public void udpateComment(@RequestBody Comment comment, @PathVariable String messageId, @PathVariable String id){
		comment.setMessage(new Message(messageId, ""));
		commentService.updateComment(comment);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/messages/{messageId}/comments/{id}")
	public void deleteComment(@PathVariable String id){
		commentService.deleteComment(id);
	}
}
