package org.example;

import org.example.constructor.Employee;
import org.example.property.Details;
//import org.example.property.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //Constructor dependency code.
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
       Employee employee = context.getBean("employee",Employee.class);
       employee.print();
       System.out.println(employee);

        //property dependency code.
       /* Details details=new Details(1);
        details.service();
        Employee emp=new Employee();
        details.setService(emp);
        details.service();*/
       //method dependency code.
    }
}
