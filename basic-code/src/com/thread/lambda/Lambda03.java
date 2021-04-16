package com.thread.lambda;

public class Lambda03 {
    public static void main(String[] args) {
        Love1 lo = new Love1() {
            @Override
            public void love(int n) {
                System.out.println(n);
            }
        };
        lo.love(1);
//
//        lo = (n)->{
//            System.out.println(n);
//        };
        lo.love(10);
    }



}

abstract class Love1{
    public abstract void love(int n);
}
