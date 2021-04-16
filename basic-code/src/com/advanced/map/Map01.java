package com.advanced.map;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set2 = new HashSet<String>();
        map.put("messi", 18);
        map.put("ronaldo", 19);
        map.put("neymar", 20);

//        System.out.println(map.get("messi"));

//        Set<String> set = map.keySet();
//        Iterator<String> it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(map.get(it.next()));
//        }

       Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry e = it.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        for (Map.Entry e: set){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }



    }
}
