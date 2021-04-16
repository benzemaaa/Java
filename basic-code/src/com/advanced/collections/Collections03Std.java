package com.advanced.collections;

public class Collections03Std implements Comparable<Collections03Std>{
    String name;
    int age;

    public Collections03Std(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Collections03Std() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Collections03Std{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Collections03Std o) {
        return this.age - o.age;

    }
}
