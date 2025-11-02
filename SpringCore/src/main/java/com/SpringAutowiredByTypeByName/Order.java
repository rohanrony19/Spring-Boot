package com.SpringAutowiredByTypeByName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int id;
    private String location;

    // byName bcz byType is same
    @Autowired
    private Product product1;

    @Autowired
    private Product product2;

    public Order(){
        System.out.println("order is created by spring...");
    }

    public void display(){
        product2.list();
    }
}
