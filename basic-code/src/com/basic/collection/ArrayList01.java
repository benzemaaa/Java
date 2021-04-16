package com.basic.collection;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("messi");
        list.add("ronaldo");
        list.add("neymar");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
