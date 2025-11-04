package com.springXmlConfigurationDI.SpringBeanAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentApplication {
    public static void main(String[] args) {
        ApplicationContext container = new FileSystemXmlApplicationContext("D:\\Spring-Boot\\SpringCore\\src\\main\\resources\\spring-bean-auto-wiring.xml");

        College college = (College) container.getBean("college");
        System.out.println(college.getS1());
        System.out.println(college.getS1().getId());
        System.out.println(college.getS1().getName());
    }
}
