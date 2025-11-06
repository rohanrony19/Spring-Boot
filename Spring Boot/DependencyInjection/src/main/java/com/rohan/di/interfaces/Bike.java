package com.rohan.di.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public Bike() {
		System.out.println("Bike is created.......");
	}
	@Override
	public String vehicleType() {
		// TODO Auto-generated method stub
		return "This is Bike";
	}

}
