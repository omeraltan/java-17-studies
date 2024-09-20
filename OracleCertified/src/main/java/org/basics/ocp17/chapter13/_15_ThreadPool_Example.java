package org.basics.ocp17.chapter13;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Task is running...");
    }
}

public class _15_ThreadPool_Example {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Task());
        executor.shutdown();
    }

}


/**
 *
 * Thread Havuzu Kullanımı:
 * 1. Java'da eşzamanlı programlama yaparken, genellikle "ExecutorService" veya "ThreadPoolExecutor" gibi thread havuzları kullanılır.
 * 2. Bu thread havuzları, işlerin yürütülmesi için Runnable veya Callable nesnelerini kabul eder.
 * 3. Thread sınıfı yerine Runnable arayüzü kullanmak, bu tür thread havuzları ile daha iyi entegrasyon sağlar ve daha verimli bir şekilde çoklu thread yönetimi yapmanıza olanak tanır.
 *
 */
