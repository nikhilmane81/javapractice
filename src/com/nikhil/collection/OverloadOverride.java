package com.nikhil.collection;


class Parent
{
    void fun(int a)
    {
        System.out.println(a);
    }
    void fun(int a, int b)
    {
        System.out.println(a+b);
    }
}
class Child extends Parent
{
    void fun(int a, int b)
    {
        System.out.println(a+b+10);
    }
}


public class OverloadOverride
{

    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.fun(34);
        obj.fun(45,56);
        Parent obj1 = new Child();
        obj1.fun(45,56);
    }


}
