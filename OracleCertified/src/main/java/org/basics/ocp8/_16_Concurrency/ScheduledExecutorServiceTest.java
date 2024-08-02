package org.basics.ocp8._16_Concurrency;

import java.util.concurrent.*;

public class ScheduledExecutorServiceTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Task 1 message");

        Callable<String> task2 = () -> {
            System.out.println("Task 2 message");
            return "content";
        };

        // scheduled 3 seconds in the future
        ScheduledFuture<?> result1 = service.schedule(task1, 3, TimeUnit.SECONDS);
        // scheduled 2 seconds n the future
        ScheduledFuture<String> result2 = service.schedule(task2, 2, TimeUnit.SECONDS);

        System.out.println(result1.get());
        System.out.println(result2.get());

        service.shutdown();


    }

}
