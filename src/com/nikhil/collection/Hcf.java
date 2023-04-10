package com.nikhil.collection;

public class Hcf
{
    public static int hcfcalc(int m, int n)
    {
        int ans =0;
        if(m>n)
        {
            for(int i=1;i<n;i++)
            {
                if(m%i==0 && n%i==0)
                {
                    ans = i;
                }
            }
        }
        else
        {
            for(int i=1;i<m;i++)
            {
                if(m%i==0 && n%i==0)
                {
                    ans = i;
                }
            }
        }
        return ans;
    }

    public static int lcmcalc(int m, int n)
    {
            //return (m*n)/(hcfcalc(m,n));

        for(int i=1;;i++)
        {
            if(i%m==0 && i%n==0)
            {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(hcfcalc(10,15));
        System.out.println(lcmcalc(12,63));
    }

}
