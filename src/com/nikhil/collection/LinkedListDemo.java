package com.nikhil.collection;

public class LinkedListDemo
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    void addatbeg(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
    }

    void addatEnd(int data)
    {
        Node temp = new Node(data);
        Node ptr = head;
        if(head == null)
        {
            head = temp;
        }
        else {
            while(ptr.next!=null)
            {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
    }

    void print()
    {
        Node ptr  = head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(ptr!=null)
            {
                System.out.print(ptr.data+" ");
                ptr = ptr.next;
            }
            System.out.println();
        }
    }

    int length()
    {
        int size =0;
        Node ptr = head;
        if(head ==null)
        {
            return 0;
        }
        else {
            while(ptr!=null)
            {
                size++;
                ptr = ptr.next;
            }
        }
        return size;
    }

    void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next;

        if(head ==null)
            System.out.println("Empty list");
        else
        {
            while(curr!=null)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            head = prev;
        }
    }

    public static void main(String[] args) {

        LinkedListDemo list = new LinkedListDemo();
        list.print();
        System.out.println(list.length());
        list.addatbeg(23);
        list.addatbeg(34);
        list.print();
        System.out.println(list.length());
        list.addatEnd(45);
        list.addatEnd(56);
        list.print();
        System.out.println(list.length());
        list.reverse();
        list.print();




    }

}
