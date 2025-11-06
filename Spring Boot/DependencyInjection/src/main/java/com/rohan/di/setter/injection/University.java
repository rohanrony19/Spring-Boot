package com.rohan.di.setter.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class University {
	
	private String name;
	private int pincode;
	private College college;
	
	public University() {
		System.out.println("University is created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public College getCollege() {
		return college;
	}

	@Autowired
	public void setCollege(College college) {
		this.college = college;
	}

}
