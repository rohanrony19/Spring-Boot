package com.springXmlConfigurationDI.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;
import java.util.Set;

public class ProductApplication {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\SpringCore\\src\\main\\resources\\spring-setter.xml");

        Product p1 = (Product) context.getBean("product1");
        System.out.println(p1);
        Product p2 = (Product) context.getBean("product2");
        System.out.println(p2);

        System.out.println("---------------List---------------------");
        // For Order
        Order o1 = (Order) context.getBean("order1");
        System.out.println(o1);
        System.out.println(o1.getOrderId());
        System.out.println(o1.getProductList());

        List<String> o2 = o1.getProductList();
        System.out.println("Size of Product List : " + o2.size());
        o2.forEach(System.out::println);

        System.out.println("----------------Set--------------------");

        Set<Integer> o3 = o1.getPrice();
        System.out.println(o3);
        System.out.println("Size of Product price: " + o3.size());
        o3.forEach(System.out::println);

        System.out.println("-------------------Map---------------------");

        Order o4 =  (Order) context.getBean("order2");
        System.out.println(o4.getProductAndPrice());


    }
}
