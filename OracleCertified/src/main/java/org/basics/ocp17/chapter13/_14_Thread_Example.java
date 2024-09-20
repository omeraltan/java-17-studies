package org.basics.ocp17.chapter13;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running...");
    }
}

public class _14_Thread_Example {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
    }

}


/**
 *
 * Java'da bir thread, bağımsız bir şekilde çalışabilen en küçük birimdir. Java'da thread'leri oluşturmanın iki ana yolu vardır:
 *
 * Thread sınıfını genişletmek (extend)
 * Runnable arayüzünü uygulamak (implement)
 *
 */
