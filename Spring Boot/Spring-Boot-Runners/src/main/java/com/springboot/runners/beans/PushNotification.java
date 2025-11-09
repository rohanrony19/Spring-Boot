package com.springboot.runners.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class PushNotification implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		for(String arg:args) {
			System.out.println(arg);
		}
		
		System.out.println("Pushing files to github");
		System.out.println("committing the files");
		System.out.println("committed succesfully");
		System.out.println("Pushed Successfully....");
		
	}

}
