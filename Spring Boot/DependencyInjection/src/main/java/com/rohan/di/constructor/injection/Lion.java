package com.rohan.di.constructor.injection;

import org.springframework.stereotype.Component;

@Component
public class Lion {
		
	private String name;
	private int age;
	private String vegOrNonVeg;
	
	public Lion() {
		System.out.println("Lion is created....");
	}
	
	public Lion(String name, int age, String vegOrNonVeg) {
        this.name = name;
        this.age = age;
        this.vegOrNonVeg = vegOrNonVeg;
        System.out.println("Lion is created using constructor...");
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVegOrNonVeg() {
		return vegOrNonVeg;
	}
	public void setVegOrNonVeg(String vegOrNonVeg) {
		this.vegOrNonVeg = vegOrNonVeg;
	}
	
	@Override
    public String toString() {
        return "Lion [name=" + name + ", age=" + age + ", type=" + vegOrNonVeg + "]";
    }
	
	
}
