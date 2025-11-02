package com.springAnnotationBeans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class College {
    private String collegeName;
    private int count;

    public College(){
        System.out.println("College is created");
    }
}
