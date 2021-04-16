package com.basic.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericClass03 {
    public static void main(String[] args) {
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(new Student("messi",18));
        stds.add(new Student("neymar",17));
        stds.add(new Student("ronaldo",28));
        stds.add(new Student());

        System.out.println(stds);

        Iterator<Student> it = stds.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }


}
