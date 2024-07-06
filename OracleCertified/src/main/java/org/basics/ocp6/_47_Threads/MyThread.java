package org.basics.ocp6._47_Threads;

/**
 *
 * 1 - java.lang.Thread class ını kalıtırız.
 * 2 - public void run methodunu override ederiz.
 * 3 - java.lang paketinde yer aldığı için herhangi bir import işlemine gerek yoktur.
 *
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Task is starting...");
        System.out.println("Current Thread in MyThread#run : " + Thread.currentThread().getName());
    }

}
