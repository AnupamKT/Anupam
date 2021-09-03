package com.hackerrank.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerRankPhoneBookDemo {
    public static void main(String[] args) {
        Map<String, Integer> phonebook = new HashMap();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            Integer number = phonebook.get(s);
            if (number != null) {
                System.out.println(s + " = " + number);
            } else {
                System.out.println("Not found");
            }

        }
    }
}
