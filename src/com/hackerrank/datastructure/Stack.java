package com.hackerrank.datastructure;

public class Stack {
    int[] arr;
    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("stack over flow");
        } else {
            arr[++top] = element;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("there is no element ");
            System.exit(1);
        }
        return arr[top--];
    }

    private boolean isEmpty() {
        return arr.length == 0;
    }

    private boolean isFull() {
        return top == size - 1;
    }

    public void printStack() {
        for (int x : arr) {
            System.out.println(x);
        }
    }

}

