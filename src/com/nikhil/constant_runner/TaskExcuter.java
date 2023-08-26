package com.nikhil.constant_runner;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskExcuter
{

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = () ->  {
            System.out.println("Task Executed at -> "+ System.currentTimeMillis());
        };

        scheduler.scheduleAtFixedRate(task,0,3, TimeUnit.SECONDS);

        System.out.println("Press Enter to terminate...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Terminate the scheduler when done
        scheduler.shutdown();
        try {
            // Wait a reasonable amount of time for the scheduler to terminate
            if (!scheduler.awaitTermination(10, TimeUnit.SECONDS)) {
                scheduler.shutdownNow(); // Forcefully shut down if not terminated
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            scheduler.shutdownNow(); // Forcefully shut down on interruption
        }

    }
}
