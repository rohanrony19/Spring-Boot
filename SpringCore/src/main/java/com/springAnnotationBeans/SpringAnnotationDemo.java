package com.springAnnotationBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemo {
    public static void main(String[] args) {
        // create container object, we can add more config files
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);

        Student s2 = (Student) context.getBean("student2");
        System.out.println(s2);

        College c1 = (College) context.getBean("college1");
        System.out.println(c1);
        System.out.println(c1.getCollegeName());
        System.out.println(c1.getCount());

        College c2 = (College) context.getBean("college2");
        System.out.println(c2);
        System.out.println(c2.getCollegeName());
        System.out.println(c2.getCount());
    }
}
