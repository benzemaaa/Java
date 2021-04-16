package com.advanced.map;

import java.util.Objects;

public class Map03Std {
    public String name;
    public int age;

    public Map03Std(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Map03Std{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Map03Std map03Std = (Map03Std) o;
        return age == map03Std.age &&
                Objects.equals(name, map03Std.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
