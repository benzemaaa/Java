package com.classtest.system;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 4, 5};
        int [] nums2 = {6, 7, 8, 9, 10};
//        int[] nums1 = new int[]{1, 2, 3, 4, 5};
//        int[] nums2 =  new int[]{6, 7, 8, 9, 10};

        System.arraycopy(nums1,0, nums2,0,3);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
