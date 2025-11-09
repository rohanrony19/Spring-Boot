package com.rohan.value.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student2 {
	
	@Value("${student.id}")
	private byte id;
	
	@Value("${student.age}")
	private int age;
	
	@Value("${student.height}")
	private long height;
	
	@Value("${student.weight}")
	private float weight;
	
	private double sleepTime;
	
	private char gender;

	private boolean isMarried;

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getSleepTime() {
		return sleepTime;
	}

	// setter injection
	@Value("${student.sleeptime:8}")
	public void setSleepTime(double sleepTime) {
		this.sleepTime = sleepTime;
	}

	public char getGender() {
		return gender;
	}

	@Value("${student.gender}")
	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isMarried() {
		return isMarried;
	}

	@Value("${student.ismarried}")
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	

}
