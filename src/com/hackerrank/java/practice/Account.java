package com.hackerrank.java.practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    String name = "anupam";
    transient String password = "Hungry";

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        String epwd = password + "123";
        oos.writeObject(epwd);
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        String epwd = (String) ois.readObject();
        password = epwd.substring(0, 6);
    }
}
