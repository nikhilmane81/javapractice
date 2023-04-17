package com.nikhil.collection;

import java.util.Scanner;

public class MyCircularQue
{
    final int SIZE = 5;
    int front, rear;

    int[] arr = new int[SIZE];

    public MyCircularQue() {
        front = rear = -1;
    }

    boolean isFull()
    {
        if(front==0 && rear==SIZE-1)
            return true;
        return front == rear + 1;
    }
    boolean isEmpty()
    {
        return front==-1;
    }
    //Adding element to Que
    void enQue(int data)
    {
        if(isFull())
        {
            throw new RuntimeException("Que is full");
        }
        else
        {
            if(front==-1)
            {
                front =0;
            }
            rear = (rear+1)%SIZE;
            arr[rear] = data;
        }
        System.out.println("Success");
    }

    //Removing element from Que
    int deQue()
    {
        int ele;
        if(isEmpty())
            throw new RuntimeException("Que is Empty");
        else
        {
            ele = arr[front];
            if(front==rear)
            {
                front = rear = -1;
            }
            else
            {
                front = (front+1)%SIZE;
            }
            return ele;
        }
    }

    void print()
    {
        if(isEmpty())
            throw new RuntimeException("Que is Empty");
        else if(rear>=front)
        {
            for (int i =front; i <= rear ; i++) {
                System.out.printf("%d ",arr[i]);
            }
        }
        else
        {
            for(int i=front; i<=SIZE;i++)
            {
                System.out.printf("%d ",arr[i]);
            }
            for(int j=0; j<=rear;j++)
            {
                System.out.printf("%d ",arr[j]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        MyCircularQue que = new MyCircularQue();
        Scanner sc = new Scanner(System.in);
        int choice=-1;
        while (choice!=0)
        {
            System.out.println("Select 1 for adding in Que");
            System.out.println("Select 2 for removing from Que");
            System.out.println("Select 3 from printing Que");
            System.out.println("Select 0 to Exit" );
            choice = sc.nextInt();
            switch (choice)
            {
                case 1 ->
                {
                    try {
                        System.out.println("Enter element");
                        int ele = sc.nextInt();
                        que.enQue(ele);
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

                }
                case 2 -> {
                    try {
                        System.out.println(que.deQue() + " was removed from Que");
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

                }
                case 3 ->
                {
                    try {
                        que.print();
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> System.out.println("Enter 1 or 2 only");
            }
        }
    }
}
