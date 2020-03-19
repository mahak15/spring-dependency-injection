<<<<<<< HEAD:Annotation-configuration/src/main/java/org/example/DateFormat.java
package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component
@PropertySource("Employee.properties")
public class DateFormat {
    @Value("${date}")
    private String initDate;

    public  static Date parse(String pattern, String currentDate) {
        Date parseDate= null;
        try {
            parseDate = new SimpleDateFormat(pattern).parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }
=======
package org.example;
import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component(value = "stringToDate")
public class StringToDate {
    public  static Date parse(String pattern, String currentDate) {
        Date parseDate= null;
        try {
            parseDate = new SimpleDateFormat(pattern).parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }
>>>>>>> e00b2eec65a07d397db4071a466c752d53f763cb:Annotation-configuration/src/main/java/org/example/StringToDate.java
}