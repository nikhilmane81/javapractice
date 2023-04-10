package com.nikhil.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args) {

        Consumer<Integer> consumer = System.out::println;

        consumer.accept(10);

        Consumer<List<Integer>> listConsumer = list-> list.replaceAll(Integer->2*Integer);

        Consumer<List<Integer>> listprinter = list -> list.stream().sorted().forEach(a-> System.out.print(a+" "));

        List<Integer> list = new ArrayList<>(Arrays.asList(34, 56, 67, 75));

        listConsumer.accept(list);
        listprinter.accept(list);
        System.out.println();
        System.out.println("====================");

        listConsumer.andThen(listprinter).accept(list);
    }
}
