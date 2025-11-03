package com.springAnnotationBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationsDemo1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

        Student student1 = (Student) context.getBean("student2");
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getMarks());
        System.out.println(student1.getCollege().getCollegeName());

        System.out.println("--------------------------");

        Student student = (Student) context.getBean("getStudent");
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getMarks());
        System.out.println(student.getCollege().getCollegeName());

        System.out.println("-----------------------------");

        College college = (College) context.getBean("college1");
        System.out.println(college);
        System.out.println(college.getCollegeName());
        System.out.println(college.getCount());

        System.out.println("---------------------------");

        College clg = (College) context.getBean("getCollege3");
        System.out.println(clg);
        System.out.println(clg.getCollegeName());
        System.out.println(clg.getCount());
    }
}
