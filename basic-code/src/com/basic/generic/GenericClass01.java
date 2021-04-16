package com.basic.generic;

public class GenericClass01 {
    public static void main(String[] args) {
        GenericClass02<Integer> list = new GenericClass02<Integer>();
        list.setName(2);
        list.add(3);
        System.out.println(list.getName());

        GenericClass02<String> list2 = new GenericClass02<>();
        list2.setName("messi");
        System.out.println(list2.getName());

    }
}
