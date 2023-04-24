package com.nikhil.collection;

public class ThreadDemo
{

    public static void main(String[] args) {


        Runnable mythread = ()->{
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
        };
       Thread t1 = new Thread(mythread);
       Thread t2 = new Thread(mythread);
       t1.setName("First Thread");
       t2.setName("Second Thread");
       t1.start();
       t2.start();

    }
/*
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
 */

}
