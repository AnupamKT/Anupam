package com.hackerrank.java.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustSerializeDemo {
    public static void main(String[] args) {
        Account a = new Account();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("abc.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            fis = new FileInputStream("abc.ser");
            ois = new ObjectInputStream(fis);
            Account a1 = (Account) ois.readObject();
            System.out.println(a1.name);
            System.out.println(a1.password);
        } catch (Exception e) {
            System.out.println("I am inside catch block");
            e.printStackTrace();
            try {
                if (oos != null && ois != null) {
                    oos.close();
                    ois.close();
                }
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}
