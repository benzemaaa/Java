package com.basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collection01 {
    public static void main(String[] args) {
        Collection<String> co = new ArrayList<>();
        co.add("messi");
        co.add("ronaldo");
        co.add("neymar");
        co.add("benzema");
        System.out.println(co);

//        boolean b1 = co.remove("messi");
        boolean b2 = co.contains("messi");
        boolean b3 = co.isEmpty();
        System.out.println(b3);

        Object[] obj = co.toArray();
        System.out.println(Arrays.toString(obj));

        for(String str: co){
            System.out.println(str);
        }
    }
}
