package com.nikhil.collection;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest
{

    public static void main(String[] args) {
        Integer [] arr = {1,8,7,6,4,3};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
}
