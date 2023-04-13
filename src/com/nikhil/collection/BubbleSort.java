package com.nikhil.collection;

import java.util.Arrays;

public class BubbleSort
{
    public static void bubblesort(int [] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
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
    public static void selectionsort(int [] arr)
    {

        for(int i =0;i<arr.length-1;i++)
        {
           int  minindex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex]= arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int [] arr = {23,56,34,33,67,58,8,9,45};
        //bubblesort(arr);
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
