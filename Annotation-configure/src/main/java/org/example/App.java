package org.example;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

        public class App {

            public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
                Employee employee = context.getBean(Employee.class);
                employee.print();


            }

        }

