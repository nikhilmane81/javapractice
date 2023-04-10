package com.nikhil.collection;

public class ReverseString
{

    static void reverse(String s)
    {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        System.out.println(str);
        if(str.toString().equals(s))
        {
            System.out.println("Palindrome");

        }
        else
        {
            System.out.println("no Palindrome");
        }
    }

    static void reverse1(String s)
    {
        String str = "";
        int n = s.length();
        for(int i=n-1;i>=0;i--)
            str += s.charAt(i);
        System.out.println(str);
        if(str.equals(s))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("no palindrome");
        }
    }
    public static void main(String[] args) {
        reverse("madamaa");
        reverse1("madam");
    }
}
