package com.hackerrank.controlflow;

class Parent {
    Parent() {
        System.out.println("constructor");
    }

    static {
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }

}

class Child extends Parent {
    Child() {
        System.out.println("child constructor");
    }

    static {
        System.out.println("child static block");
    }

    {
        System.out.println("child instance block");
    }
}

public class AmadeusInterview {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
