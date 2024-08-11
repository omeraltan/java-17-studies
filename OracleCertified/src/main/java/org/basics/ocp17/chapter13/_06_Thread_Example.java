package org.basics.ocp17.chapter13;

public class _06_Thread_Example {

    private static int counter = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter++;
            }
        }).start();
        while (counter < 1_000_000) {
            System.out.println(counter);
            System.out.println("Not reached yet.");
        }
        System.out.println("Reached :" + counter);
    }

}

class _06_Thread_Example2 {

    private static int counter = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter++;
            }
        }).start();
        while (counter < 1_000_000) {
            System.out.println("Not reached yet.");
            try {
                Thread.sleep(1_000);
            }catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Reached :" + counter);
    }

}



/**
 *
 * polling -> belirli aralıklarla verileri kontrol etme sorgulama işlemidir
 * while döngüsü ile verileri kontrol etmek CPU kaynaklarını sebepsiz yere kullandığı için kötü bir kod uygulaması olarak kabul edilir.
 * polling -> CPU nun potansiyel olarak sonsuz bir döngüye maruz kalmasını engellesede döngünün ne zaman sona ereceğini garanti etmez.
 *
 *
 */
