package com.nikhil.collection;


@FunctionalInterface
interface Isquare
{
    int square(int n);
}
@FunctionalInterface
interface Iadd
{
    int add(int m, int n);
}

public class FunctionInterfaceDemo
{
    public static void main(String[] args) {
        Isquare obj = n -> n*n;
        System.out.println(obj.square(4));
        Iadd obj1 = ((m, n) -> n+m);
        System.out.println(obj1.add(3,6));


       new Thread(() -> {
           for (int i = 0; i < 10; i++) {
               System.out.println(i+" ");
           }
       }).start();
       new Thread(()->{
           for (int i = 11; i < 30; i++) {
               System.out.println(i+" ");
           }
       }).start();

    }
}
