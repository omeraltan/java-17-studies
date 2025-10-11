package org.basics.ocp17.chapter10;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _09_Using_Streams {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("w","o","l","f");
        StringBuilder word = stream1.collect(
            StringBuilder::new,
            StringBuilder::append,
            StringBuilder::append
        );

        System.out.println(word);

        System.out.println("--------------------");

        Stream<String> stream2 = Stream.of("w","o","l","f");
        TreeSet<String> set = stream2.collect(TreeSet::new,
            TreeSet::add,
            TreeSet::addAll
            );
        System.out.println(set);

        System.out.println("--------------------");

        /*
         * Stream: ["w", "o", "l", "f"]
         * 1. Supplier çalışır → Boş TreeSet oluştur: {}
         * 2. Accumulator her eleman için çalışır:
         *    "w" eklendi → {w}
         *    "o" eklendi → {o, w}  // TreeSet sıralı
         *    "l" eklendi → {l, o, w}
         *    "f" eklendi → {f, l, o, w}
         * 3. Combiner ÇALIŞmaz (sequential stream)
         * Sonuç: {f, l, o, w}
         */
        Stream<String> stream3 = Stream.of("w","o","l","f");

        Supplier<TreeSet<String>> supplier = () -> new TreeSet<>();
        BiConsumer<TreeSet<String>, String> accumulator = (TreeSet<String> treeSet, String e) -> treeSet.add(e);
        BiConsumer<TreeSet<String>, TreeSet<String>> combiner = (TreeSet<String> treeSet, TreeSet<String> e) ->
        {
            treeSet.addAll(e);
            System.out.println("triggered : parallel stream.");
        }; // Yukarısı sadece parallel stream'lerde çalışır

        TreeSet<String> set2 = stream3.collect(supplier, accumulator, combiner);

        System.out.println(set2);

        System.out.println("--------------------");

        Stream<String> stream4 = Stream.of("w","o","l","f");
        TreeSet<String> set3 = stream4.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set3);

        System.out.println("--------------------");

        Stream<String> stream5 = Stream.of("w","o","l","f");
        Set<String> set4 = stream5.collect(Collectors.toSet());
        System.out.println(set4);


    }

}

/**
 *
 * -------------------- Collecting --------------------
 * collect() methodu özelleşmiş bir reduction tipidir. Mutable reduction olarak ifade edilir.
 * regular reduction a göre daha verimlidir çünkü ecumulating yaparken aynı mutable object kullanılmaktadır.
 * Yaygın olarak kullanılan mutable object ler StringBuilder ve ArrayList'tir.
 * collect() methodunun iki tane versiyonu bulunmaktadır (Supplier alan ve Collector alan).
 *
 *
 */
