package com.thread.thread;

public class Thread03 implements Runnable{
    private static int ticket = 10;

    @Override
    public void run() {
        while(true){
            if(ticket < 0)
                break;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+""+ticket--);
        }
    }

    public static void main(String[] args) {

        Thread03 t1 = new Thread03();
        Thread03 t2 = new Thread03();
        Thread03 t3 = new Thread03();

        new Thread(t1, "messi").start();
        new Thread(t2, "ronaldo").start();
        new Thread(t3, "neymar").start();

        for (int i = ticket; i > 0; i--) {

        }
    }

}
