package com.rohan.swiggy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.rohan.student")
@SpringBootApplication(scanBasePackages="com.rohan")
public class SwiggyApplication {

	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext();

		ConfigurableApplicationContext container = SpringApplication.run(SwiggyApplication.class, args);
		Object obj = (Student)container.getBean("student");
		System.out.println(obj);
		System.out.println((Student)container.getBean("s1"));
		
	}
	
	@Bean
	public Student s1() {
		System.out.println("Bean 2 of Student is created");
		return new Student();
	}

}
