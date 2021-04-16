package com.advanced.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet02 {
    public static void main(String[] args) {
        Set<HashSet03SaveStudent> stds = new HashSet<HashSet03SaveStudent>();
        stds.add(new HashSet03SaveStudent("messi",18));
        stds.add(new HashSet03SaveStudent("ronaldo",19));
        stds.add(new HashSet03SaveStudent("neymar",24));
        stds.add(new HashSet03SaveStudent("neymar",24));

        System.out.println(stds);


    }
}
