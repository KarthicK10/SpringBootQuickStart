/**
 * 
 */
package io.karthick.springbootstarter.message;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author KarthicK
 *
 */
@Service
public class MessageService {
	
	private List<Message> messages =  Arrays.asList(
			new Message("1", "Hello World"),
			new Message("2", "Hi Everyone")
			);
	
	public List<Message> getAllMessages(){
		return messages;
	}
	
	public Message getMessage(String id){
		return messages.stream().filter(m -> m.getId().equals(id)).findFirst().get();
	}
	
}
