package org.basics.ocp17.chapter13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource{
    private final Lock lock = new ReentrantLock();

    public boolean tryMethod1(Resource r){
        try {
            if (lock.tryLock()) {
                System.out.println(Thread.currentThread().getName() + ": method1 başladı.");
                Thread.sleep(100);
                return r.tryMethod2();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (lock.tryLock()){
                lock.unlock();
            }
        }
        return false;
    }

    public boolean tryMethod2() {
        if (lock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " method2 başladı.");
                return true;
            } finally {
                lock.unlock();
            }
        }
        return false;
    }
}

public class _19_Thread_TryLock_Example {

    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread t1 = new Thread(() -> {
            while (!resource1.tryMethod1(resource2)) {
                System.out.println(Thread.currentThread().getName() + " kaynakları alamadı, tekrar deniyor...");
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            while (!resource2.tryMethod1(resource1)) {
                System.out.println(Thread.currentThread().getName() + " kaynakları alamadı, tekrar deniyor...");
            }
        }, "Thread 2");

        t1.start();
        t2.start();
    }

}
