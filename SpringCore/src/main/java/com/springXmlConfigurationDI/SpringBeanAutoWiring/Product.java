package com.springXmlConfigurationDI.SpringBeanAutoWiring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Bean-Auto wiring without using ref
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private double productPrice;
}
