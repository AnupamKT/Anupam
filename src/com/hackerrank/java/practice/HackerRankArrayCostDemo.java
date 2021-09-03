package com.hackerrank.java.practice;

public class HackerRankArrayCostDemo {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 2, 1, 6, 5, 7 };
        System.out.println(getCost(arr));
    }

    private static int getCost(int[] arr) {
        int cost = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + "," + arr[i + 1]);
            if (arr[i + 1] < arr[i]) {
                // System.out.println("inside if condition" + arr[i] + "," + arr[i + 1]);
                while (arr[i + 1] < arr[i]) {
                   arr[i+1]=arr[i+1]+1;
                    // System.out.println("inside while loop" + arr[i + 1]);
                    cost++;
               }
            }
        }
        return cost;
    }
}


