package com.nikhil.collection;

public class ThreadDemo implements Runnable
{

    public static void main(String[] args) {

       Thread t1 = new Thread(new ThreadDemo());
       Thread t2 = new Thread(new ThreadDemo());
       t1.setName("First Thread");
       t2.setName("Second Thread");
       t1.start();
       t2.start();

    }

    @Override
    public void run() {
        try {
            for(int i=0; i<20; i++)
            {
                Thread.sleep(500);
                System.out.println("Running "+ Thread.currentThread().getName());
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
