package com.basic.generic;

public class GenericMethod02 {
    public <E> void test1(E e){
        System.out.println(e);
    }

    public static <E> void test2(E e){
        System.out.println(e);
    }

}
