package com.hackerrank.java.practice;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(new StringBuffer("x"));
        s.add(new StringBuffer("y"));

        System.out.println(s);
    }
}
