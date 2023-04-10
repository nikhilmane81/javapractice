package com.nikhil.collection;

import java.util.HashSet;

public class LongestSubstring
{
    static int longsub(String str)
    {
        int ptr1 = 0;
        int ptr2 = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(ptr2<str.length())
        {
            if(!set.contains(str.charAt(ptr2)))
            {
                set.add(str.charAt(ptr2));
                ptr2++;
                max = Math.max(max,set.size());
            }
            else
            {
                set.remove(str.charAt(ptr1));
                ptr1++;
            }
        }
        return max;
    }



    public static void main(String[] args) {

        System.out.println(longsub("abcabcbb"));
        System.out.println(longsub("bbbbb"));
        System.out.println(longsub("pwwkew"));
    }

}
