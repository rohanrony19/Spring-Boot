package com.rohan.di.setter.injection;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	private double fees;
	
	public Student() {
		System.out.println("Student is created...");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	

}
