package com.oop.demo02;

public class Application {
    public static void main(String[] args) {
        Student student01 = new Student();
//        student01.name = "messi";
//        student01.age = 18;
//        student01.study();
        Student student02 = new Student("ronaldo", 19);
        student02.study();
    }
}
