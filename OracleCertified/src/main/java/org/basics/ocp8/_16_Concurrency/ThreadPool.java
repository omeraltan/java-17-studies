package org.basics.ocp8._16_Concurrency;

import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

        Callable<String> task1 = () -> {
            System.out.println("task1 message");
            printNumber();
            return "content1";
        };

        Callable<String> task2 = () -> {
            System.out.println("task2 message");
            printNumber();
            return "content2";
        };

        Callable<String> task3 = () -> {
            System.out.println("task3 message");
            printNumber();
            return "content3";
        };

        Callable<String> task4 = () -> {
            System.out.println("task4 message");
            printNumber();
            return "content4";
        };

        ScheduledFuture<String> result1 = service.schedule(task1, 100, TimeUnit.MILLISECONDS);
        ScheduledFuture<String> result2 = service.schedule(task2, 100, TimeUnit.MILLISECONDS);
        ScheduledFuture<String> result3 = service.schedule(task3, 100, TimeUnit.MILLISECONDS);
        ScheduledFuture<String> result4 = service.schedule(task4, 100, TimeUnit.MILLISECONDS);

        Thread.sleep(500);
        if (result1.isDone() && result2.isDone() && result3.isDone() && result4.isDone()) {
            System.out.println("shutdown...");
            service.shutdown();
        }


    }

    private static void printNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i + " , " + Thread.currentThread().getName());
        }
    }

}
