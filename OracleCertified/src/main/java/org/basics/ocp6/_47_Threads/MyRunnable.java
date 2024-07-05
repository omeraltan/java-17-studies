package org.basics.ocp6._47_Threads;


/**
 *
 * 1 - java.lang.Runnable interface ini implement ederiz.
 * 2 - "run" methodunu override ederiz.
 *
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Task is starting...");
        System.out.println("Current Thread in MyRunnable#run : " + Thread.currentThread().getName());
    }
}
