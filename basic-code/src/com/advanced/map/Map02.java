package com.advanced.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map02 {
    public static void main(String[] args) {
        HashMap<Map03Std, Integer> map = new LinkedHashMap<>();
        map.put(new Map03Std("messi",18), 18);
        map.put(new Map03Std("ronaldo",19), 19);
        map.put(new Map03Std("neymar", 20), 20);
        map.put(new Map03Std("messi",18), 18);

        System.out.println(map);

        Set<Map.Entry<Map03Std, Integer>> set = map.entrySet();

        for(Map.Entry<Map03Std, Integer> entry : set){
            Map03Std std = entry.getKey();
            int age = entry.getValue();
            System.out.println(std +" " +age);

        }
    }


}
