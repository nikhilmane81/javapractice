package com.nikhil.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3
{
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(4,"D");
        map.put(3,"C");

        List<String> list = map.values().stream().sorted().toList();

        List<Map.Entry<Integer,String>> result = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList();

        System.out.println(result);

        System.out.println(list);

        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
