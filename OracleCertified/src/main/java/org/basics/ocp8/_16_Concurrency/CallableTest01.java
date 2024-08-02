package org.basics.ocp8._16_Concurrency;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;


public class CallableTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Runnable r1 = () -> System.out.println("Runnable!");

        Callable<Integer> c1 = () -> {
            System.out.println("Callable!");
            return 1;
        };

        Future<?> f1 = service.submit(r1);
        Future<Integer> f2 = service.submit(c1);

        System.out.println(f1.get());
        System.out.println(f2.get());
    }

}
