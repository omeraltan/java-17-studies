package org.basics.ocp17.chapter13;

class MyThreadLife extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(2000);  // Thread'i 2 saniyeliğine bekleme durumuna geçirir.
            System.out.println("Thread is awake and terminating...");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class _16_Thread_Life_Cycle_Example {

    public static void main(String[] args) {
        MyThreadLife thread = new MyThreadLife();
        System.out.println("Thread state after creation: " + thread.getState()); // NEW

        thread.start();
        System.out.println("Thread state after start: " + thread.getState()); // RUNNABLE

        try {
            Thread.sleep(100); // Ana thread'i kısa bir süre uyutuyoruz
            System.out.println("Thread state during sleep: " + thread.getState()); // TIMED_WAITING
            thread.join(); // Ana thread, thread'in tamamlanmasını bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after termination: " + thread.getState()); // TERMINATED
    }

}

/**
 *
 * Bir thread Java'da aşağıdaki durumlar arasında geçiş yapabilir:
 *
 * 1. New (Yeni)                    : Thread oluşturuldu ancak henüz başlatılmadı (start() metodu çağrılmadı).
 * Runnable (Çalıştırılabilir)      : Thread start() metodu çağrıldıktan sonra bu duruma geçer.
 *                                    Bu durumda, thread ya çalıştırılmaya hazırdır ya da CPU tarafından çalıştırılmaktadır.
 * Blocked (Engellenmiş)            : Thread bir kaynağı beklediğinde bu duruma geçer.
 *                                    Örneğin, başka bir thread'in kilidini (lock) bekliyor olabilir.
 * Waiting (Bekleme)                : Thread bir başka thread'in belirli bir işlemi tamamlamasını beklediğinde bu duruma geçer.
 *                                    Örneğin, wait() metodu çağrıldıysa veya bir thread, başka bir thread'in tamamlanmasını beklemek için join() metodunu çağırdıysa.
 * Timed Waiting (Zamanlı Bekleme)  : Thread belirli bir süre boyunca bekleyeceğinde bu duruma geçer.
 *                                    Örneğin, sleep(milliseconds) metodu çağrıldıysa veya wait(milliseconds) metodu çağrıldıysa.
 * Terminated (Sonlanmış)           : Thread görevini tamamladıktan veya sonlandırıldıktan sonra bu duruma geçer.
 *
 *        +----------+
 *       |  New     |
 *       +----------+
 *            |
 *            | start()
 *            v
 *       +----------+
 *       | Runnable |
 *       +----------+
 *        /       \
 *       /         \
 *      v           v
 * +--------+   +--------+
 * |Running |-->|Blocked |
 * +--------+   +--------+
 *       |         |
 *       |         |
 *       |         v
 *       |     +--------+
 *       |     |Waiting |
 *       |     +--------+
 *       |         |
 *       |         |
 *       |         v
 *       |   +--------------+
 *       |   |Timed Waiting |
 *       |   +--------------+
 *       |         |
 *       |         |
 *       +---------v
 *       +----------+
 *       |Terminated|
 *       +----------+
 *
 */
