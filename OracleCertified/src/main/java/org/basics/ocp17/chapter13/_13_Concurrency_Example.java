package org.basics.ocp17.chapter13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _13_Concurrency_Example {

    public static void main(String[] args) {

        Runnable printRecords = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Printing record " + i);
            }
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            service.execute(printRecords);
            System.out.println("end");
        }finally {
            service.shutdown();
            System.out.println("service.isShutdown() = " + service.isShutdown());
            System.out.println("service.isTerminated() = " + service.isTerminated());
        }

        service.execute(printRecords);

    }

}

/**
 *
 * Sonuç olarak, shutdown() çağrıldıktan sonra ExecutorService yeni görev kabul etmez ve eğer bir görev çalışıyorsa bu görev tamamlanır.
 * Yeni bir görev eklemeye çalışırsanız, RejectedExecutionException hatası alırsınız.
 *
 */
