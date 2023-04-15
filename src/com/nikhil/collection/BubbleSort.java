package com.nikhil.collection;

import java.util.Arrays;

public class BubbleSort
{
    public static void bubblesort(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j< arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void insersionSort(int [] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
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
        int [] arr = {23,2,34,1,67,58,8,9,45};
        //bubblesort(arr);
        //selectionsort(arr);
        insersionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
