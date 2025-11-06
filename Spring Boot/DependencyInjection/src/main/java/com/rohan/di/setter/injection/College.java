package com.rohan.di.setter.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	private String name;
	private int pincode;
	private String location;
	
//	@Autowired
	private Student student;
	
	public College() {
		System.out.println("College is created...");
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student getStudent() {
		return student;
	}
	
	// this is setter injection
	// Bean id : studentOne, studentTwo
	@Autowired
	@Qualifier("studentTwo")
	public void setStudentTwo(Student student) {
		System.out.println("Setter of College is called..." + student);
		this.student = student;
	}
	
}
