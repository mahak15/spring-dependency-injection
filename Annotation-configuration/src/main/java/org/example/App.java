<<<<<<< HEAD:src/main/java/org/example/App.java
package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
       Employee emp= (Employee) context.getBean("employee");
       emp.setTaskList();
     System.out.println(emp);


    }
}
=======
package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        System.out.println(context.getBean("employee"));

    }
}
>>>>>>> e00b2eec65a07d397db4071a466c752d53f763cb:Annotation-configuration/src/main/java/org/example/App.java
