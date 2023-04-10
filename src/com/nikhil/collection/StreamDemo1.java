package com.nikhil.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1
{

    public static void main(String[] args) {


        Stream<String> stream = Stream.of("Physics", "Chemistry", "Maths", "History");


        stream.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(45,67,78,89,6));

        List<Integer> sortedlist = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedlist);
    }
}
