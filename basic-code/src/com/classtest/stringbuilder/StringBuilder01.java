package com.classtest.stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sbu1 = new StringBuilder();
        System.out.println(sbu1);

        StringBuilder sbu2 = new StringBuilder("abc");
        System.out.println(sbu2);

        sbu1.append(true);
        System.out.println(sbu1);
        sbu1.append("messi");
        System.out.println(sbu1);
//        链式编程
        sbu1.append(1).append(false).append("c").append('c');
        System.out.println(sbu1);



    }
}
