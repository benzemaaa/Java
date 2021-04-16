package com.thread.thread;

public class Thread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("a");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread01 t = new Thread01();
        Thread01 t1 = new Thread01();
        t.start();

//        t1.start();
        for (int i = 0; i < 200; i++) {
            System.out.println(i);
            sleep(1_000);
        }
    }

}
