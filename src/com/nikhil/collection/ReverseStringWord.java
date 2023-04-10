package com.nikhil.collection;

public class ReverseStringWord
{

    static void revStr(String str)
    {
        String[] arr = str.split(" ");
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i]+" ");

    }


    public static void main(String[] args) {
        revStr("Hello! this is Potato");
    }
}
