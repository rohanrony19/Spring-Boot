package com.SpringAutowiredByTypeByName;

import org.springframework.stereotype.Component;

@Component
public class Lion {
    private int height;
    private String type;

    public Lion(){
        System.out.println("Lion bean is created by spring...");
    }

    public void action(){
        System.out.println("Lion is roaring...");
    }
}
