package com.spring.bean.lifecycle.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean(initMethod = "email2LifeCycle",destroyMethod = "email2LifeCycleDestroy")
	public EmailConnection getEmailConnection() {
		return new EmailConnection();
	}
	
}
