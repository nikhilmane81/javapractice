package com.nikhil.collection;



import java.util.*;


public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"First");
        map.put(4,"Second");
        map.put(3,"Third");
       // map.put(null,"Minti");

        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Four"));

        //How to  iterate through Hashmap
        System.out.println("Using forEach with entryset()");
       for (Map.Entry<Integer, String> e : map.entrySet())
       {
           System.out.println("Key "+ e.getKey() + " Value "+e.getValue());
       }

       //Using map.forEach()
       map.forEach((key,value)->
               System.out.println(key+" "+value));

        System.out.println("Using Iterator");
       Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
       while(itr.hasNext())
       {
           Map.Entry<Integer,String> entry = itr.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }


       //How to convert Hashmap to hashset
       HashMap<Integer, String> map1 = getmap();

        Set<Integer> keyset = new HashSet<>(map1.keySet());
        keyset.forEach(System.out::println);

        Set<String> valueset = new HashSet<>(map1.values());
        valueset.forEach(System.out::println);

        TreeMap<Integer,String> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

    }


    public static HashMap<Integer,String> getmap()
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"First");
        map.put(2,"Second");
        map.put(3,"Third");
        map.put(4,"Test");
        return map;
    }


}
