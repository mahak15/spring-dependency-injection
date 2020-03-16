package org.example.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormat {
    private static String datePattern;
    public static Date getDate(String datePattern, String date) throws ParseException {
        return new SimpleDateFormat(datePattern).parse(date);
    }
}
