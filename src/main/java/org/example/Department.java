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
