package com.nikhil.collection;


import java.util.*;

public class StringToken {


    public static void main(String[] args) {


        StringTokenizer str = new StringTokenizer("Hello      this is string token test", " ");

        int size = str.countTokens();

        String [] arr = new String[size];

        int i=0;
        while(str.hasMoreTokens())
        {
            arr[i] = str.nextToken();
            i++;
        }

        for(int j= arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }


}
