package com.rohan.di.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public Car() {
		System.out.println("Car is created while implementing");
	}

	@Override
	public String vehicleType() {
		// TODO Auto-generated method stub
		return "This is Car";
	}

}
