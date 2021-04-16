package com.oop.demo07;

public class Exception01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
