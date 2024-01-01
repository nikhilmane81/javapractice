package com.nikhil.Test;

public class PowerOfTwo
{
    boolean isPowerOfTwo(int num)
    {

        for(int i=0;i<=num/2;i++)
        {
            if(Math.pow(2,i)==num)
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(67108863));
    }
}
