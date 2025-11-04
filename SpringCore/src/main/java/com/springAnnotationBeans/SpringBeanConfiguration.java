package com.springAnnotationBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring Beans configuration action as xml file
@Configuration
public class SpringBeanConfiguration {

    // student class
    @Bean("student1")
    public Student getStudent1(){
        return new Student();
    }

    @Bean("student2")
    public Student getStudent2(){
        System.out.println("using setter injection for bean creation");
        Student s1 = new Student();
        s1.setId(2);
        s1.setName("raji");
        s1.setMarks(69);
        s1.setCollege(getCollege2());
        return s1;
    }

    @Bean
    public Student getStudent(){
        System.out.println("using constructor injection for bean creation");
        return new Student(1,"rohan",68,getCollege3());
    }

    @Bean("college1")
    public College getCollege1(){
        System.out.println("college 1 executed");
        return getCollege3();
//        return new College();
    }

    @Bean("college2")
    public College getCollege2(){
        College college = new College();
        college.setCollegeName("Pesitm");
        college.setCount(1000);
        return college;
    }

    // same bean id , ignored it
    @Bean("college2")
    public College getCollege(){
        College college = new College();
        college.setCollegeName("Pes");
        college.setCount(2000);
        return college;
    }

    // without bean id, we have use method name as bean id
    @Bean
    public College getCollege3(){
        College college = new College();
        college.setCollegeName("JNNCE");
        college.setCount(4000);
        return college;
    }






}
