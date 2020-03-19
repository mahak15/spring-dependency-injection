
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
