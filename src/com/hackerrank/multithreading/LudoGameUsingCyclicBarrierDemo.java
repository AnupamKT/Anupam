package com.hackerrank.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Players implements Runnable {
    private int delay;
    private String name;
    private CyclicBarrier barrier;

    Players(int delay, String name, CyclicBarrier barrier) {
        this.delay = delay;
        this.name = name;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(name + "joined and waiting for other thread");
        try {
            Thread.sleep(delay);
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("game started " + name + " turn now");
    }
}

public class LudoGameUsingCyclicBarrierDemo {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier barrier = new CyclicBarrier(4);
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(new Players(1000, "player-1", barrier));
        service.execute(new Players(2000, "player-2", barrier));
        service.execute(new Players(3000, "player-3", barrier));
        service.execute(new Players(4000, "player-4", barrier));
    }
}
