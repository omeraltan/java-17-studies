package org.basics.ocp17.chapter13;

public class _01_Introduction_Threads {

    public static void main(String[] args) {

        new Thread(() -> System.out.print("Hello")).start();
        System.out.println(" World"); // -> Bu çıktıların yeri değişebilir.
        Runnable runnable = () -> System.out.print("Hello");
    }

}

class ThreadExample{

    public static void main(String[] args) {
        new Thread(
            () -> System.out.print("Hello " + Thread.currentThread().getName() + "#")
        ).start();

        System.out.println("World " + Thread.currentThread().getName() + "#");
    }

    /**
     *
     * Çalıştırıldıktan sonra oluşabilecek threadler : "main" thread i ve "Thread-0" dir.
     * main thread i dışındaki thread e isim verilmediği için java bizim yerimize isim olarak "Thread-0" verdi
     *
     */

}

/**
 *
 * Thread kavramı ve Threadleri yönetmek için kullanılan Concurrency API anlatılacaktır.
 * Bu konuları anlamak java developerlar için biraz zordur.
 * Gerçek uygulamalarda, pratikte concurrency problemlerinin tespit edilmesi ve çözümlenmesi en zor olan problemlerdendir.
 * Thread: Bir işletim sistemi tarafından programlanabilen, schedule edilebilen en küçük yürütme birimidir.
 * Bir process aynı paylaşılan ortamda yani shared environment ta yürütülen ilişkili thread lerden oluşur.
 * Shared Environment : Aynı process teki threadlerin aynı bellek alanını paylaştığı ve birbirleri ile doğrudan iletişim kurdukları bir ortam anlamına gelmektedir.
 * Concurrency: Aynı anda birden fazla process ve thread yürütme özelliğine denir.
 * Thread Schedules : Context Switch işleminin en aza indirilmesi için ellerinden geleni yaparlar.
 * Br thread diğer bir thread den daha yüksek bir önceliğe sahipse çalışan thread kesilebilir ve onun yeni önceliği yüksek olan thread tarafından alınabilir.
 * Thread Priority : Thread Schedule tarafından dikkate alınan, thread ile ilişkili bir nümerik değerdir.
 * Bir thread için görev tanımlamanın en yaygın yollarından biri Runnable interface dir.
 * Runnable interface i herhangi bir argüman almayan veri dönmeyen functional interface dir.
 *
 */
