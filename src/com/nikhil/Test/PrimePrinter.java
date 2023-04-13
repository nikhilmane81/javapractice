package com.nikhil.Test;

import java.util.ArrayList;
import java.util.List;

//Print the set of prime numbers in any given range by the user.
public class PrimePrinter {

    public static boolean primeChecker(int num)
    {
        for(int i=2;i<=Math.sqrt(num);++i)
        {
            if(num%i==0)
                return false;

        }
        return true;
    }

    public static void primePrinter(int start, int end)
    {
        for(int i=start; i<=end;++i)
        {
            if(primeChecker(i))

                    System.out.print(i + " ");

        }
    }
    public  static void primePrinter1(int start, int end)
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            if(primeChecker(i))
                list.add(i);
        }
        for(int i=1;i<list.size();i++)
        {
           /* if(primeChecker(list.indexOf(list.get(i)))) {
                list1.add(list.get(i));
            } */
            if(primeChecker(i))
                list1.add(list.get(i));

        }
        System.out.println(list1);
    }

    public static void main(String[] args) {
        primePrinter(1,77);
        System.out.println();
        primePrinter1(1,77);
    }
}
