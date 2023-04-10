package com.nikhil.collection;

class Singleton
{

    private static Singleton obj = null;

    Integer num;

    private Singleton()
    {
        num = 10;
    }

    public static synchronized Singleton getInstance()
    {
        if(obj==null)
            obj = new Singleton();
        return obj;
    }
}

public class SingletonDemo
{


    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        System.out.println(obj.hashCode()+" "+obj.num);
        System.out.println(obj1.hashCode()+" "+obj1.num);
        System.out.println(obj2.hashCode()+" "+obj2.num);
        System.out.println(obj3.hashCode()+" "+obj3.num);
    }
}
