package com.nikhil.collection;

import java.util.ArrayList;
import java.util.List;
//Wrong answer
public class LetterPattern
{

    //str = abcef   str1 = efgab
    public static boolean letterpattern(String str1, String str2)
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        if (str1.length() != str2.length()) {
           return false; // Return false if the strings have different lengths
        }

       else
        {

            int j=1;
            for(int i=0;i<str1.length()-1;i++)
            {
                list.add(((int)str1.charAt(j))-(int)str1.charAt(i));
                j++;
            }
            int n=1;
            for(int m=0;m<str2.length()-1;m++)
            {
                list1.add(((int)str2.charAt(n))-(int)str2.charAt(m));
                n++;
            }

        }
        System.out.println(list);
        System.out.println(list1);
        return list.equals(list1);
    }




    public static void main(String[] args) {

        System.out.println(letterpattern("ABAB", "XYXY"));
    }
}
