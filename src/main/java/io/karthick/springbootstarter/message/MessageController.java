/**
 * 
 */
package io.karthick.springbootstarter.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author KarthicK
 *
 */
@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/messages")
	public List<Message> getAllMessages(){
		return messageService.getAllMessages();
	}
	
	@RequestMapping("/messages/{id}")
	public Message getMessage(@PathVariable String id){
		return messageService.getMessage(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/messages")
	public void addMessage(@RequestBody Message message){
		messageService.addMessage(message);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/messages/{id}")
	public void udpateMessage(@RequestBody Message message, @PathVariable String id){
		messageService.updateMessage(message, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/messages/{id}")
	public void deleteMessage(@PathVariable String id){
		messageService.deleteMessage(id);
	}
}
