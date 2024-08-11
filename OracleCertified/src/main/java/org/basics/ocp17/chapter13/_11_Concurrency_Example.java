package org.basics.ocp17.chapter13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _11_Concurrency_Example {

    public static void main(String[] args) {

        Runnable printInventory = () ->
            System.out.println("Printing zoo inventory, Thread : " + Thread.currentThread().getName());

        Runnable printRecords = () -> {
          for (int i = 0; i < 3; i++) {
              System.out.println("Printing record : " + i + ", Thread : " + Thread.currentThread().getName());
          }
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        }finally {
            service.shutdown();
        }

        System.out.println("Thread : " + Thread.currentThread().getName());
    }

}

/**
 *
 * Bu örnek, ExecutorService kullanarak görevlerin nasıl sıralı bir şekilde tek bir thread üzerinde çalıştırıldığını gösterir.
 * Eğer newSingleThreadExecutor() yerine daha fazla thread içeren bir ExecutorService kullanılsaydı, görevler farklı thread'lerde paralel olarak çalışabilirdi.
 *
 */
