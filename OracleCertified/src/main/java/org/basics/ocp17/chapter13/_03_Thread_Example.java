package org.basics.ocp17.chapter13;

public class _03_Thread_Example {

    public static void main(String[] args) {


        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record " + i);
            }
        };

        System.out.println("begin");
        new Thread(printInventory).run();
        new Thread(printRecords).run();
        new Thread(printInventory).run();
        System.out.println("end");

    }

    /**
     *
     * Oluşacak çıktı her zaman aynıdır :
     *
     * begin
     * Printing zoo inventory
     * Printing record 0
     * Printing record 1
     * Printing record 2
     * Printing zoo inventory
     * end
     *
     */

}


/**
 *
 * Bu kod çalışmaz çünkü "run()" methodu thread i çalıştırmaz.
 * Bir Thread yada Runnable methodu üzerinde "run()" methodunu çalıştırmak bir thread oluşturmaz.
 * Yeni bir tread oluşturmak için start() methodunu çalıştırmak gerekmektedir.
 * Bu kodlar sırayla çalışacaktır ve herhangi bir thread oluşmayacaktır. Herhangi bir asenkron durum yoktur.
 *
 *
 */
