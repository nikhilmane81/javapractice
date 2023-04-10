package com.nikhil.collection;

import java.util.HashMap;
import java.util.Map;

public class FreqOfElement
{
    static void freqofele(int [] arr )
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j))
                map.put(j, 1);
            else {
                map.put(j, map.get(j) + 1);
            }
        }

        map.forEach((key,value)-> System.out.println(key+" "+value));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,3,2,2,2,5,1};
        freqofele(arr);
    }
}
