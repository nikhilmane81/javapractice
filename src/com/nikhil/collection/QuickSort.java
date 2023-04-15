package com.nikhil.collection;

import java.util.Arrays;

public class QuickSort
{
    static void swap(int [] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high]; //assuming last element as pivot
        int i = (low-1);
        for (int j = low; j <= high - 1; j++) {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    static void quicksort(int [] arr, int low, int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,854,86,4,23,56,24,56,78,45,678};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
