package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Configuration

public class EmployeeConfig {
    @Bean
    @Scope("prototype")

    public Department department(){
        return new Department("PTO",new Date());
    }
    @Bean
    public Employee employee(){
        List<String> taskList = new LinkedList<>();
        taskList.add("Spring");
        taskList.add("MVC");
        taskList.add("XML");
        return new Employee(department(),"Mahak",25,50000.00,taskList);
    }




}
