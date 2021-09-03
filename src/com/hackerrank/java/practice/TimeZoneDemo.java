package com.hackerrank.java.practice;

import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        String[] tzIds = TimeZone.getAvailableIDs();
        for (String tz : tzIds) {
            System.out.println(tz);
        }
    }
}
