package com.advanced.set;

import java.util.Objects;

public class HashSet03SaveStudent {
    private String name;
    private int age;

    public HashSet03SaveStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "HahSet03SaveStudent{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashSet03SaveStudent that = (HashSet03SaveStudent) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
