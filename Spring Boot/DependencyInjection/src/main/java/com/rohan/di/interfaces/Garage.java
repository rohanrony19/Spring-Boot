package com.rohan.di.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garage {

	// DI : via interface : 	inject Impl class objects
	@Qualifier("bike")
	@Autowired
	private Vehicle vehicle;
//	
//	@Qualifier("car2")
//	@Autowired
//	private Car car;
	
//	public Car getCar() {
//		return car;
//	}
//
//	public void setCar(Car car) {
//		this.car = car;
//	}

	public Garage() {
		System.out.println("Garage is created and ready to inject vehicle");
	}
	
	public Garage(Vehicle vehicle) {
		System.out.println("Garage is created and injected with vehicle : " + vehicle);
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
