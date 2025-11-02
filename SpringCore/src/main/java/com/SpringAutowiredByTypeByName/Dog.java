package com.SpringAutowiredByTypeByName;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private int age;
    private String type;

    public Dog(){
        System.out.println("Dog bean is created by spring...");
    }

    public void action(){
        System.out.println("dog is barking...");
    }
}
