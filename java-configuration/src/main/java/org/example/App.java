package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee = context.getBean("employee",Employee.class);
        employee.print();
        System.out.println(employee);

    }
}
