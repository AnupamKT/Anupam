package com.hackerrank.datastructure;

class Queue {
    int size;
    int front = -1;
    int rear = -1;
    int[] items;

    Queue(int size) {
        this.size = size;
        items = new int[size];
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("element inserted");

        }
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
        return element;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(items[i]);
            }
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.dequeue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("#######");
        q.display();
    }
}
