package com.hackerrank.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Rollercoster {
    static void ride(String riderName) {
        System.out.println(riderName + " is enjoying ride");
    }
}

class Rider implements Runnable {
    private Semaphore sem;
    private String name;

    Rider(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println(name + " got the lock");
            Thread.sleep(2000);
            Rollercoster.ride(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem.release();
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(6);
        Semaphore sem = new Semaphore(2);
        Semaphore sema = new Semaphore(2, true);
        service.execute(new Rider(sem, "John"));
        service.execute(new Rider(sem, "Bob"));
        service.execute(new Rider(sem, "Mary"));
        service.execute(new Rider(sem, "Jane"));
        service.execute(new Rider(sem, "Chris"));
        service.execute(new Rider(sem, "Mike"));
    }
}
