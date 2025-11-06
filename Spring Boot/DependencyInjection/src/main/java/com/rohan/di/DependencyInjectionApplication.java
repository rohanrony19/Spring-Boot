package com.rohan.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rohan.di.constructor.injection.Animal;
import com.rohan.di.food.Order;
import com.rohan.di.interfaces.Garage;
import com.rohan.di.interfaces.Vehicle;
import com.rohan.di.setter.injection.College;
import com.rohan.di.setter.injection.University;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DependencyInjectionApplication.class, args);
		Order order = (Order)container.getBean("order");
		System.out.println(order.getCart());
		System.out.println(order.getCart().getNoOfItems());
		System.out.println(order.getCart().getItemNames());
		
		System.out.println("---------------------------");
		
		College college = (College) container.getBean("college");
		System.out.println(college);
		System.out.println(college.getStudent());
		System.out.println("Student ID: " + college.getStudent().getId());
		System.out.println("Student Name: " + college.getStudent().getName());
		System.out.println("Student Fees: " + college.getStudent().getFees());
		
		System.out.println("-----------------------------");
		
		University university = (University) container.getBean("university");
		System.out.println(university);
		System.out.println(university.getCollege().getStudent());
		System.out.println("College Name: "+university.getCollege().getName());
		System.out.println("Location: "+university.getCollege().getLocation());
		System.out.println("Pincode: "+university.getCollege().getPincode());

		
		System.out.println("--------------------------------");
		
		Animal animal = (Animal) container.getBean("animal");
		animal.display();
		
		System.out.println("----------------------------------");
		
		Garage garage = (Garage) container.getBean("garage");
		System.out.println(garage);
		Vehicle vehicle = garage.getVehicle();
//		Vehicle vehicle = garage.getCar();
		System.out.println(vehicle.getClass());
		System.out.println(vehicle.vehicleType());
	}


}
