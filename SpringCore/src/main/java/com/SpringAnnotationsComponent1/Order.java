package com.SpringAnnotationsComponent1;

import com.SpringAnnotationsComponents.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("o1")
//@Component(value = "o1")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Order {
    private int id;

    @Autowired
    private Product product;

    public Order(){
        System.out.println("order is created");
    }

}
