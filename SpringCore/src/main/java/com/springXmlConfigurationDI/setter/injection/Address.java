package com.springXmlConfigurationDI.setter.injection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Address {
    private int pinCode;
    private String city;
    private String country;

    public Address(){
        System.out.println("Address Bean is created by Spring Container");
    }

    public boolean getCompleteAddress(){
        System.out.println("Address is " + city + "," + pinCode + "," + country);
        return false;
    }
}
