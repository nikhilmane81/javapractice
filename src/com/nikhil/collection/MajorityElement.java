package com.nikhil.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement
{
    static int majorele(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        int count=0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > count) {
                count = e.getValue();
            }
        }
        //map.forEach((k,v)-> System.out.println(k+" "+v));

        int key  =0;
        for(Map.Entry<Integer, Integer> e:map.entrySet())
        {
            if(e.getValue()==count)
                key =  e.getKey();
        }
        return  key;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,1,2,2};
        System.out.println( majorele(arr));

    }
}
