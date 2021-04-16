package com.advanced.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        Collections.addAll(list,"messi","ronaldo","neymar","messa");
        Collections.shuffle(list);
//        System.out.println(list);
        list1.addAll(list);

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list1);
    }
}
