package com.rohan.value.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {

	@Value("1")
	private byte id;
	
	@Value("23")
	private int age;
	
	@Value("5")
	private long height;
	
	@Value("54f")
	private float weight;
	
	@Value("4")
	private double sleepTime;
	
	@Value("M")
	private char gender;
	
	@Value("false")
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

	public void setSleepTime(double sleepTime) {
		this.sleepTime = sleepTime;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
}
