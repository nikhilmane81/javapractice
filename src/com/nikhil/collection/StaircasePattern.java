package com.nikhil.collection;

public class StaircasePattern
{

    static void stair(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("#");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("E");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
            stair(6);
    }
}
