package com.springXmlConfigurationDI.SpringBeanAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HospitalApplication {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Spring-Boot\\SpringCore\\src\\main\\resources\\spring-bean-auto-wiring.xml");

        Hospital hospital = (Hospital) context.getBean("hospital");
        System.out.println(hospital);
        System.out.println(hospital.getName());
        System.out.println(hospital.getPatient());
        System.out.println(hospital.getPatient().getId());
        System.out.println(hospital.getPatient().getName());
    }
}
