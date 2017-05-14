/**
 * 
 */
package io.karthick.springbootstarter.message;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.karthick.springbootstarter.message.Message;



/**
 * @author KarthicK
 *
 */
@RestController
public class MessageController {
	
	@RequestMapping("/messages")
	public List<Message> getAllMessages(){
		return Arrays.asList(
				new Message("1", "Hello World"),
				new Message("2", "Hi Everyone")
				);
	}
}
