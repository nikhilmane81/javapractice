package com.nikhil.collection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuntionDemo
{
    public static void main(String[] args) {
    Function<Integer, Integer> square = (a)-> a*a;
    System.out.println(square.apply(23));

        BiFunction<Integer, Integer, Integer> add = (a,b)-> a+b;

        add =add.andThen((a)->a*a);
        add = add.andThen((a)->(int)Math.sqrt(a));
        System.out.println(add.apply(34,56));



    }
}
