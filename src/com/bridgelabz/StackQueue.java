package com.bridgelabz;

import java.util.LinkedList;

public class StackQueue {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.push(70);
        list.push(30);
        list.push(56);;
        list.peek();
        list.display();
        list.pop();
        System.out.println("Queue elements are:");
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        list.display();
        list.dequeue();
    }
}
