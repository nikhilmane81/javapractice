package com.nikhil.collection;


import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {

    private final String name;
    Task(String s)
    {
        this.name = s;
    }
    @Override
    public void run() {
        try {
            for(int i=0;i<=5;i++)
            {
                Date d = new Date();
                SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
                if(i==0)
                {
                    System.out.println("Initialisation time "+"task name: "+ name+ " "+sd.format(d));
                }
                else
                {
                    System.out.println("Execution time "+"task name: "+ name+ " "+sd.format(d));
                }
                Thread.sleep(500);
            }
            System.out.println(name+" Completed");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class ThreadPoolDemo {
        static final Integer MAX = 2;

    public static void main(String[] args) {

        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        ExecutorService pool = Executors.newFixedThreadPool(MAX);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();
    }

}
