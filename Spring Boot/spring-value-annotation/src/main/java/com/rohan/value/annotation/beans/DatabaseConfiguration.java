package com.rohan.value.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration {

	@Value("8081")  // for Primitive DataType
	private int port;
	
	@Value("localhost")
	private String url;
	
	@Value("rohan")
	private String userName;
	
//	@Value("rony@123")
	private String password;
	
	@Autowired 			// for Non-primitive DataType
	private SqlDb sqlDb;
	
	public SqlDb getSqlDb() {
		return sqlDb;
	}
	public void setSqlDb(SqlDb sqlDb) {
		this.sqlDb = sqlDb;
	}
	public DatabaseConfiguration() {
		System.out.println("DB is Created...");
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
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
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	
	@Value("rony@123")  // setter injection
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
