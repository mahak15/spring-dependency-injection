
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
