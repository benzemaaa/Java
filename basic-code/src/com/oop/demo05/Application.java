package com.oop.demo05;

public class Application {
    public static void main(String[] args) {
        Person s1 = new Student();
        Student s2 = new Student();

//        s1.test();
//        s2.test();

        ((Student)s1).test2();
        s2.test2();


    }
}
