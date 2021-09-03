package com.hackerrank.java.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InheritanceSerializeDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.i = 100;
        c.j = 200;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("abc.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            fis = new FileInputStream("abc.ser");
            ois = new ObjectInputStream(fis);
            Cat c1 = (Cat) ois.readObject();
            System.out.println(c1.i);
            System.out.println(c1.j);
        } catch (Exception e) {
            System.out.println("I am inside catch block");
            e.printStackTrace();
            try{
                if(oos!=null && ois!=null){
                    oos.close();
                    ois.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}
