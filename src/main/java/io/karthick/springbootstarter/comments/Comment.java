/**
 * 
 */
package io.karthick.springbootstarter.comments;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.karthick.springbootstarter.message.Message;

/**
 * @author KarthicK
 *
 * The Message object
 */
@Entity
public class Comment {
	
	@Id
	private String id;
	private String comment;
	
	@ManyToOne
	private Message message;
	
	public Comment() {
		
	}
	
	public Comment(String id, String comment) {
		super();
		this.id = id;
		this.comment = comment;
		this.message = new Message("", "");
	}
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
