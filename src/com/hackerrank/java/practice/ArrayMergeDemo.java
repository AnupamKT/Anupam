package com.hackerrank.java.practice;

import java.util.Arrays;

public class ArrayMergeDemo {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 20, 30, 40, 50 };
        int[] b = new int[] { 7, 8, 13, 14, 25 };
        mergeAndSortTwoArray(a, b);
    }

    private static void mergeAndSortTwoArray(int[] a, int[] b) {
        int lena = a.length;
        int lenb = b.length;
        int[] c = new int[lena + lenb];
        for (int i = 0; i < lena; i++) {
            c[i] = a[i];
        }
        int j = lena;
        for (int i = 0; i < lenb; i++) {
            c[j] = b[i];
            j++;
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
