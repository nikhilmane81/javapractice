package com.nikhil.collection;

import java.util.Arrays;

public class BinarySearch
{
    public static int linersearch(int [] arr , int ele)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
                return i;
        }
        return -1;
    }
    public static int  binarysearch(int start, int end,int [] arr, int ele) {
       if(end>=start)
       {
           int mid = start+(end-start)/2;

           if(arr[mid]==ele)
               return mid;

           if(ele<arr[mid])
               return binarysearch(start,mid-1,arr,ele);
           return binarysearch(mid+1,end, arr,ele);
       }
       return -1;
    }


    public static void main(String[] args) {
    int[] arr = {3,5,6,7,8,45,23,54,76,98,12,42,37,4,48};
        System.out.println(linersearch(arr, 45));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(binarysearch(0,arr.length-1,arr,45));
    }
}
