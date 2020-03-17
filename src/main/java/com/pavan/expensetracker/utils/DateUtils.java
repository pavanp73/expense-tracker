package com.pavan.expensetracker.utils;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DateUtils {

    private static final String FORMAT = "dd-MM-yyyy";

    public static Date toDate(String dateInString) throws ParseException {
        return new SimpleDateFormat(FORMAT)
                .parse(dateInString);
    }

    public static String toString(Date date){
        return new SimpleDateFormat(FORMAT)
                .format(date);
    }

}
