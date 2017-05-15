/**
 * 
 */
package io.karthick.springbootstarter.message;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author KarthicK
 *
 * The Message object
 */
@Entity
public class Message {
	
	@Id
	private String id;
	private String message;
	
	public Message() {
		
	}
	
	public Message(String id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	
	
	
	public String getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
