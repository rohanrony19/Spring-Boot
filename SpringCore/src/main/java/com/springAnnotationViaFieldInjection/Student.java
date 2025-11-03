package com.springAnnotationViaFieldInjection;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("s1")
@Getter
public class Student {
    // Instance variable/variable/field/property
    private int id;
    private String name;

    // Field injection
    @Autowired
    public Address rony;

    public Student(){
        System.out.println("Student is created...");
    }
    //without using setter and constructor only with field injection
}
