package com.classtest.object;

public class ToString {
    public static void main(String[] args) {
        Person p1 = new Person(null,18);
        Person p2 = new Person("messi", 18);
        System.out.println(p1.equals(p2));

    }
}
