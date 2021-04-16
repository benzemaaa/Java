package com.oop.demo03;

public class Application {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("messi");
        std1.setAge(18);

        System.out.println(std1.getName() + std1.getAge());
    }
}
