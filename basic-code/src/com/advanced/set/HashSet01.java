package com.advanced.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        String s1 = "123";
        System.out.println(s1.hashCode());
        String s2 = "1234";
        System.out.println(s1.hashCode());
        String s3 = "重地";
        System.out.println(s3.hashCode());
        String s4 = "通话";
        System.out.println(s4.hashCode());

    }
}
