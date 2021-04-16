package com.advanced.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        show01();
    }

    public static void show01(){
        List<String> list = new LinkedList<>();
        list.add("messi");
        list.add("ronaldo");
        list.add("neymar");

        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.set(0, "benzema"));
    }

    public static void show02(){
        LinkedList list = new LinkedList<>();

    }
}
