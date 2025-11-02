package com.SpringAutowiredByTypeByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Order order = context.getBean(Order.class);
        order.display();

        System.out.println("*************************");

        Animal animal = (Animal) context.getBean("animal");
        animal.action();
    }
}
