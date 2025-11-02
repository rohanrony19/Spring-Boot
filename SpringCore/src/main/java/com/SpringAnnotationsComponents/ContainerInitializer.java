package com.SpringAnnotationsComponents;

import com.SpringAnnotationsComponent1.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerInitializer {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

//        Order order = (Order) container.getBean("o1");
//        System.out.println(order);

        System.out.println("***************************************");

        Student s1 = (Student) container.getBean("student");
        System.out.println(s1);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());

        Student s2 = (Student) container.getBean("student1");
        System.out.println(s2);
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getMarks());

        Student s3 = (Student) container.getBean("student2");
        System.out.println(s3);
        System.out.println(s3.getId());
        System.out.println(s3.getName());
        System.out.println(s3.getMarks());
    }
}
