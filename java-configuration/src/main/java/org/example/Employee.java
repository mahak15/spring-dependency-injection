package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private String name;
    private  int age;
    private  Double salary;

    private Department department;
    @Autowired(required = false)
    public Employee(Department department,String name,int age,Double salary){
        this.department=department;
        this.age=age;
        this.name=name;
        this.salary=salary;
    }

    public void print(){
        System.out.println("Name\t"+name);
        System.out.println("Age\t"+age);
        System.out.println("Salary\t"+salary);
        System.out.println(department.toString());
    }

}
