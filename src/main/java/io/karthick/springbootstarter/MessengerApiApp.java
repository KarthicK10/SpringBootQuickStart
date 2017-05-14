/**
 * 
 */
package io.karthick.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KarthicK
 * 
 * The Main class that bootstraps the spring boot application
 *
 */

@SpringBootApplication
public class MessengerApiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Start the application
		SpringApplication.run(MessengerApiApp.class, args);
	}

}
