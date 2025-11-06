package com.rohan.di.setter.injection;

import java.awt.CardLayout;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.rohan.di.constructor.injection.Animal;
import com.rohan.di.constructor.injection.Lion;
import com.rohan.di.interfaces.Car;

@Configuration
public class SpringConfiguration {

//	@Primary
	@Bean("studentTwo")
	public Student getStudentTwo() {
		System.out.println("StudentTwo is creating via Bean method");
		Student student = new Student();
		student.setId(11);
		student.setName("Rohan");
		student.setFees(100000);
		return student;
	}
	
	@Bean
	public University getUniversity() {
		System.out.println("University is creating via Bean method");
		University university = new University();
		university.setName("vtu");
		university.setPincode(577111);
		getCollege();
		return new University();
	}
	
	@Bean("college")
	public College getCollege() {
		College college = new College();
		college.setName("Pesitm");
		college.setLocation("Shivamogga");
		college.setPincode(577201);
		return college;
	}
	
	@Bean("lion")
    public Lion getLion() {
		System.out.println("getLion is called...");
        return new Lion("Simba",5,"Non-Veg");
    }
	
	@Bean("animal")
	public Animal getAnimal(Lion lion) {
		return new Animal(getLion());
	}
	
	@Primary
	@Bean
	public Car car2() {
		System.out.println("car2 is created...........");
		return new Car();
	}
}
