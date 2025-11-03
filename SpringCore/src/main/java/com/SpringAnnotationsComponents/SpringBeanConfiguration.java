package com.SpringAnnotationsComponents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.SpringAnnotationsComponents")
//@ComponentScan("com.springAnnotationsComponent2")
//@ComponentScan("com.springAnnotationsComponent1")
//@ComponentScan("com.*")
// or use basePackages use only when we have more than 1 package
//@ComponentScan(basePackages = {"com.SpringAnnotationsComponents","com.SpringAnnotationsComponent2","com.SpringAnnotationsComponent1"})
public class SpringBeanConfiguration {

    @Bean("student1")
    public Student getStudent1(){
        System.out.println("Bean object is created for student1 inside config");
        int total = 625;
        double avg = (double) total /2;
        return new Student(21,"rony",avg);
    }

    @Bean("student2")
    public Student getStudent2(){
        System.out.println("Bean object is created for student2 inside config");
        Student s = new Student();
        s.setId(1);
        s.setName("sonu");
        s.setMarks(86);
        return s;
    }


}
