package com.rohan.di.food;

import java.util.ArrayList;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Primary
@Component
@AllArgsConstructor
public class Cart {
	
	private int noOfItems;
	private ArrayList<String> itemNames;
	
	public Cart() {
		System.out.println("Cart is created");
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public ArrayList<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(ArrayList<String> itemNames) {
		this.itemNames = itemNames;
	}
	
}
