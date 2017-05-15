/**
 * 
 */
package io.karthick.springbootstarter.message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author KarthicK
 *
 */
@Service
public class MessageService {
	
	private List<Message> messages =  new ArrayList<Message>(Arrays.asList(
			new Message("1", "Hello World"),
			new Message("2", "Hi Everyone")
			));
	
	public List<Message> getAllMessages(){
		return messages;
	}
	
	public Message getMessage(String id){
		return messages.stream().filter(m -> m.getId().equals(id)).findFirst().get();
	}
	
	public void addMessage(Message message){
		messages.add(message);
	}

	public void updateMessage(Message message, String id) {
		for(int i=0; i<messages.size(); i++){
			Message m = messages.get(i);
			if(m.getId().equals(id)){
				messages.set(i, message);
				return;
			}
		}
	}

	public void deleteMessage(String id) {
		messages.removeIf(m -> m.getId().equals(id));
	}
		
}
