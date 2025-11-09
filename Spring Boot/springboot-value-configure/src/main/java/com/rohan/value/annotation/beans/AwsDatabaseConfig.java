package com.rohan.value.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aws")
public class AwsDatabaseConfig {

	@Value("${aws.db.url}")
	private String awsHost;
	
	@Value("${aws.db.user.name}")
	private String awsUsername;
	
	@Value("${aws.db.user.password}")
	private String awsPassword;

	public String getAwsHost() {
		return awsHost;
	}

	public void setAwsHoString(String awsHost) {
		this.awsHost = awsHost;
	}

	public String getAwsUsername() {
		return awsUsername;
	}

	public void setAwsUsername(String awsUsername) {
		this.awsUsername = awsUsername;
	}

	public String getAwsPassword() {
		return awsPassword;
	}

	public void setAwsPassword(String awsPassword) {
		this.awsPassword = awsPassword;
	}
}
