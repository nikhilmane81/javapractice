package com.nikhil.collection;

public class DoublyLinkedListDemo
{
    static Node head;

    static class Node
    {
        Node prev;
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    void addatBeg(int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            head = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
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
            temp.prev = ptr;
        }
    }

    void print()
    {
        Node ptr = head;
        if(head == null)
        {
            System.out.println("List is Empty");
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

   /* void reverse()
    {
        Node temp = null;
        Node curr = head;
        if(head ==null)
        {
            System.out.println("Empty List");
        }
        else
        {
            while (curr!=null)
            {
               temp = curr.prev;
               curr.prev = curr.next;
               curr.next = temp;
               curr = curr.prev;
            }
            head = temp.prev;
        }

    }*/

    void reverse()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node ptr1=null,ptr2=null;

            ptr1 = head;
            ptr2 = head.next;

            ptr1.next = null;
            ptr1.prev = ptr2;

            while (ptr2!=null)
            {
                ptr2.prev = ptr2.next;
                ptr2.next = ptr1;
                ptr1 = ptr2;
                ptr2 = ptr2.prev;
            }

            head = ptr1;
        }
    }
    public static void main(String[] args) {

        DoublyLinkedListDemo list = new DoublyLinkedListDemo();
        list.addatBeg(34);
        list.addatBeg(45);
        list.print();
        list.addatEnd(46);
        list.addatEnd(67);
        list.print();
        list.reverse();
        list.print();


    }
}
