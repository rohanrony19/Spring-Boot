package com.springAnnotationsComponent2;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@AllArgsConstructor
@ToString
public class Menu {
    private String name;
    private int totalItems;

    public Menu(){
        System.out.println("Menu is created by spring container");
    }
}
