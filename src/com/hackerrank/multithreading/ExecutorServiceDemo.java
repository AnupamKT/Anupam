package com.hackerrank.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableTest implements Runnable {
    String name;

    RunnableTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am " + name + "thread");
        }
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am main thread");
        }
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.execute(new RunnableTest("t1"));
        service.execute(new RunnableTest("t2"));
        service.execute(new RunnableTest("t3"));
        service.execute(new RunnableTest("t4"));
        service.execute(new RunnableTest("t5"));
    }
}
