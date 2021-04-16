package com.basic.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {
        Collection<Integer> co = new ArrayList<>();
        co.add(1);
        co.add(4);
        co.add(5);
        co.add(3);
        co.add(8);
        co.add(2);
        co.add(7);

        for(Integer i : co){
            System.out.println(i);
        }

//        算不算接口Iterator 的实例化?
        Iterator<Integer> it = co.iterator();
//        Iterator<Integer > it = co.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
