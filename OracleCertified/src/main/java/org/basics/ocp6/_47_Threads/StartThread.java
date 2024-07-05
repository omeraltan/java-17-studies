package org.basics.ocp6._47_Threads;

public class StartThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("Current Thread in main : " + Thread.currentThread().getName());
        // myThread.run(); // Bu methodu kendimiz çağırdığımızda "yeni bir thread oluşmaz!"
        myThread.start(); // Yeni bir thread oluşur.

        // Her thread başladığında yeni bir stack alanı oluşur.
        // Her thread'in kendi stack alanı mevcuttur.

        // public synchronized void start(){
        // start methodu Thread sınıfında yer alır.
        // Runnable interface ini implements ettiğimizde Thread nesnesi oluşturulur ve
        // runnable değişkenimize parametre olarak constructor a verilir.

        MyRunnable myRunnable = new MyRunnable();
        // myRunnable.start(); // legal deiğildir.

        Thread t1 = new Thread(myRunnable);
        t1.start();
    }

}
