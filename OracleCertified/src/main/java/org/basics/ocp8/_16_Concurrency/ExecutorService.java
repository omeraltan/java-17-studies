package org.basics.ocp8._16_Concurrency;

import java.util.concurrent.Executor;

class RepeatExecutor implements Executor{

    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void execute(Runnable runnable, int times){
        System.out.printf("Calling Task.run() %d times thro' Executor.execute %n", times);
        for(int i=0; i<times; i++){
            execute(runnable);
        }
    }
}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Calling Task.run() ");
    }
}

public class ExecutorService {

    public static void main(String[] args) {
        Runnable runnable = new Task();
        System.out.println("Calling Task.run() by directly creating a Thread");
        Thread thread = new Thread(runnable);
        thread.start();
        RepeatExecutor repeatExecutor = new RepeatExecutor();
        repeatExecutor.execute(runnable, 3);
    }

}

/**
 *
 *                                              Executor (Interface)
 *                                                      |
 *                                          Executor Service (Interface)
 *                                                      |
 *                                    AbstractExecutorService (abstract class)
 *                                         |                        |
 *                                ThreadPoolExecutor            ForkJoinPool
 *                                         |
 *                            ScheduledThreadPoolExecutor
 *
 * Executor interface'i içerisinde sadece "void execute(Runnable command)" diye bir method bulunmaktadır.
 *
 *
 *
 */
