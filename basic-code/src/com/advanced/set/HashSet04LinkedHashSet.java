package com.advanced.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet04LinkedHashSet {
    public static void main(String[] args) {
        // 无序, 因为根据hashcode存储
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(47);
        hashSet.add(5);
        System.out.println(hashSet);

        // 有序 多了一条链表记录元素相对位置
        LinkedHashSet<Integer> hashSet2 = new LinkedHashSet<>();
        hashSet2.add(1);
        hashSet2.add(20);
        hashSet2.add(30);
        hashSet2.add(47);
        hashSet2.add(5);
        System.out.println(hashSet2);
    }
}
