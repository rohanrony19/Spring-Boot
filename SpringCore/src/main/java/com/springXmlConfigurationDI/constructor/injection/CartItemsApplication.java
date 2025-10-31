package com.springXmlConfigurationDI.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CartItemsApplication {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\SpringCore\\src\\main\\resources\\spring-constructor1.xml"," D:\\SpringCore\\src\\main\\resources\\spring-bean-wiring.xml");

        CartItems ct = (CartItems) context.getBean("cart2");

        System.out.println(ct.getName());
        System.out.println(ct.getItemNames());
        System.out.println(ct.getItemAndPrice());

        System.out.println("----------------------------------");

        Order order = (Order) context.getBean("order1");
        System.out.println(order.getEmailId());
        System.out.println(order.getCartItems().getName());
        System.out.println(order.getCartItems().getItemNames());
        System.out.println(order.getCartItems().getItemAndPrice());
        System.out.println(order.getCartItems().getProduct().getId());
        System.out.println(order.getCartItems().getProduct().getName());
        System.out.println(order.getCartItems().getProduct().getPrice());

        System.out.println("------------------------------------");

        CartItems ct1 = (CartItems) context.getBean("cart3");

        System.out.println(ct1.getName());
        System.out.println(ct1.getItemNames());
        System.out.println(ct1.getItemAndPrice());
        System.out.println(ct1.getProduct().getId());
        System.out.println(ct1.getProduct().getName());
        System.out.println(ct1.getProduct().getPrice());

        System.out.println("---------------------------------");

        Product product = (Product) context.getBean("product1");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
