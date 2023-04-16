package com.nikhil.collection;

import java.util.Arrays;

//Array implementation of Que
public class MyQue {
    int front,rear, size;
    final int CAPACITY;
    int[] arr;

    public MyQue(int capacity) {
        front = this.size = 0;
        this.CAPACITY = capacity;
        rear = CAPACITY-1;
        arr = new int[this.CAPACITY];
    }

    boolean isFull(MyQue que)
    {
        return que.size == que.CAPACITY;
    }
    boolean isEmpty(MyQue que)
    {
        return que.size == 0;
    }
    void enque(int data)
    {
        if(isFull(this))
            throw new RuntimeException("Que is full");
        this.rear = (this.rear+1) % this.CAPACITY;
        this.arr[this.rear] = data;
        this.size += 1;
    }
    int deque()
    {
        if(isEmpty(this))
            throw  new RuntimeException("Que is Empty");
        int ele = this.arr[this.front];
        this.front = (this.front+1)% this.CAPACITY;
        this.size-=1;
        return ele;

    }
    void print()
    {
        if(size==0)
            System.out.println("Empty");
        for(int i=this.front; i<=this.rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        try {
            MyQue myQue = new MyQue(5);
            myQue.enque(10);
            myQue.enque(30);
            myQue.enque(56);
            myQue.enque(76);
            myQue.enque(96);

        myQue.print();
        System.out.println("Deque "+ myQue.deque());
       myQue.print();
        System.out.println("Deque "+ myQue.deque());
        myQue.print();


        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }

}
