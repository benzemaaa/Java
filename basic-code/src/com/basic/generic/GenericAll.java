package com.basic.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("messi");
        list2.add("ronaldo");

        printArrayList(list1);
        printArrayList(list2);
//        ArrayList<ArrayList> list3 = new ArrayList<?>();

    }
    public static void printArrayList(Object array){
        

//        Iterator<?> it = array.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }
//    public static void printArrayList(ArrayList<?> array){
//
//        Iterator<?> it = array.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//    }


}
