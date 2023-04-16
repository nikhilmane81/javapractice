package com.nikhil.collection;

import java.util.EmptyStackException;

public class MyStack {
    static final int MAX = 10;
    int[] arr = new int[MAX];
    int top;
    MyStack()
    {
        top = -1;
    }
    boolean isEmpty()
    {
        return top < 0;
    }
    boolean isFull()
    {
        return top>=MAX-1;
    }
    void push(int data)
    {
        if(isFull())
            throw new StackOverflowError("Stack full");
        else
            arr[++top] = data;
    }
    int pop()
    {
        if(isEmpty())
            throw new EmptyStackException();
        return arr[top--];
    }
    int peek()
    {
        if(isEmpty())
            throw new EmptyStackException();
        return arr[top];
    }
    void print()
    {
        for(int i=top; i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(34);
        stack.push(45);
        stack.push(95);
        stack.push(65);
        stack.push(42);
        stack.push(457);
        stack.push(423);
        stack.push(489);
        stack.push(423);
        stack.pop();
        stack.push(56);
        stack.print();


    }
}
