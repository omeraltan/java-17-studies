package org.basics.ocp6._47_Threads;

class LoopThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " index : " + i);
        }
    }
}

public class LoopThreadTest {

    public static void main(String[] args) {

        System.out.println("Starting main...");
        LoopThread t1 = new LoopThread();
        t1.start();

        LoopThread t2 = new LoopThread();
        t2.start();

        LoopThread t3 = new LoopThread();
        t3.start();

        // Burada 3 tane thread oluşturuldu,
        // Default olarak ismi Thread-0, Thread-1, Thread-2 şeklinde olmaktadır.
        // Çıktının bir garantisi yoktur. Her defasında farklı olabilir.
        // Bir thread başladığında işi bitmeden bir başka thread başlayabilir.
        // Her thread in amacı "run" methodundaki işini(job) tamamlamaktır.
        // run methodu tamamlandığında (start edip yeni thread oluşturulduktan sonra)
        // thread -> TERMINATED duruma gelir. Artık bu thread i tekrar start edemeyiz.
        System.out.println("Ending main...");

        // Thread Scheduler mekanizması bu yöntemden sorumludur.
        // Thread Scheduler JVM in bir parçasıdır.
        // Hangi thread in çalışacağının ibr garantisi yoktur.
        // Diyelim ki 3 tane thread olsun:
        // thread 1 çalıştı sonra durdu
        // thread 2 çalıştı sonra durdu
        // thread 3 ün çalışacağının bir garantisi yoktur.
        // tekrar thread 1 çalışabilir.
        // sırasıyla çalışacak diye bir durum yoktur.
        // Thread Scheduler bizim kontrolümüzde değildir.
    }

}
