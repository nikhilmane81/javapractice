package com.nikhil.collection;

import java.util.function.Predicate;

public class PredicateDemo
{

    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> (i%2==0);

        Predicate<Integer> predicate1 = i->(i>10);

        Predicate<Integer> predicate2 = i->(i<20);

        System.out.println(predicate.test(21));

        //System.out.println(predicate1.and(predicate2).negate().test(19));
        System.out.println(predicate1.and(predicate2).test(19));
    }
}
