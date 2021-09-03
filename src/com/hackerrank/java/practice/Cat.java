package com.hackerrank.java.practice;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    int j = 20;

    Cat() {
        System.out.println("cat constructor called");
    }
}
