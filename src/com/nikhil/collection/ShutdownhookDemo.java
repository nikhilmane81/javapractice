package com.nikhil.collection;

public class ShutdownhookDemo
{
    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Shutdown Hook running....")));
        System.out.println("Main over");
    }
}
