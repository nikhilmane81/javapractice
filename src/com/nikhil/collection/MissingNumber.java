package com.nikhil.collection;

import java.util.*;

public class MissingNumber
{

    public static List<Integer> missingNum(List<Integer> arr, List<Integer>brr)
    {
        for (Integer integer : arr) {

            brr.remove(integer);
        }
        HashSet<Integer> set = new HashSet<>(brr);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;


    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(203,204,205,206,207,208,203,204,205,206));

        List<Integer> brr = new ArrayList<>(Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204));

        List<Integer> list = missingNum(arr, brr);

        System.out.println(list);


    }
}
