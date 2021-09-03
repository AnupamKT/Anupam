package com.hackerrank.datastructure;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class LinkedList {
    Node head;

    public void insertAtBegining(int value) {
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfterNode(int value, Node node) {
        Node new_node = new Node(value);
        new_node.next = node.next;
        node.next = new_node;
    }

    public void insertAtEnd(int value) {
        Node new_node = new Node(value);
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    public void deleteNode(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    public boolean searchNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.value == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second=new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;
        third.next = null;

        list.insertAtBegining(0);
        list.insertAfterNode(4, second);
        list.insertAtEnd(5);
        list.deleteNode(3);
        list.insertAfterNode(4, third);
        System.out.println(list.searchNode(7));

        while (list.head != null) {
            System.out.println(list.head.value);
            list.head = list.head.next;
        }
    }
}
