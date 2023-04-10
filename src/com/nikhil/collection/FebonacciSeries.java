package com.nikhil.collection;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FebonacciSeries
{
    static int febo(int n)
    {
        if(n<=1)
            return n;
        return febo(n-1)+febo(n-2);
    }
    static void feboPrinter(int range)
    {
        for(int i=0;i<=range;i++)
        {
            System.out.println(febo(i));
        }
    }

    static String feboStream(int range)
    {
        return Stream.iterate(new int[]{0,1}, t->new int[]{t[1],t[0]+t[1]})
                .limit(range)
                .map(t->t[0])
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }
    public static void main(String[] args) {
     //feboPrinter(10);

        System.out.println(feboStream(10));;

    }
}
