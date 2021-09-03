package com.hackerrank.java.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter String");
        String str = kb.next();
        if ((str.length()) % 2 != 0 && reverse(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    private static boolean reverse(String str) {
        String start = str.substring(0, (str.length() - 1) / 2);
        String end = str.substring((str.length() - 1) / 2 + 1);
        System.out.println(start + "  " + end);
        return start.equals(end);
    }
}

