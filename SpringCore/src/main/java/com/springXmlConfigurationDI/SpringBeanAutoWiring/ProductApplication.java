package com.springXmlConfigurationDI.SpringBeanAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProductApplication {
    public static void main(String[] args) {
        ApplicationContext container = new FileSystemXmlApplicationContext("D:\\Spring-Boot\\SpringCore\\src\\main\\resources\\spring-bean-auto-wiring.xml");

        Cart cart = (Cart) container.getBean("cart");
        System.out.println(cart.getNoOfItems());

        Product p1 = cart.getProduct();
        System.out.println(p1);
        System.out.println(p1.getProductId());
        System.out.println(p1.getProductName());
        System.out.println(p1.getProductPrice());

        System.out.println("***************************************");

        Order order = (Order) container.getBean("order");
        System.out.println(order.getCart().getNoOfItems());
        System.out.println(order.getCart().getProduct().getProductId());
        System.out.println(order.getCart().getProduct1().getProductName());
        System.out.println(order.getCart().getProduct1().getProductPrice());
        System.out.println(order.getCart().getProduct());
    }
}
