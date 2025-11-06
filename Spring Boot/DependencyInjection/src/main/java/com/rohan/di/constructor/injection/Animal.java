package com.rohan.di.constructor.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
	
	private int noOfAnimals;
	private Lion lionOne;
	
	// CI : lion object : Defined constructor with parameter
	@Autowired
	public Animal(Lion lionOne) {
		System.out.println("Animal is created via parameter constructor " + lionOne);
		this.lionOne = lionOne;
	}
	public int getNoOfAnimals() {
		return noOfAnimals;
	}
	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}
	public Lion getLionOne() {
		return lionOne;
	}
	public void setLionOne(Lion lion) {
		System.out.println("setter method for lion inside Animal");
		this.lionOne = lionOne;
	}
	
	public void display() {
        System.out.println("Animal has: " + lionOne);
    }

}
