package com.classtest.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 请使用日期时间相关的API，计算出一个人已经出生了多少天。
public class Date02 {
    public static void main(String[] args) throws ParseException {

//        获取出生日期
        String str = null;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            str = sc.nextLine();
        }
        sc.close();

//        通过parse()把出生日期转化为日期, 并获取当前日期
        Date curDate = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date birthDate = sdf.parse(str);

        System.out.println(curDate);
        System.out.println(birthDate);

//        得到当前日期和出生日期的毫秒值
        long cur = curDate.getTime();
        long birth = birthDate.getTime();

        System.out.println(cur);
        System.out.println(birth);

//        相减得到出生了多少天
        long day = (cur - birth) / 1000 / 3600 / 24;
        System.out.println(day);

    }
}
