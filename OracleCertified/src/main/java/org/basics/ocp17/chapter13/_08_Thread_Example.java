package org.basics.ocp17.chapter13;

public class _08_Thread_Example {

    public static void main(String[] args) {

        Thread thread = new Thread(
            () -> {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("The index of i : " + i);
                        Thread.sleep(500);
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        );

        thread.start();
        thread.interrupt(); // -> java.lang.InterruptException

        // Calling interrupt() on a thread ib the TIMED_WAITING or WAITING state
        // causes the main() thread to become RUNNABLE again,
        // triggering an InterruptedException

        System.out.println("After interrupt invoked...");
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());


    }

}
