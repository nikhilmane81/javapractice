package com.nikhil.collection;

public class BinarySearchTree
{

    public BinarySearchTree() {
        root = null;
    }

    Node root;

    static class Node
    {
        Node left;
        int data;
        Node right;

        Node(int data)
        {
            this.data = data;
            left=right=null;
        }
    }

    void insert(int data)
    {
        root = inserthelper(root, data);
    }

    private Node inserthelper(Node root, int data) {
        if(root==null)
        {
            root = new Node(data);
            return root;
        } else if (data < root.data) {
            root.left = inserthelper(root.left, data);
        } else if (data > root.data) {
            root.right = inserthelper(root.right,data);
        }
        return root;
    }

    void printinorder()
    {
        printinorderhelper(root);
    }

    private void printinorderhelper(Node root) {
        if(root!=null)
        {
            printinorderhelper(root.left);
            System.out.print(root.data+" ");
            printinorderhelper(root.right);
        }
    }


    public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
            tree.insert(34);
        tree.insert(44);
        tree.insert(64);
        tree.insert(67);
        tree.insert(24);
        tree.insert(74);
        tree.insert(345);

        tree.printinorder();


    }
}
