package com.springboot.runners.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class EmailNotification implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// Logic
		System.out.println("This is command line runner");
		System.out.println("Your application is ready to start to do operations");
		System.out.println("Sending Email to Developer teams");
		// Email Logic
		System.out.println("Email sent successfully");
	}
	

}
