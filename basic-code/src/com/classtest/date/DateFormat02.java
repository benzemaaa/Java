package com.classtest.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat02 {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//        Date date = new Date();
//        String str = sdf.format(date);
//        System.out.println(date);
//        System.out.println(str);
        Date date = new Date();
        String str = "2020-1-1 17-5805";

        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            System.out.println("解析异常");
        } finally {
            System.out.println("finally");
        }


        System.out.println(date);
        System.out.println(str);

    }
}
