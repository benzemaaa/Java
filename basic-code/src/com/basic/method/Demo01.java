package com.basic.method;

public class Demo01 {
    public static void main(String[] args) {
//        int sum = add(1,2);
//        System.out.println(sum);
        System.out.println(max(1, 2));
    }
    public static int add(int a, int b){
        return a + b;
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }
}
