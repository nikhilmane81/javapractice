package com.nikhil.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);

        System.out.println(set);
        for(Integer ele : set)
        {
            System.out.println(ele);
        }
        System.out.println("Using iterator");
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        set.forEach(System.out::println);

        TreeSet<Integer> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);

        ArrayList<Integer> arr = arrayList();
        ArrayList<Integer> arr1 = arrayList1();

        HashSet<ArrayList<Integer>> set1 = new HashSet<>();
        set1.add(arr);
        set1.add(arr1);
        for (ArrayList<Integer> integers : set1) {
           // System.out.println(integers );
            integers.forEach(System.out::println);

        }
    }

    public static ArrayList<Integer> arrayList()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(35);
        arr.add(35);
        arr.add(35);
        return arr;
    }
    public static ArrayList<Integer> arrayList1()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(35);
        arr.add(35);
        arr.add(36);
        return arr;
    }



}
