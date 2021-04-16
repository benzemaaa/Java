package com.advanced.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections04 {
    public static void main(String[] args) {
        ArrayList<Collections03Std> stds = new ArrayList<>();
        Collections.addAll(stds, new Collections03Std("messi",18),
                new Collections03Std("ronaldo",19), new Collections03Std("neymar",21));

        System.out.println(stds);

//        Collections.sort(stds, new Comparator<Collections03Std>() {
//            @Override
//            public int compare(Collections03Std o1, Collections03Std o2) {
//                if(o1.name > o2.name)
//                return o1.name - o2.name;
//            }
//        });

        Collections.sort(stds);
        System.out.println(stds);
    }
}
