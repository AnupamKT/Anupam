package com.hackerrank.exceptionhandling;

import java.util.Scanner;

public class CustomisedException {
    public static void main(String[] args) {
     Scanner kb = new Scanner(System.in);
     System.out.println("enter your age");
     int age=kb.nextInt();
     if(age<14){
            throw new TooYoungException("hey boy you are too young");
        } else if (age > 60) {
            throw new TooOldException("you are too old");
        } else {
            System.out.println("you are right person to get married");
     }
    }
}
