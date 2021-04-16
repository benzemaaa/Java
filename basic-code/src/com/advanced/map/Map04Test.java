package com.advanced.map;

import java.util.HashMap;

public class Map04Test {
    public static void main(String[] args) {
        Map03Std s1 = new Map03Std("messi",18);
        Map03Std s2 = new Map03Std("messi", 18);

        HashMap<Map03Std, Integer> map = new HashMap<>();
        map.put(s1,18);
        map.put(s2,18);

        System.out.println(map);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

        if(s1.equals(s2))
            System.out.println(1);
    }
}
