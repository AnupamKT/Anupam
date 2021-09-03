package com.hackerrank.java.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("abc.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(d1);
            fis = new FileInputStream("abc.ser");
            ois = new ObjectInputStream(fis);
            Dog d2 = (Dog) ois.readObject();
            System.out.println(d2.i);
            System.out.println(d2.j);
        } catch (Exception e) {
            System.out.println("i am inside catch block");
            e.printStackTrace();
            try {
                if (oos != null && ois != null) {
                    oos.close();
                    ois.close();
                }
            } catch (IOException e1) {
                System.out.println("I am inside second catch block");
            }
        }
    }
}
