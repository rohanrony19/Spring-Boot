package com.SpringAutowiredByTypeByName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("product2")
@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;

    public Product(){
        System.out.println("product is created by spring...");
    }

    public void list(){
        System.out.println("List of product2");
    }

}
