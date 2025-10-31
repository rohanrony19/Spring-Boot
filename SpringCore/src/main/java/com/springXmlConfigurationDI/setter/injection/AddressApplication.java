package com.springXmlConfigurationDI.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AddressApplication {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\SpringCore\\src\\main\\resources\\spring-setter1.xml");

        Student s1 = (Student) context.getBean("s1");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getAddress());

        Address a1 = (Address) context.getBean("home");
        System.out.println(a1);
        System.out.println(a1.getCompleteAddress());
    }
}
