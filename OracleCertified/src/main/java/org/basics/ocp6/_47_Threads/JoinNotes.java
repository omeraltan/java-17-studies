package org.basics.ocp6._47_Threads;

class Task1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("i : " + i);
        }
    }
}

class Task2 implements Runnable {


    @Override
    public void run() {
        for (int j = 0; j < 20; j++) {
            System.out.println("j : " + j);
        }
    }
}

public class JoinNotes {

    public static void main(String[] args) throws InterruptedException {
        Task1 task1 = new Task1();
        Thread t1 = new Thread(task1);

        Task2 task2 = new Task2();
        Thread t2 = new Thread(task2);

        t1.start();
        t1.join();
        // t1 thread i bitene kadar t2 thread i çalışmayacaktır.
        t2.start();
    }

}

/**
 *
 * Join methodu Thread sınıfında yer alır, sleep methodunun aksine non-static bir methoddur.
 *
 *
 */
