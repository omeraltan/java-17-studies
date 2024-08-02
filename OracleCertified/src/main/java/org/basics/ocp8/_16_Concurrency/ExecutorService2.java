package org.basics.ocp8._16_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService2 {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("begin");

        service.execute(() -> {
            System.out.println("sample runnable");
            System.out.println("thread execute 1: " + Thread.currentThread().getName());
        });

        service.execute(() -> {
           for (int i = 0; i < 3; i++){
               System.out.println("Printing record: " + i);
           }
            System.out.println("thread execute 2: " + Thread.currentThread().getName());
        });

        System.out.println("end");
        System.out.println(service.isShutdown());
        System.out.println(service.isTerminated());
        service.shutdown(); // -> service shutdown yapıldıktan sonra yeni bir thread başlatılamaz.

    }

}
