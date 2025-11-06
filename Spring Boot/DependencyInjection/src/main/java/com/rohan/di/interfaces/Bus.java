package com.rohan.di.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{

	public Bus() {
		System.out.println("Bus is created....");
	}
	@Override
	public String vehicleType() {
		// TODO Auto-generated method stub
		return "This is Bus";
	}
	

}
