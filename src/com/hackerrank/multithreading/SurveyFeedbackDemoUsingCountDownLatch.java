package com.hackerrank.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TeamMember implements Runnable {
    private int delay;
    private String name;
    private CountDownLatch latch;

    TeamMember(int delay, String name, CountDownLatch latch) {
        this.delay = delay;
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("feedback Given by " + name);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
    }
}

public class SurveyFeedbackDemoUsingCountDownLatch {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(new TeamMember(1000, "Member-1", latch));
        service.execute(new TeamMember(1000, "Member-2", latch));
        service.execute(new TeamMember(1000, "Member-3", latch));
        service.execute(new TeamMember(1000, "Member-4", latch));
        try {
            latch.await();
            System.out.println("All four Members have given feedback. you can submit to higher mmgmt now");
        } catch (InterruptedException e) {
        }
    }
}
