package com.hackerrank.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankArrayList {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the number of lines");
        int lineNumber = kb.nextInt();
        List<List<Integer>> allList = new ArrayList(lineNumber);
        for (int i = 0; i < lineNumber; i++) {
            System.out.println("enter the number of elements in this line");
            int numberOfElements = kb.nextInt();
            List<Integer> line = new ArrayList(numberOfElements);
            for (int j = 0; j < numberOfElements; j++) {
                System.out.println("enter line elemets");
                int element = kb.nextInt();
                line.add(element);
            }
            allList.add(line);
        }
        System.out.println("enter the number of queries");
        int queryNumber = kb.nextInt();
        for (int k = 0; k < queryNumber; k++) {
            System.out.println("enter the x value");
            int x = kb.nextInt();
            System.out.println("enter y value");
            int y = kb.nextInt();
            if (allList.get(x - 1) != null) {
                try {
                    System.out.println(allList.get(x - 1).get(y - 1));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Errror");
                }

            }
        }
    }
}
