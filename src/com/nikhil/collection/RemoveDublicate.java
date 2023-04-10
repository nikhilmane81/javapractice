package com.nikhil.collection;

import java.util.Arrays;

public class RemoveDublicate
{

    public static int removeDublicates(int [] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j< nums.length;j++)
            {
                if(nums[i]==nums[j])
                    nums[j] = 1000;
            }

        }
        int count = 0;
        Arrays.sort(nums);
        for(int ele:nums)
        {
            if(ele==1000)
                break;
            else
                count++;
        }
        return count;
    }


    public static void main(String[] args) {

    }
}
