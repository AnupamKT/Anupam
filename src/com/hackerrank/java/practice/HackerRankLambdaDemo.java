package com.hackerrank.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int n);
}

class OddCheck implements PerformOperation {

    @Override
    public boolean check(int n) {
        return n % 2 != 0;
    }

}

class verifyPrime implements PerformOperation {

    @Override
    public boolean check(int n) {
        switch (n) {
        case 0:
        case 1:
            return false;
        case 2:
            return true;
        default:
            if (checkPrime(n)) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean checkPrime(int num) {
        boolean res = true;
        if (num % 2 == 0) {
            res = false;
        } else {
            for (int i = 3; i < num; i = i + 2) {
                if (num % i == 0) {
                    res = false;
                }
            }
        }
        return res;
    }
}

class checkPalindrome implements PerformOperation {

    @Override
    public boolean check(int n) {
        return reverse(n) == n;
    }

    private int reverse(int n) {
        int num = 0;
        while (n > 0) {
            num = num * 10 + (n % 10);
            n = n / 10;
        }
        return num;
    }
}

class MyMath {
    PerformOperation isOdd() {
        return new OddCheck();
    }

    PerformOperation isPrime() {
        return new verifyPrime();
    }

    PerformOperation isPalindrome() {
        return new checkPalindrome();
    }

    boolean checker(PerformOperation p, int n) {
        return p.check(n);
    }
}

public class HackerRankLambdaDemo {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
