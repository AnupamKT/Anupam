package com.hackerrank.java.practice;

import java.util.Scanner;

public class Java2DArrayHourGlass {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            System.out.println("taking input");
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(arr);
    }
}
