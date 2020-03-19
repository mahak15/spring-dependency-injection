<<<<<<< HEAD:src/main/java/org/example/Department.java
package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
@Component(value = "department")
@PropertySource("Employee.properties")
public class Department {

    @Value("${departmentName}")
    private String departmentName;


    @Autowired
    private DateFormat createdOn;

    public Department() {

    }

    public void setCreatedOn(DateFormat createdOn) {
        this.createdOn = createdOn;
    }

    public DateFormat getCreatedOn() {
        return createdOn;
    }

    @Override
    public String toString() {
        return  departmentName+ " : created on : "+ createdOn;
    }
}
=======
package org.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@PropertySource("Employee.properties")
public class Department {

    @Value("${departmentName}")
    private String departmentName;

    @Value("${dateFormat}")
    private String pattern;

    @Value("${date}")
    private String currentDate;

    private Date createdOn;

    public void setCreatedOn() {
        createdOn = StringToDate.parse(pattern, currentDate);
    }

    @Override
    public String toString() {
        return  departmentName+ " : created on : "+ createdOn;
    }
}
>>>>>>> e00b2eec65a07d397db4071a466c752d53f763cb:Annotation-configuration/src/main/java/org/example/Department.java
