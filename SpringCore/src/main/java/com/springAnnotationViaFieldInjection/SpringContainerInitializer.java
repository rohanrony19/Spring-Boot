package com.springAnnotationViaFieldInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainerInitializer {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeansConfiguration.class);

        Student s1 = (Student) context.getBean("s1");
        System.out.println(s1);
//        System.out.println(s1.getAddress());


        Address address = s1.rony;
//        address.setCity("shimoga");
//        address.setPincode(577201);
        System.out.println(address.getCity());
        System.out.println(address.getPincode());
        System.out.println(address);

        Address address2 = (Address) context.getBean("address");
        System.out.println(address2.getCity());
        System.out.println(address2.getPincode());
    }
}
