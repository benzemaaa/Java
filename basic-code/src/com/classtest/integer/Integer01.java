package com.classtest.integer;

public class Integer01 {
    public static void main(String[] args) {
//        int转化成String 加上""空字符串直接相连就行了
        int i1 = 100;
        String s1 = i1+"";
        System.out.println(s1+200);
//        Integer.parseInt(str) 将字符串转化为int
        int i2 = Integer.parseInt(s1);
        System.out.println(i2);
    }
}
