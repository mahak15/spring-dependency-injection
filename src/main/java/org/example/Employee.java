package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@PropertySource("Employee.properties")
public class Employee {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Value("${salary}")
    private Double salary;
    @Value("${list1}")
    private String list1;
    @Value("${list2}")
    private String list2;
    @Value("${list3}")
    private  String list3;

    private List<String> taskList;
    public void setTaskList() {
        List<String> list = new LinkedList<String>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        this.taskList = list;
    }

    @Autowired
    private Department department;

    public Employee() {
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + department +
                " : TaskList is as follows : " + taskList +
                '}';
    }
}
