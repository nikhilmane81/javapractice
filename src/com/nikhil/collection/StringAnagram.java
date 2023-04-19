package com.nikhil.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringAnagram
{
   /* static  boolean isAnagram(String one, String two)
    {
        char [] first = one.toCharArray();
        char [] second = two.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(first);
        System.out.println(second);

        return Arrays.equals(first, second);
    }*/
    static boolean isAnagram(String one, String two)
    {
        List<Character> first = new ArrayList<>();
        List<Character> second = new ArrayList<>();
        for (int i = 0; i < one.length(); i++) {
            first.add(one.charAt(i));
        }
        for (int i = 0; i < two.length(); i++) {
            second.add(two.charAt(i));
        }
        Collections.sort(first);
        Collections.sort(second);
        System.out.println(first);
        System.out.println(second);
        return first.equals(second);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("heart", "earth"));
        System.out.println(isAnagram("oxone", "boxofgfgn"));
    }
}
