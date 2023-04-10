package com.nikhil.collection;

public class ElectronicStore
{
    static int getMoneySpent(int [] keyboards, int [] drives, int b)
    {
        int max = -1;
        int sum = 0;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                sum = keyboard + drive;
                if (max < sum && sum <= b) {
                    max = sum;
                }
            }
        }
        if(max<=b)
            return max;
        else
            return -1;
    }

    public static void main(String[] args) {

        int[] keyboads = {3,1};
        int[] drives = {5,2,8};
        int b = 10;
        System.out.println(getMoneySpent(keyboads,drives,b));
    }
}
