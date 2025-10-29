package org.basics.ocp17.chapter10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _25_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        var ohMy1 = Stream.of("lions","tigers","bears","cat","dog","crocodile");
        Map<Boolean, List<String>> map1 = ohMy1.collect(
            Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map1);    // {false=[tigers], true=[lions, bears]}

        System.out.println("--------------------");
        // şartı sağlamayan eleman yoksa liste boş döner. Şöyle gözükecektir -> false=[]
        var ohMy2 = Stream.of("lions","tigers","bears");
        Map<Boolean, List<String>> map2 = ohMy2.collect(
            Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map2);    // {false=[], true=[lions, tigers, bears]}

        System.out.println("--------------------");
        // duplicate elemanlar için istenmiyorsa toSet() kullanılabilir.
        var ohMy3 = Stream.of("lions","tigers","bears","bears","lions","tigers");
        Map<Boolean, Set<String>> map3 = ohMy3.collect(
            Collectors.partitioningBy(
                s -> s.length() <= 7,
                Collectors.toSet()
            ));
        System.out.println(map3);    // {false=[], true=[lions, tigers, bears]}

        System.out.println("--------------------");



    }

}

/**
 *
 * -------------------- Partitioning --------------------
 * Collectors.partitioningBy(), Stream API'de koleksiyonları bir boolean koşula göre iki gruba ayırmak için kullanılır.
 * Map<Boolean, List<T>> döndürür (true ve false listeleri).
 * partitioningBy(Predicate<T> predicate)                       -> Elemanları boolean koşula göre iki listeye ayırır. Map<Boolean, List<T>> döndürür.
 * partitioningBy(Predicate<T> predicate, Collector downstream) -> Gruplar oluşturduktan sonra her grup için ek işlem yapar.
 */
