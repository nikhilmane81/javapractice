package com.nikhil.collection;

import java.util.HashSet;
import java.util.Set;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */
public class HappyNumber
{

    static boolean isHappy(int num)
    {
      Set<Integer> set = new HashSet<>();
      while(true)
      {
          num = sumOfSquareOfDigit(num);
          if(num==1)
              return true;
          if(set.contains(num))
              return false;
          set.add(num);
      }

    }
    static int sumOfSquareOfDigit(int num)
    {
        int sum = 0;
        int rem;
        while(num>0)
        {
            rem = num%10;
            sum = sum+(rem*rem);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
