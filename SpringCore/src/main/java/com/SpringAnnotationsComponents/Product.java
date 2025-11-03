package com.SpringAnnotationsComponents;

import com.springAnnotationsComponent2.Menu;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@AllArgsConstructor
@ToString
public class Product {
    private int id;
    private String name;
    private double price;

    @Autowired
    private Menu menu;


    public Product(){
        System.out.println("Product object is created by Spring container...");
    }
}
