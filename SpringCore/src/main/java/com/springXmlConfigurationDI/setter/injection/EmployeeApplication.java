package com.springXmlConfigurationDI.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeApplication {
    public static void main(String[] args) {
        // Configuring using XML based Configuration
        // Using ApplicationContext rather than BeanFactory in IOC Container
        // Spring Container / IOC created and reads the xml file to create bean
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\SpringCore\\src\\main\\resources\\spring-setter.xml");

        //Bean object is created with bean id = employee1 by container
        Object obj = context.getBean("employee1");

        //Typecasting Created Bean Object to Employee
        Employee emp = (Employee) obj;

        //Calling method inside Employee
        System.out.println("Before values updated");
        emp.details();

        System.out.println("-------------------------");

        // You are manually configuring the value but uh need to give configuration to spring Framework
        emp.salary = "1000";
        System.out.println("After values updated");
        emp.details();
    }

}
