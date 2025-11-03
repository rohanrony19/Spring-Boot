package com.springAnnotationBeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Student {
    private int id;
    private String name;
    private int marks;
    private College college;

    public Student(){
        System.out.println("Student object is created");
    }



}
