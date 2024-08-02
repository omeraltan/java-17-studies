package org.basics.ocp8._16_Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args) {

        AtomicInteger atomic = new AtomicInteger();
        atomic.set(10);
        atomic.getAndIncrement(); // -> ilk önce değeri alıp sonra artırım yapar. c++
        atomic.incrementAndGet(); // -> ilk önce artırım yapar sonra değeri alır. ++c

    }

}

/**
 *
 * AtomicInteger sınıfı "lock" kullanmaz bunun yerine "volatile" anahtar kelimesini kullanmaktadır.
 * "Compare-And-Set" (CAS) adı verilen bir yapıyı kullanmaktadır.
 * Bu nedenle AtomicInteger yapısı synchronized a göre daha hızlı çalışmaktadır.
 *
 */
