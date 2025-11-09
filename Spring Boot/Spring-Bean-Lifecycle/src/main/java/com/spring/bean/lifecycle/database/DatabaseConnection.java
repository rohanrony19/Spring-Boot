package com.spring.bean.lifecycle.database;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Interface Based

//@Scope("prototype")
//@Component
public class DatabaseConnection implements InitializingBean,DisposableBean{
	
	@Value("localhost:8085")
	private String url;
	
	private String userName;
	
	private String password;
	
	public DatabaseConnection() {
		System.out.println("Database Connection Created...");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	@Value("rohan")
	public void setUserName(String userName) {
		System.out.println("setting username via setter method...");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method is called inside DatabaseConnection...");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method is called inside DatabaseConnection...");
		
	}

}
