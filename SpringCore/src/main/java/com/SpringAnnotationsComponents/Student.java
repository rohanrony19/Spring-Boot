package com.SpringAnnotationsComponents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(){
        System.out.println("student bean is created");
    }

}
