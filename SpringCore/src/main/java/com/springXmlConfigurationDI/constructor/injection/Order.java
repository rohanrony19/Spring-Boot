package com.springXmlConfigurationDI.constructor.injection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String emailId;
    private CartItems cartItems;

    public Order(){
        System.out.println("Order with no argument");
    }

    public Order(String emailId, CartItems cartItems) {
        this.emailId = emailId;
        this.cartItems = cartItems;
    }

}
