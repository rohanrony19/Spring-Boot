package com.springboot.runners.beans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class TextMessageNotification implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String[] values = args.getSourceArgs();
		for(String val:values) {
			System.out.println(val);
		}
		System.out.println("Sending text msg to manager...");
		System.out.println("Text Msg sent succesfully");
		
	}

	
}
