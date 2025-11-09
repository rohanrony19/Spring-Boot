package com.rohan.value.annotation.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailConfiguration {
	
	// Field Injection
	@Value("${app.email.port}")
	private String emailPort;
	
	private String emailUser;
	
	private String emailPassword;
	
	@Value("${app.email.userlist:rohan,raji,sonia}")
	private List<String> listOfUsers;

	
//	public EmailConfiguration() {
//		super();
//		System.out.println("No arg constructor");
//	}

	public List<String> getListOfUsers() {
		return listOfUsers;
	}

	public void setListOfUsers(List<String> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}

	// Constructor Injection : only 1 constructor should be present ,don't need of default constructor
	public EmailConfiguration(@Value("${app.email.password}") String emailPassword) {
		super();
		System.out.println("Email constructor is called and the password is " + emailPassword);
		this.emailPassword = emailPassword;
	}

	public String getEmailPort() {
		return emailPort;
	}

	public void setEmailPort(String emailPort) {
		this.emailPort = emailPort;
	}

	public String getEmailUser() {
		return emailUser;
	}

	// Setter Injection
	@Value("${app.email.user}")
	public void setEmailUser(String emailUser) {
		System.out.println("Email setter is called and the useremail is " + emailUser);
		this.emailUser = emailUser;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}
	
	

}
