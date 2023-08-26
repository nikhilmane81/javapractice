package com.nikhil.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome
{

/*    static boolean isPalindrome(String s)
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
    }*/
    static boolean isPalindrome(String str)
    {
        char[] arr = str.toCharArray();
        char[] brr = str.toCharArray();
        int i=0;
        int j= brr.length-1;
        for(i=0;i< brr.length/2;i++)
        {
            char temp = brr[i];
            brr[i] = brr[j];
            brr[j] = temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        return Arrays.equals(arr, brr);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("baab"));
    }
}
