package com.hackerrank.java.practice;

import java.util.Scanner;

public class HackerRankExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        

        try{
            int x = kb.nextInt();
            int y = kb.nextInt();
            System.out.println(x / y);
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception ex) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
