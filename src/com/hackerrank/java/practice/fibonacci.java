package com.hackerrank.java.practice;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter number");
        int num = kb.nextInt();
        for (int i = 1; i <= num; i++)
            System.out.println(fibonnaci(i));

    }

    private static int fibonnaci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonnaci(num - 1) + fibonnaci(num - 2);
    }
}
