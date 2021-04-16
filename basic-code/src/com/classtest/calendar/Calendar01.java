package com.classtest.calendar;

import java.util.Calendar;
import java.util.Date;

public class Calendar01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2018);
        calendar.set(1999,6,22);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
