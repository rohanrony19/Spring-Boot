package com.springXmlConfigurationDI.setter.injection;

public class Employee {
    private int empId;
    private String name = "rohan";
    public String company;
    public String salary;

    public Employee(){
        System.out.println("Object is created by Spring Container/IOC");
    }

    public void details(){
        System.out.println(empId);
        System.out.println(name);
        System.out.println(company);
        System.out.println(salary);
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
