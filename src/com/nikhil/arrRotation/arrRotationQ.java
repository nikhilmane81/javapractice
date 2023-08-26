package com.nikhil.arrRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
John Watson knows of an operation called a right circular rotation on an array of integers.
One rotation operation moves the last array element to the first position and shifts all remaining elements
right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers.
Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.
 */
public class arrRotationQ
{
  /*  static List<Integer> arrRotation(List<Integer>arr, int k, List<Integer>queries)
    {
        int n = arr.size()-1;
        int last_index = arr.size()-1;
        int first_index = 0;
        for(int i=0;i<k;i++)
        {
            int temp = arr.get(last_index);
            arr.remove(last_index);
            for(int j=n;j>0;j--)
            {
                arr.add(j,arr.get(j-1));
                arr.remove(j);
            }
            arr.add(first_index, temp);
        }
        int len = queries.size();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            result.add(arr.get(queries.get(i)));
        }
        return result;
    }*/
    static List<Integer> arrRotation(List<Integer> a, int k, List<Integer>queries)
    {
        for(int i = 0; i < k; i++) {
            int temp = a.remove(a.size()-1);
            a.add(0, temp);
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < queries.size(); i++) {
            result.add(a.get(queries.get(i)));
        }

        return result;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
    List<Integer> queries = new ArrayList<>(Arrays.asList(0,1,2));
    List<Integer> result = arrRotation(arr,2,queries);
        System.out.println(result);
    }
}
