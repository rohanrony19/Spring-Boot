package com.springXmlConfigurationDI.setter.injection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String name;
    private double age;

    // Other class: Inject Address class object into Student class
    private Address address;

    public Student(){
        System.out.println("Student object/Bean is Created by IOC Container");
    }
}
