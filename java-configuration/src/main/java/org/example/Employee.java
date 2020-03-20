package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Employee {

    private String name;
    private  int age;
    private  Double salary;
    private List<String> taskList;

    @Autowired(required = false)
    private Department department;

    public Employee(Department department,String name,int age,Double salary,List taskList){
        this.department=department;
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.taskList=taskList;

    }



    public void print(){

        System.out.println("name : "+name +", age : "+age+", salary : "+salary+" , "+department);
        System.out.println("task list :");
        for(String item: taskList){
            System.out.println(item + " ");
        }
    }

}
