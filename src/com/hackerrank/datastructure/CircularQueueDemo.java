package com.hackerrank.datastructure;

class circularQueue {
    int[] items;
    int front;
    int rear;
    int size;

    circularQueue(int size) {
        this.size = size;
        items = new int[size];
        front = -1;
        rear = -1;
    }

    private boolean isFulll() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int item) {
        if (isFulll()) {
            System.out.println("queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            items[rear] = item;
            System.out.println("element inserted");
        }
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
        return element;
    }

    public void display() {
        int i;
        for (i = front; i != rear; i = (i + 1) % size) {
            System.out.println(items[i]);
        }
        System.out.println(items[i]);
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        circularQueue c = new circularQueue(5);
        c.enQueue(10);
        c.enQueue(20);
        c.enQueue(30);
        c.enQueue(40);
        c.enQueue(50);
        System.out.println("first time print");
        c.display();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        System.out.println("second time print");
        c.display();
        c.enQueue(60);
        c.enQueue(70);
        System.out.println("third time print");
        c.display();
    }
}
