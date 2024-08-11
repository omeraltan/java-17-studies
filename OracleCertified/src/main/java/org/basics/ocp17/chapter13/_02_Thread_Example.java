package org.basics.ocp17.chapter13;

public class _02_Thread_Example {

    public static void main(String[] args) {

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
          for (int i = 0; i < 3; i++) {
              System.out.println("Printing record " + i);
          }
        };

        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();
        System.out.println("end");

    }

}

/**
 *
 * Burada 4 tane thread vardır. Bunlara "main()" thread i de dahildir.
 * Bu tread ler asenkron olarak çalışırlar. Yani main methodunu çalıştıran thread devam etmek için diğer bir thread in sonunu beklemez.
 *
 *
 */
