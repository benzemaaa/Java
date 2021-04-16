package com.basic.array;

import java.util.Arrays;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //静态初始化：创建 + 赋值
        int[] nums1 = {1,2,3,4,5,6};
        //动态初始化：创建,包含默认初始化
//        int[] nums2 = new int[10];
        Arrays.sort(nums1);
//        System.out.println(nums1); 打印nums1得到 hashcode [I@1b6d3586
        System.out.println(Arrays.toString(nums1));

//        for (int i : nums1) {
//            System.out.println(i);
        }
}
