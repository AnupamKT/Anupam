package com.hackerrank.exceptionhandling;

public class TooOldException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    TooOldException(String s) {
        super(s);
    }

}
