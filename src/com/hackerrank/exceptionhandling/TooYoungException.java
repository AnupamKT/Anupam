package com.hackerrank.exceptionhandling;

public class TooYoungException extends RuntimeException {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    TooYoungException(String s) {
        super(s);
    }
}
