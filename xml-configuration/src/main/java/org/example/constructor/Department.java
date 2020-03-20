package org.example.constructor;

import java.util.Date;

public class Department {
    private String departmentName;
    private Date createOn;
   public Department(String departmentName,Date createOn)
    {
        this.departmentName=departmentName;
        this.createOn=createOn;
    }

    @Override
    public String toString() {
        return "Department{"+
                "departmentName='\t"+departmentName+'\''+"create On=\t"+createOn+'}';
    }
}
