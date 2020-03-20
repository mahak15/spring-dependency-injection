package org.example;

import org.example.constructor.Employee;
import org.example.property.Details;
//import org.example.property.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //Constructor dependency code.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Employee employee = (Employee) context.getBean("employee");
        employee.print();
        context.close();


        //property dependency code.
       /* Details details=new Details(1);
        details.service();
        Employee emp=new Employee();
        details.setService(emp);
        details.service();*/
       //method dependency code.
    }
}
