package com.advanced.collections;

public class Collections01 {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5,6));
    }

    public static int add(int... arr){
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        return sum;
    }

}



