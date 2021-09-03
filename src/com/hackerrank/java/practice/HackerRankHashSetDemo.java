package com.hackerrank.java.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HackerRankHashSetDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<String> set = new HashSet();
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        int count = 0;
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        for (int i = 0; i < t; i++) {
            if (set.add(pair_left[i] + " " + pair_right[i])) {
                count++;
            }
            System.out.println(count);
        }
    }
}
