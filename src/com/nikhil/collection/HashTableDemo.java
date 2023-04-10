package com.nikhil.collection;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo
{
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1,"Nikhil");
        table.put(2,"Minti");
        table.put(3,"Pinti");
        table.put(4,"chinti");

        table.forEach((key,value)->
                System.out.println(key+" "+value));


      Iterator<Integer> itr = table.keySet().iterator();

      while(itr.hasNext())
      {
          Integer key = itr.next();
          System.out.println(key+" "+ table.get(key) );
      }
    }
}
