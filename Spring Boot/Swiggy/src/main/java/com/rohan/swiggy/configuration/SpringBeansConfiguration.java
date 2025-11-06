package com.rohan.swiggy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rohan.student.Product;

@Configuration
@ComponentScan(basePackages="com.rohan")
public class SpringBeansConfiguration {

	@Bean
	public Product p1() {
		System.out.println("Bean 2 is created for Product via configuration class");
		return new Product(); 
	}
}
