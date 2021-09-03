package com.hackerrank.java.practice;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[] { 30, 20, 30, 40, 40 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
