package com.hackerrank.multithreading;

public class Seat {
    int totalSeat = 50;

    public void book(String name) {
        synchronized (this) {
            System.out.println("Thread " + name + " is booking seat");
            totalSeat--;
            System.out.println("seat booked. available seat " + totalSeat);
        }
    }
}
