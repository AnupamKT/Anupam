package com.hackerrank.lambdas;

import java.util.Arrays;
import java.util.List;

class Test {
    public int operation(int a, int b, FunctionInterfaceDemo demo) {
        return demo.calc(a, b);
    }

    public int getSquare(Object num) {
        return (Integer) num * (Integer) num;
    }
}

public class FunctionalInterfaceImplDemo {
    public static void main(String[] args) {
        Test t = new Test();
        List num = Arrays.asList(1, 2, 3, 4, 5);

        num.stream().forEach(t::getSquare);

        System.out.println(t.operation(10, 20, (a, b) -> a + b));
        // System.out.println(t.operation(10, 20, (a, b) -> a * b));
    }
}
