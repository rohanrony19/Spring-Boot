package com.spring.bean.lifecycle.database;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Annotation Based

//@Scope("prototype")
@Component
public class EmailConnection {
	
	public EmailConnection() {
		System.out.println("Email Created...");
	}
	
	@PostConstruct
	public void logicBeanCreation() {
		System.out.println("This is lifecycle method : After construction and Configuration");
	}
	
//	@PreDestroy
	public void logicBeanDestruction() {
		System.out.println("This is lifecycle method : Before Destruction");
	}

	public void email2LifeCycle() {
		System.out.println("email2LifeCycle......");
	}
	
	public void email2LifeCycleDestroy() {
		System.out.println("email2LifeCycleDestroy......");
	}
}
