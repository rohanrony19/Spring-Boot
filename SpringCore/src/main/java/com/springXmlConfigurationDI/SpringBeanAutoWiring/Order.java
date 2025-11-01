package com.springXmlConfigurationDI.SpringBeanAutoWiring;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
    private Cart cart;
}
