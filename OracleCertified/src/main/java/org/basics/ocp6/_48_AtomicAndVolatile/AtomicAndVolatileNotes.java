package org.basics.ocp6._48_AtomicAndVolatile;

class MemoryConsistency{

    volatile int counter = 0;

    public void increment(){
        counter++;
        System.out.println(counter);
    }

}

public class AtomicAndVolatileNotes {



}

/**
 *
 *
 * volatile javada bir keyword tur.
 * counter++ gibi bir işlem için
 * 1 - counter ın değerinin alınması
 * 2 - counter ın değerinin bir artırılması
 * 3 - counter ın değerinin memory ye yazılması
 *
 * bu adımlar bölünemez. En küçük action'dır.
 * memory access işlemi (counter ın değerinin alınması) atomic bir işlemdir.
 * fakat, "double" ve "long" değrler için böyle bir garanti yoktur.
 *
 * Memory consistency error ->
 *
 * increment() methodu için;
 * 2 tane thread olduğunu varsayalım (Thread A, Thread B)
 * Thread A method a girdiğinde : counter++ işlemini yapsın -> 1
 * Thread B method a girdiğinde : counter++ işlemini yapsın -> 2
 * Thread A yazdırırken 2 yerine 1 yazdırabilir.
 *
 * volatile keyword ü -> memory consistency error problemine karşı bir çözüm sağlar.
 * volatile keyword ü bir değişkenin değeri değiştiğinde diğer threadler her zaman görünür olmasını sağlar.
 * volatile tanımlanan "long" ve "double" değişkenleri içinde memory access atomic hale gelir.
 *
 * 4 core lu CPU olsun
 * CPU ların cache memoryleri vardır.
 * Değişken eğer volatile değilse, bu durumda bu ğişken CPU nun cache memorysinde tutulabilir.
 * "volatile" keyword u , bir değişkenin değerini CPU cache yerine, bilgisayarın Main memory sine yazılmasını garanti eder.
 * non-volatile değişkenler için böyle bir garanti yoktur.
 * main memory e yazma işlemi, cpu cache işleminden daha maliyetlidir.
 *
 */
