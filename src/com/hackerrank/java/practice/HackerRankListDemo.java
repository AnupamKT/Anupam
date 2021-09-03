package com.hackerrank.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HackerRankListDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int l = kb.nextInt();
        List list = new ArrayList(l);
        String input = "";
        while(kb.hasNextInt()){
            input = kb.next();
        }
        list.addAll(Arrays.asList(input.split(" ")));
        String action;
        int index;
        int num;
        int q = kb.nextInt();
        for (int i = 0; i < q; i++) {
            action = kb.next();
            if ("Insert".equals(action)) {
                index = kb.nextInt();
                num = kb.nextInt();
                list.add(index, num);
            } else if ("Delete".equals(action)) {
                index = kb.nextInt();
                list.remove(index);
            }
        }
        System.out.println(list);
    }
}
