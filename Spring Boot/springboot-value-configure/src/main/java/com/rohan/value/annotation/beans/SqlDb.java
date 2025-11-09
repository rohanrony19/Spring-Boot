package com.rohan.value.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SqlDb {
	
	@Value("${db.username}")
	private String dbName;
	
//	@Value("${db.password}")
	private String dbPassword;

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	@Value("${db.password}")
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
}
