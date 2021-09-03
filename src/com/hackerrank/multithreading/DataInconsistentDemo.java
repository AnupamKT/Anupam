package com.hackerrank.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class BookSeatRunnable implements Runnable {
    private Seat seat;
    private String name;

    BookSeatRunnable(Seat seat, String name) {
        this.seat = seat;
        this.name = name;
    }

    @Override
    public void run() {
        seat.book(name);
    }
}

public class DataInconsistentDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Seat s = new Seat();
        service.execute(new BookSeatRunnable(s, "t1"));
        service.execute(new BookSeatRunnable(s, "t2"));
        service.execute(new BookSeatRunnable(s, "t3"));
        service.execute(new BookSeatRunnable(s, "t4"));
        service.execute(new BookSeatRunnable(s, "t5"));
    }
}
