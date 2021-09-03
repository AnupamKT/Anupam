package com.hackerrank.controlflow;

public class StaticAndInstanceControlFlow {
    {
        System.out.println("first instance block");
    }
    static {
        System.out.println("first static block");
    }

    StaticAndInstanceControlFlow() {
        System.out.println("constructor getting called");
    }

    public static void main(String[] args) {
        StaticAndInstanceControlFlow a = new StaticAndInstanceControlFlow();
        System.out.println("main method");
        StaticAndInstanceControlFlow b = new StaticAndInstanceControlFlow();
    }

    static {
        System.out.println("second static block");
    }
    {
        System.out.println("second instance block");
    }
}
