package com.nikhil.collection;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2
{

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(45);
        set.add(11);
        set.add(56);

        List<Integer> list = set.stream().map(n->n*n).filter(n->n%2==0).sorted().collect(Collectors.toList());

        System.out.println(list);
    }
}
