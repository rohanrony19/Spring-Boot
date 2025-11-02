package com.springAnnotationViaFieldInjection;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Address {
    private int pincode;
    private String city;

    public Address(){
        System.out.println("Address is created...");
    }
}
