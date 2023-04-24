package com.nikhil.collection;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest
{


    public static int secondlargest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
            if(secondlargest==Integer.MIN_VALUE)
                System.out.println("No second largest");
        return  secondlargest;
    }
    public static void main(String[] args) {
        Integer [] arr = {1,8,7,6,4,3};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        int[] arr1 = {1,8,7,6,4,3};
        System.out.println(secondlargest(arr1));
    }
}
