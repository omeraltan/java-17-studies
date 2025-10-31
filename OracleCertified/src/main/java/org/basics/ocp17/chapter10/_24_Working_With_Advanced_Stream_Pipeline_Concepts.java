package org.basics.ocp17.chapter10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _24_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        var ohMy1 = Stream.of("lions","tigers","bears");
        Map<Integer, List<String>> map1 = ohMy1.collect(Collectors.groupingBy(String::length));
        System.out.println(map1);   // {5=[lions, bears], 6=[tigers]}

        System.out.println("--------------------");

        var ohMy2 = Stream.of("lions","tigers","bears","bears","fish","fish","bird");
        Map<Integer, Set<String>> map2 = ohMy2.collect(
            Collectors.groupingBy(
                String::length,
                Collectors.toSet()));
        System.out.println(map2);

        System.out.println("--------------------");

        var ohMy3 = Stream.of("lions","tigers","bears","bears","fish","fish","bird");
        TreeMap<Integer, Set<String>> map3 = ohMy3.collect(
            Collectors.groupingBy(
                String::length,
                TreeMap::new,
                Collectors.toSet()));
        System.out.println(map3);

        System.out.println("--------------------");

        String[] string = "you never know what you have until you clean your room".split(" ");
        Stream<String> distinctWords = Arrays.stream(string).distinct();

        Map<Integer,List<String>> wordGroups = distinctWords
            .collect(Collectors.groupingBy(String::length));

        wordGroups.forEach(
            (count, words) -> {
                System.out.printf("word(s) of length %d %n", count);
                words.forEach(System.out::println);
            }
        );
    }

}

/**
 *
 * -------------------- Grouping, Partitioning, and Mapping --------------------
 * groupingBy(classifier[, downstream])     → Elemanları bir sınıflandırma anahtarına göre gruplar ve bir Map<K, List<T>> (veya downstream ile başka tür) döndürür.
 * partitioningBy(predicate[, downstream])  → Elemanları boole koşuluna göre ikiye böler ve Map<Boolean, List<T>> (veya downstream ile başka tür) döndürür.
 *
 * groupingBy():
 * groupingBy(classifier) → Elemanları classifier ile gruplar; Map<K, List<T>> döndürür.
 * groupingBy(classifier, downstream) → Gruplama yapıp her grupta downstream kolektörünü uygular (ör. toSet, counting, averagingInt).
 * groupingBy(classifier, mapSupplier, downstream) → Gruplama + downstream + Map türünü mapSupplier ile belirleme (LinkedHashMap, TreeMap, vb.).
 *
 * partitioningBy():
 * partitioningBy(predicate) → Elemanları predicate’e göre ikiye böler; Map<Boolean, List<T>> döndürür.
 * partitioningBy(predicate, downstream) → Partition yapıp her part’ta downstream kolektörünü uygular.
 *
 * mapping():
 * mapping(mapper, downstream) → Değerleri mapper ile dönüştürüp downstream kolektörüne verir; genelde groupingBy/partitioningBy içinde kullanılır.
 *
 */
