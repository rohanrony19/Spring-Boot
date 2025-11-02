package com.SpringAutowiredByTypeByName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    private int age;
    private int name;

    //byType
    @Autowired
    private Lion lion;

    @Autowired
    private Dog dog;

    public void action(){
        lion.action(); // lion is barking...
    }
}
