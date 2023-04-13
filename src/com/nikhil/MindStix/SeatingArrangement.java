package com.nikhil.MindStix;

/*
There are N boys which are to be seated around a round table.
The task is to find the number of ways in which N boys can sit
 around a round table such that two particular boys sit together.

 */
public class SeatingArrangement
{
    static int factorial(int num)
    {
        if(num<=1)
            return 1;
        return num*factorial(num-1);
    }
    static int total_ways(int n)
    {
        return  2* factorial(n-2);
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(total_ways(n));
    }
}
