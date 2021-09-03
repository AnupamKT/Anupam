package com.hackerrank.multithreading;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am child thread");
        }
    }
}

public class BasicThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am main thread");
        }
        MyRunnable r= new MyRunnable();
        Thread t = new Thread(() -> System.out.println("runnable thread"));
        t.start();
    }
}
