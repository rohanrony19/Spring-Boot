package com.rohan.value.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.rohan.value.annotation.beans.AwsDatabaseConfig;
import com.rohan.value.annotation.beans.DatabaseConfiguration;
import com.rohan.value.annotation.beans.EmailConfiguration;
import com.rohan.value.annotation.beans.Student1;
import com.rohan.value.annotation.beans.Student2;

@PropertySource(value = "aws.database.properties")
@SpringBootApplication
public class SpringbootValueConfigureApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringbootValueConfigureApplication.class, args);
		DatabaseConfiguration db = (DatabaseConfiguration) container.getBean("databaseConfiguration");
		System.out.println("Port: " + db.getPort());
		System.out.println("Url: "+db.getUrl());
		System.out.println("UserName: "+db.getUserName());
		System.out.println("Password: "+db.getPassword());
		System.out.println("------"+db.getSqlDb()+"------");
		System.out.println("username: " +db.getSqlDb().getDbName());
		System.out.println("password: "+db.getSqlDb().getDbPassword());
		System.out.println("App: " + db.getAppName());
		
		System.out.println("---------------------------");
		
		Student1 student1 = (Student1) container.getBean("student1");
		System.err.println("Student 1 detail");
		System.out.println(student1.getId());
		System.out.println(student1.getAge());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		System.out.println(student1.getSleepTime());
		System.out.println(student1.getGender());
		System.out.println(student1.isMarried());

		System.out.println("------------------------------");
		
		Student2 student2 = (Student2) container.getBean("student2");
		System.err.println("Student 2 detail");
		System.out.println(student2.getId());
		System.out.println(student2.getAge());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		System.out.println("default value: "+student2.getSleepTime());
		System.out.println(student2.getGender());
		System.out.println(student2.isMarried());
		
		System.out.println("--------------------------------");
		
		EmailConfiguration email = (EmailConfiguration) container.getBean("email");
		System.out.println(email);
		System.out.println(email.getEmailPort());
		System.out.println(email.getEmailUser());
		System.out.println(email.getEmailPassword());
		System.out.println(email.getListOfUsers());
		email.getListOfUsers().forEach(System.out::println);
		
		
		System.out.println("-----------------------------------");
		
		AwsDatabaseConfig aws = (AwsDatabaseConfig) container.getBean("aws");
		System.out.println(aws);
		System.out.println(aws.getAwsHost());
		System.out.println(aws.getAwsUsername());
		System.out.println(aws.getAwsPassword());

		
	}

}
