package com.nikhil.collection;

import java.util.Arrays;

public class AnagramString
{

    static boolean isAnagram(String one, String two)
    {
        char[] arr = one.toCharArray();
        char[] brr = two.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        System.out.println(arr);
        System.out.println(brr);
        return Arrays.equals(arr, brr);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
