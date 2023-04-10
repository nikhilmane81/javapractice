package com.nikhil.collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

class Person
{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


public class ComparableDemo
{

    public static int comparebyName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }

    public static int comparebyAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Nikhil", 27));
        list.add(new Person("vicky", 24));
        list.add(new Person("poonam", 25));
        list.add(new Person("sachin", 19));

        Collections.sort(list, ComparableDemo::comparebyName);
        System.out.println("Comparing by name");
        list.stream().map(Person::getName).forEach(System.out::println);

        list.sort(ComparableDemo::comparebyAge);
        System.out.println("Comparing by age");
        list.stream().map(Person::getName).forEach(System.out::println);



    }
}
