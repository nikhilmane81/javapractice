package com.nikhil.collection;
//Stack implementation using Circular LinkedList
public class MyLinkedStack {

    Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data= data;
            this.next = null;
        }
    }
    boolean isEmpty()
    {
        return head==null;
    }
    void push(int data)
    {
        Node newnode = new Node(data);
        if(isEmpty())
            head = newnode;
        else
        {
            Node temp = head;
            head = newnode;
            newnode.next = temp;
        }
    }
    void print()
    {
        Node ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    int pop()
    {
        int popped = Integer.MIN_VALUE;
        if(isEmpty())
            System.out.println("Stack is empty");
        else
        {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }

    public static void main(String[] args) {
        MyLinkedStack linkedStack = new MyLinkedStack();
        linkedStack.push(12);
        linkedStack.push(45);
        linkedStack.push(67);
        linkedStack.print();
        System.out.println(linkedStack.pop()+" is popped");
        linkedStack.print();
    }
}
