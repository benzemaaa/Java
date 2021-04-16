package com.basic.collection;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        Integer i1 = 1;
        i1 = i1 + 5;

        Character ch = 'c';

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
