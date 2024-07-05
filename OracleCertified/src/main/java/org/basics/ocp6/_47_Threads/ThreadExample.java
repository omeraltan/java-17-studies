package org.basics.ocp6._47_Threads;

public class ThreadExample {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Thread.currentThread());
        // javada main methodu çalıştığında yeni bir thread oluşur (main thread  output : Hello World! Thread[main,5,main]).
        // output taki 5'in anlamı priority'dir.
    }

}
