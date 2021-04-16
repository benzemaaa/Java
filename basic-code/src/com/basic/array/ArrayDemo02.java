package com.basic.array;

import java.util.Arrays;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 9, 3, 4, 2};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        for (int i:
             array1) {
            System.out.print(i);
        }
    }
}
