package org.basics.ocp6._47_Thread_Safe;

import org.basics.ocp6._06_Declare_Variable.Person;

class Calculator{
    private int sum = 0;

    public void add(int value){
        sum = sum + value;
    }
}

public class ThreadSafeNotes {

    public void threadSafeMethod(){
        int value = 10;
        value++;
        // bu değişkenler thread-safe özellik gösterir.
        // her thread çalıştığında yeni bir stack alanı oluşur.
        // local değişkenler stack alanında yaşarlar.
        // her threadin bir local değişkeni olacaktır.
        // local değişkenler paylaşılmazlar
        // paylaşılmadığı için risk oluşturmazlar.
    }

    // Javada nesneler heap alanında yaşarlar.
    // local değişkenler her zaman stack alanında yaşarlar.

    public void testMethod(){
        Person p = new Person();
        // p -> local değişkendir. Local değişken olduğu için stack alanında yaşar
        // p reference değişkenin gösterdiği nesne ise heap memory de yaşar.

        // paylaşılmadığı noktada thread-safe olur, geri döndürüldüğünde vs paylaşıldığında ise risk ortaya çıkar
        // thread-safe özelliğini kaybeder.
        // birden fazla thread aynı nesne üzerinden methodu çağırdığında ve
        // instance değişkeni değiştirdiğinde ortaya problem çıkabilir / risk teşkil etmektedir.

    }

}

/**
 *
 * 2 tane thread olsun (t1 ve t2), bu threadler "aynı" Calculator nesnesi üzerinde çalışsınlar
 * t1 çalıştı, add methodu çalışsın (value 2 olsun)
 * sum = sum + value;
 * -> sum değişkeninin değeri okunur (memoryden) -> 0
 * -> sum + values işlemi yapılır.
 * sum değişkenin güncel değeri memoryden yazılır.
 *
 * böyle bir işlemde 3 tane adım yer almaktadır.
 * burada 3 farklı adım olduğu için ve threadler
 * interleave / aralıklarla çalışabileceği için risk söz konusudur.
 *
 * ------------------------------------------------
 *
 * t1 geldi çalıştı "sum" değerini okudu (sum -> 0)
 * hemen okuduktan sonra "t1" threadi durabilir.
 * t2 çalışmaya başlasın, geldi, sum değerini okudu (sum -> 0)
 * t1 çalışmaya devam etsin, value 2 olsun,
 * sum + value -> 0 + 2 -> 2
 *
 * t1 çalışmaya devam etsin,
 * "sum" değeri memory'e yazılır sum = 2
 * t2 çalışmaya devam etsin
 * t2 daha önceki adımda sum in değerini okumuştu (0 idi)
 * sum + value -> 0 + 3 -> 3 olarak sum ın değerini bulur.
 *
 * t2 çalışmaya devam etsin
 * sum değerini memory e yazar sum = 3
 *
 * sonuç olarak sum ın değeri 3 oldu
 * oysa 5 olması gerekliydi.
 *
 * Birden fazla thread "aynı kaynağa" / resource üzerinde değişiklik yaptığında (write) bu problem ortaya çıkabilir.
 * race condition durumu
 *
 * i++; ifadesi / statement için ->
 * "i" nin değeri okunur/alınır.
 * "i" nin değeri 1 artırılır.
 * "i" nin değeri kaydedilir.
 *
 * Bu üç adım bir thread çalışma döngüsünde / cycle da çalışıp tamamlanacağının bir garantisi yoktur.
 *
 * ------------------------------------------
 * thread safe -> birden fazla thread aynı anda / eş zamanlı olarak methoda erişmeye çalıştığında problem olmaması durumudur.
 * problemler ; race condition, deadlock, memory consistency error gibi problemlerdir.
 *
 * local değişkenler thread safe özellik gösterirler.
 *
 */
