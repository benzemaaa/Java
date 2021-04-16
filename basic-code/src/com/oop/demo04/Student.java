package com.oop.demo04;

public class Student extends Person{
    private String name = "ronaldo";
    private int age = 18;

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
