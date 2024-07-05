package org.basics.ocp6._47_Threads;

public class CreateThreadObject {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // Burada bir MyThread (Thread) objesi oluşturulmuştur.
        // Şuan bir iş parçacığı (lightweight process) çalıştırılmamıştır.

        MyRunnable myRunnable = new MyRunnable();
        // MyRunnable nesnesi olşuturulmuştur.
        Thread thread = new Thread(myRunnable);
        // Runnable interface ini implements ettiğimizde yine "Thread" nesnesi gereklidir.
        // Threadlerin state/durumları vardır.
        // Burada henüz treadler "new" durumundadır. Canlı durumda değildirler.

        System.out.println("Current Thread is main: " + Thread.currentThread().getName());
        myRunnable.run();
        // run methodunu direkt olarak çağırdığımzda yeni bir Thread (iş parçası) oluşmaz.

        myThread.run();

        //------------------------------------;

    }

}

/**
 *
 *
 *
 */
