package com.spring.bean.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.bean.lifecycle.database.DatabaseConnection;
import com.spring.bean.lifecycle.database.EmailConnection;

@SpringBootApplication
public class SpringBeanLifecycleApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringBeanLifecycleApplication.class, args);
	
//		System.out.println("In Utilization state");
//		DatabaseConnection connection = (DatabaseConnection) container.getBean("databaseConnection");
//		System.out.println("Utilizing Bean " + connection);
		//operation
//		DatabaseConnection connection2 = (DatabaseConnection) container.getBean("databaseConnection");
//		System.out.println("Utilizing Bean " + connection2);
		
		// Email Annotation
		
		System.out.println("********************************");
		
		EmailConnection email = (EmailConnection) container.getBean("emailConnection");
		
		EmailConnection email1 = (EmailConnection) container.getBean("emailConnection");


	}

}
