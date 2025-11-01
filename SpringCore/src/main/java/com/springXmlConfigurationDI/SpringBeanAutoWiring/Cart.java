package com.springXmlConfigurationDI.SpringBeanAutoWiring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cart {
    private int noOfItems;
    private Product product;
    private Product product1;
}
