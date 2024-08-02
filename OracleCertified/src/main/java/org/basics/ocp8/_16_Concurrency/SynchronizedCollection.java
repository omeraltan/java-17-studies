package org.basics.ocp8._16_Concurrency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {

    public static void main(String[] args) {

        List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> synchronizedList = Collections.synchronizedList(numbers);

    }

}

/**
 *
 * synchronized method lar Collection sınıfında yer almaktadır.
 * Elimizde bulunan bir listeyi thread-safe hale getirmek istiyorsak bu methodlardan faydalanabiliriz.
 * synchronizedCollection(Collection<T> c)
 * synchronizedList(List<T> list)
 * synchronizedMap(Map<K,V> m)
 *
 * synchronized kullandığımızda o an ilgili methoda sadece bir tane thread girebilir.
 * Collection'ı synchronized yaptığımızda ise, benzer şekilde bütün bir collection lock lanır.
 * Aynı anda sadece bir tane thread işlem yapabilir.
 *
 * Concurrent collectionlarda ise durum farklıdır. Birden fazla thread ilgili collection üzerinde çalışabilir.
 * Buradaki lock kilit mekanizması bütün bir Collection üzerinde olmaz.
 * Buradaki mantıkta aynı eleman/index üzerinde birden fazla thread çalışamaz.
 *
 */
