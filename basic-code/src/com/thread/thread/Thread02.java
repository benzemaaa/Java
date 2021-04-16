package com.thread.thread;

public class Thread02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println('a');
        }
    }

    public static void main(String[] args) {
        Thread02 p = new Thread02();
        Thread t = new Thread(p);
        t.start();

        for (int i = 0; i < 800; i++) {
            System.out.println(i);
        }
    }
}
