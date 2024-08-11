package org.basics.ocp17.chapter13;

public class _09_Thread_Example {

    public static void main(String[] args) {

        Thread thread = new Thread(
            () ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("The index of i : " + i);
                }
            }
        );
        thread.start();
        thread.interrupt();

        System.out.println("thread.isInterrupted() : " + thread.isInterrupted());

    }

}

/**
 *
 * Bu örnekte, interrupt() çağrısı thread'in çalışmasını durdurmaz; sadece thread'in kesilmek üzere işaretlendiğini gösterir.
 * Ancak thread bir sleep, wait veya join gibi engelleyici bir işlemde olsaydı, InterruptedException fırlatılabilir ve thread'in çalışması kesilirdi.
 * Bu durumda thread'in normal şekilde çalışmasını tamamladığını ve kesilme durumunun isInterrupted() ile kontrol edildiğinde true olduğunu gözlemleyebiliriz.
 *
 */
