package com.nikhil.collection;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,6,8,9,7);
        List<Integer> square = list.stream().map(x->x*x).toList();
        List<Integer> sortedlist = list.stream().sorted().collect(Collectors.toList());
        System.out.println(square);
        List<String> names = Arrays.asList("Nikhil", "Mane", "Nihal", "Mayur", "Manish");
        List<String> fname = names.stream().filter(s->s.startsWith("M")).filter(s->s.endsWith("r")).toList();
        System.out.println(fname);

        int even = list.stream().filter(x->x%2==0).reduce(0, Integer::sum);
        int sum = list.stream().reduce(0,Integer::max);
        System.out.println(even);
        System.out.println(sum);
        System.out.println(sortedlist);

        int [] arr = {23,4,5,8,6,7};
        int [] sortedarr = Arrays.stream(arr).sorted().toArray();
        System.out.println(sortedarr[sortedarr.length-2]);
    }

}
