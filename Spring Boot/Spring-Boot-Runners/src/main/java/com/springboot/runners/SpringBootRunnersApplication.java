package com.springboot.runners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.runners.beans.Product;

@SpringBootApplication
public class SpringBootRunnersApplication {

	public static void main(String[] args) {
		
		System.out.println("Args Size: " + args.length);
		System.out.println("Args Value: " + args);
		for(String arg:args) {
			System.out.println(arg);
		}
		
		System.out.println("Before run method completed");
		
		ConfigurableApplicationContext conatiner = SpringApplication.run(SpringBootRunnersApplication.class, args);
		
		System.out.println("After run method completed");
		
		System.out.println("------------------------------------");
		Product product = (Product) conatiner.getBean(Product.class);
		System.out.println(product);
		
	}

}
