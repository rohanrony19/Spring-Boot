package com.rohan.di.food;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("com.rohan.di")
@ComponentScan
public class Config {
	
	@Bean
	public Cart cart1() {
		System.out.println("Bean2 os Cart is created");
		Cart cart = new Cart();
		cart.setNoOfItems(2);
		ArrayList<String> food = new ArrayList<>();
		food.add("Sweets");
		food.add("Cakes");
		cart.setItemNames(food);
		return cart;
	}

}
