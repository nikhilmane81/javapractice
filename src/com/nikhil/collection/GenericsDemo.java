package com.nikhil.collection;

public class GenericsDemo
{
    public static <T> void printer (T[] arr)
    {
        for(T ele: arr )
        {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        String[] str = {"Hello", "World"};
        printer(arr);
        printer(str);
    }
}
