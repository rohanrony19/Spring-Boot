package com.rohan.value.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rohan.value.annotation.beans.DatabaseConfiguration;

@SpringBootApplication
public class SpringValueAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringValueAnnotationApplication.class, args);
		DatabaseConfiguration db = (DatabaseConfiguration) container.getBean("databaseConfiguration");
		System.out.println("Port: " + db.getPort());
		System.out.println("Url: "+db.getUrl());
		System.out.println("UserName: "+db.getUserName());
		System.out.println("Password: "+db.getPassword());
		System.out.println(db.getSqlDb());
		
	}

}
