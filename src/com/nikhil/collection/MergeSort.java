package com.nikhil.collection;

import java.util.Arrays;
import java.util.Random;

public class MergeSort
{
    public static void main(String[] args) {
            int size = 10;
        Random random = new Random();
           int[] arr = new int[size];
           for(int i =0; i< arr.length;i++)
           {
               arr[i] =random.nextInt();
           }
           long start = System.nanoTime();
            mergesort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println((System.nanoTime()-start)/1000000+"ms");
    }

    private static void bubblesort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    private static void mergesort(int[] arr) {

        int length = arr.length;
        if(length<=1) return;

        int middle = length/2;
        int[] leftarr = new int[middle];
        int[] rightarr = new int[length-middle];

        int i=0,j=0;
        for(;i<length;i++)
        {
            if(i<middle)
            {
                leftarr[i]=arr[i];
            }
            else
            {
                rightarr[j]=arr[i];
                j++;
            }
        }
        mergesort(leftarr);
        mergesort(rightarr);
        merge(leftarr, rightarr, arr);
    }

    private static void merge(int [] leftarr, int [] rightarr, int [] arr)
    {
        int leftsize = arr.length/2;
        int rigtsize = arr.length- leftsize;
        int i=0, l=0, r=0;
        while(l<leftsize && r<rigtsize)
        {
            if(leftarr[l]<rightarr[r])
            {
                arr[i] = leftarr[l];
                i++;
                l++;
            }
            else {
                arr[i] = rightarr[r];
                i++;
                r++;
            }
        }

        while(l<leftsize)
        {
            arr[i] = leftarr[l];
            i++;
            l++;
        }
        while(r<rigtsize)
        {
            arr[i] = rightarr[r];
            i++;
            r++;
        }
    }


}
