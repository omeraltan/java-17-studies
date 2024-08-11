package org.basics.ocp17.chapter13;

public class _04_Thread_Example {

    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.start();
        thread.start(); // -> IllegalThreadStateException

    }

}

/**
 *
 * Bir thread sadece bir kez "start()" edilebilir. İkinci defa start() edilmeye çalışıldığında hata verir.
 * Bir thread kendi içinde lineer şekilde çalışmaktadır.
 *
 */
