package com.nikhil.MindStix;


/*
Write an algorithm to find the minimum number of bits that must be
flipped to convert message P to message Q
(Representation of both P and Q are mentioned below.

 */
public class BitsToFlip
{
    static int countSetBits(int num)
    {
        int count = 0;
        while(num>0)
        {
            count += num & 1;
            num = num>>1;
        }
        return count;
    }
    static int minBitToShift(int p, int q)
    {
        int xor = p^q;
        return  countSetBits(xor);
    }
    public static void main(String[] args) {
        int p= 7;
        int q = 10;
        System.out.println(minBitToShift(p,q));
    }
}
