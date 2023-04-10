package com.nikhil.collection;



public class Palindrome
{

    static boolean isPalindrome(String s)
    {

        s= s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;




    }
    public static void main(String[] args) {

        System.out.println(isPalindrome("CooCCE"));
    }
}
