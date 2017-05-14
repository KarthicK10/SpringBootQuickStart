/**
 * 
 */
package io.karthick.springbootstarter.message;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.karthick.springbootstarter.message.Message;



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
}
