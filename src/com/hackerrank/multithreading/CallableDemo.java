package com.hackerrank.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTest implements Callable<Integer> {
    String name;

    CallableTest(String name) {
        this.name = name;
    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println("i am " + name + "thread");
        return sum;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am main thread");
        }
        ExecutorService service = Executors.newFixedThreadPool(5);
        CallableTest t1 = new CallableTest("t1");
        CallableTest t2 = new CallableTest("t2");
        CallableTest t3 = new CallableTest("t3");
        CallableTest t4 = new CallableTest("t4");
        CallableTest t5 = new CallableTest("t5");

        // check submit method
        Future<Integer> f = service.submit(t1);
        System.out.println("submit result" + f.get());

        List task = new ArrayList();
        task.addAll(Arrays.asList(t1, t2, t3, t4, t5));
        // check invokeAny
        Object res = service.invokeAny(task);
        System.out.println("invokeAny result" + res);
        // check invokeAll
        List<Future> result = service.invokeAll(task);
        if (!result.isEmpty()) {
            result.stream().forEach(future -> {
                try {
                    System.out.println(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
