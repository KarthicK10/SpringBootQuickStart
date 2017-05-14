/**
 * 
 */
package io.karthick.springbootstarter.hello;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KarthicK
 *
 * Test controller
 */
@RestController
public class HelloController {
	
	@GET
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello";
	}

}
