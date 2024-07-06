package org.basics.ocp6._47_Threads;

class RunnableImpl implements Runnable {

    @Override
    /**
     * Override methodlar için yeni bir checked exception eklenemez.
     * Yani burada throws InterruptedException olamaz.
     * Yani superclass ta bulunan method için eğer
     * bu method imzasında bir checked exception varsa override methodda daha dar bir exception veya eşiti olabilir.
     */
    public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // 500 ms -> 0.5 saniye
        }
    }

}

public class SleepNotes {

    public static void main(String[] args) {
        Runnable r1 = new RunnableImpl();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}

/**
 *
 * sleep(); methodu java.lang.Thread sınıfında yer alır.  "static" bir methoddur ve "native" dir.
 * sleep(); methodu InterruptedException fırlatır. InterruptedException bir checked exception dır.
 * yani bu methodu çağırdığımızda handle or declare kuralına uymamız gerekecektir.
 * Native methoddur. Native methodlar JVM tarafından uygulanmaktadır.
 * 1 mili saniye 10^6 nano saniye yapar.
 * sleep methodu o an çalışan thread i belirtilen süre kadar askıya alır / uyutur / suspend eder.
 * sleep methodundaki süre bittikten sonra, ilgili thread in hemen o an çalışacağının bir garantisi yoktur.
 * sleep edilen thread , sure bittkten sonra tekrar runnable durumda olur ve thread scheduler tarafından tekrar seçilip çalışır duruma getirilir.
 * minimum olarak en az verilen süre kadar çalışmayacaktır.
 * Örneğin:
 * Thread t = new Thread();
 * Thread t2 = new Thread();
 * t.sleep(1000); -> Değişken üzerinden sleep methodunu çağırmamız, ilgili thread in (t) 1000 milisaniye sleep edileceği anlamına gelmez.
 * sleep methodu static bir methoddur ve o an çalışan thread hangisiyse o  thread i verilen süre kadar sleep eder.
 * Not : static methodlara değişken üzerinden değil sınıf üzerinden erişmek doğru yaklaşımdır.
 * t.sleep(1000); yanlış bir yaklaşımdır.
 * Thread.sleep(1000); doğru yaklaşımdır.
 *
 */
