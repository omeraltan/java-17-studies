package org.basics.ocp17.chapter13;

public class _05_Thread_Example {

    public static void main(String[] args) {

        Thread currentMainThread = Thread.currentThread();

        System.out.println("## currentMainThread ##");
        System.out.println(currentMainThread.getState());
        System.out.println(currentMainThread.isAlive());

        Thread thread = new Thread(() -> System.out.println("hello world"));
        System.out.println(" ## before thread.start() ##");
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());

        thread.start();

        System.out.println(" ## after thread.start() ##");
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());

    }

}

/**
 *
 * Thread lifecycle :  Bir thread in durumunu getState() ile elde ederiz.
 * Her bir thread new state i ile başlar. Thread i start() ile çağırmadığımızda thread in durumu new dir (created but not started).
 * start() methodu çağırıldığında thread runnable state ine geçecektir.
 * Bu thread in tam anlamıyla çalıştığı anlamına gelmez. Bu durumda çalışıyorda olabilir. Çalışmıyorda olabilir.
 * runnable state i thread in çalışmaya uygun olduğu anlamına gelmektedir.
 * "runnable" statinde olduğunda "thread schadule" tarafından çalıştırılabilir veya çalıştırılmaya bilir
 * run() methodu çalıştırılıpta thread tamamlandığında "termitaned" durumuna geçer.
 * Bir thread runnable state inde iken üç durumdan birine geçebilir. "blocked", "waiting", "timed_waiting"
 * Runnable state i thread in çalışmaya uygun olduğu state tir.
 * "blocked", "waiting" ve "timed_waiting" durumlarında çalışmaz.
 * blocked       : waiting to enter synchronized block (synchronized anahtar kelimesi ile)
 * waiting       : wait(), notify()
 * timed_waiting : sleep()
 *
 *
 *
 *      new     --------> start() --------->    runnable   -----------> run() ----------->  terminated
 *                                                  |
 *                                     ________________________________
 *                                    |             |                 |
 *                                blocked       waiting         timed_waiting
 *
 */
