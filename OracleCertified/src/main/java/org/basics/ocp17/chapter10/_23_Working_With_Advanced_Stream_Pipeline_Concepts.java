package org.basics.ocp17.chapter10;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _23_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        var ohMy1 = Stream.of("lions","tigers","bears");
        Map<String,Integer> map1 = ohMy1.collect(
            Collectors.toMap(s -> s, String::length));
        System.out.println(map1); // {lions=5, bears=5, tigers=6}
        System.out.println(map1.getClass());

        System.out.println("--------------------");

        var ohMy2 = Stream.of("lions","tigers","bears");
        Map<String,Integer> map2 = ohMy2.collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map2);
        System.out.println(map2.getClass());

        System.out.println("--------------------");

        var ohMy3 = Stream.of("lions","tigers","bears","dog","cat","bird");
        Map<Integer, String> map3 = ohMy3.collect(Collectors.toMap(
           String::length,
            k -> k,
            (s1,s2) -> s1 + "," + s2
        ));
        System.out.println(map3);   // {3=dog,cat, 4=bird, 5=lions,bears, 6=tigers}
        System.out.println(map3.getClass());

        System.out.println("--------------------");

        var ohMy4 = Stream.of("lions","tigers","bears","dog","cat","bird","fish");
        Map<Integer, String> map4 = ohMy4.collect(Collectors.toMap(
            String::length,
            k -> k,
            (s1,s2) -> s1 + "," + s2,
            TreeMap::new
        ));
        System.out.println(map4);   // {3=dog,cat, 4=bird, 5=lions,bears, 6=tigers}
        System.out.println(map4.getClass());

        System.out.println("--------------------");





    }

}

/**
 *
 * -------------------- Collecting Into Maps --------------------
 * Java’da Collectors.toMap() ne işe yarar?
 * Bir akıştaki (Stream) elemanları, verdiğiniz anahtar ve değer fonksiyonlarına göre Map yapısına dönüştürür.
 * toMap(keyMapper, valueMapper)                                → Akıştaki her elemanı verilen anahtar ve değer fonksiyonlarıyla bir Map’e dönüştürür; aynı anahtar oluşursa hata (IllegalStateException) fırlatır; varsayılan Map türü HashMap’tir.
 * toMap(keyMapper, valueMapper, mergeFunction)                 → Anahtar çakıştığında değerleri nasıl birleştireceğini mergeFunction ile tanımlarsınız; böylece duplicate key hatası yerine birleştirme uygulanır; Map türü yine HashMap’tir.
 * toMap(keyMapper, valueMapper, mergeFunction, mapSupplier)    → Çakışma çözümünü mergeFunction belirler, üretilecek Map türünü (örn. LinkedHashMap, TreeMap) mapSupplier belirler; hem çakışma yönetimi hem Map tipi özelleştirilebilir.
 *
 * keyMapper        : Her elemandan anahtar üretir.
 * valueMapper      : Her elemandan değer üretir.
 * mergeFunction    : Aynı anahtar tekrar edilirse nasıl birleştirileceğini tanımlar; verilmezse duplicate key hatası fırlatır.
 * mapSupplier      : Hangi Map türünün üretileceğini belirler (ör. LinkedHashMap, TreeMap, HashMap).
 *
 * Function.identity() nedir?
 * Function.identity() girdiği değeri aynen geri döndüren fonksiyondur. Eşdeğeri: t -> t. Dönüş tipi Function<T, T>.
 * Ne zaman kullanılır?
 * Collectors.toMap valueMapper olarak: Değerin kendisini koymak istediğinizde.
 * Ara adımda “no-op” dönüşüm: Map, flatMap, vs. içinde hiçbir şey yapmadan iletmek.
 * Metot referansı olarak okunabilirlik: x -> x yerine.
 *
 */
