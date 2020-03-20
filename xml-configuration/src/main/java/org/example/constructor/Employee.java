package org.example.constructor;

import org.example.constructor.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    private Double salary;
    private List<String> taskList;

    @Autowired
    private Department department;

    public Employee(Department department, String name, int age, Double salary, List<String> taskList) {
        this.department = department;
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.taskList = taskList;
    }


    public Employee() {

    }

    public void print() {
        System.out.println("name : " + name + ", age : " + age + ", salary : " + salary + " , " + department);
        System.out.println("task list :");
        for (String item : taskList) {
            System.out.println(item + " ");
        }

    }
}
