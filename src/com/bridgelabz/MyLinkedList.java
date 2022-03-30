package com.bridgelabz;

public class MyLinkedList {
    Node head;
    Node tail;
    INode front, rear;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void peek() {
        if (head == null) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Topmost value is: " + head.data);
        }
    }

    public void pop() {
        Node preNode = null;
        while (head != null) {
            head = head.next;
            if (head != null) {
                System.out.print(head.data);
                preNode = head;
            } else {
                System.out.println(preNode.data);
                break;
            }
        }
    }
    void enqueue(int key)
    {
        INode temp = new INode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    void display() {
        Node temp = head;     //pointing to first node
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
