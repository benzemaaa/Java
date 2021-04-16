package com.oop.demo02;

public class Student {
    String name;
    int age;
    int height;

    public void study(){
        System.out.println(this.name + " is studing");
    }

    public  Student(){
        System.out.println("build");
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("build2");
    }
}
