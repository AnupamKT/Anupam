package com.hackerrank.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class BusSeat {
    int totalSeat = 50;
    private ReentrantLock l;

    BusSeat(ReentrantLock l) {
        this.l = l;
    }

    public void book(String name) {
        l.lock();
            System.out.println("Thread " + name + " is booking seat");
            totalSeat--;
            System.out.println("seat booked. available seat " + totalSeat);
        l.unlock();
    }
}

class BusSeatRunnable implements Runnable {
    private BusSeat seat;
    private String name;

    BusSeatRunnable(BusSeat seat, String name) {
        this.seat = seat;
        this.name = name;
    }

    @Override
    public void run() {
        seat.book(name);
    }
}

public class NewLockMechanismDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        ReentrantLock l = new ReentrantLock();
        BusSeat s = new BusSeat(l);
        service.execute(new BusSeatRunnable(s, "t1"));
        service.execute(new BusSeatRunnable(s, "t2"));
        service.execute(new BusSeatRunnable(s, "t3"));
        service.execute(new BusSeatRunnable(s, "t4"));
        service.execute(new BusSeatRunnable(s, "t5"));
    }
}
