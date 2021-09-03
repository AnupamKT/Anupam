package com.hackerrank.java.practice;

public class HackerRankSingletonDemo {
    private static HackerRankSingletonDemo instance;
    public String str;

    private HackerRankSingletonDemo() {

    }

    public static HackerRankSingletonDemo getSingleInstance() {
        if (instance == null) {
            return new HackerRankSingletonDemo();
        } else {
            return instance;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }

}
