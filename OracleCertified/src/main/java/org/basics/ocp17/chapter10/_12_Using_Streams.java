package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _12_Using_Streams {

    public static void main(String[] args) {

        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream
            .filter(s -> s.startsWith("g"))
            .peek(System.out::println).count();     // grizzly
        System.out.println(count);                  // 1
        // Burada count terminal bir operatördür.

        System.out.println("--------------------");

         long count2 = Stream.of(1,2,3,4,5)
             .map(i -> i * i)
             .filter(p -> p > 0)
             .peek(i -> System.out.printf("%d ", i))
             .count();
        System.out.printf("%nThe stream has %d elements", count2);

        System.out.println();

        System.out.println("--------------------");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
            .peek(n -> System.out.println("Orijinal: " + n))
            .filter(n -> n > 2)
            .peek(n -> System.out.println("Filtrelendi: " + n))
            .map(n -> n * 2)
            .peek(n -> System.out.println("İki katı: " + n))
            .collect(Collectors.toList());

        System.out.println("--------------------");

        List<Integer> result2 = List.of(1,2,3,4,5,6,7,8,9,10);
        result2.stream()
            .filter(n -> n > 5)
            .peek(n -> System.out.print("Values : " + n + " "))
            .collect(Collectors.toList());

    }

}

/**
 *
 * -------------------- Taking A Peek --------------------
 * peek() methodu Consumer parametresi alır. Debugging için kullanışlı bir methoddur.
 * foreach methoduna benzer şekilde Consumer parametresi almaktadır.
 * peek() methodu intermediate bir methoddur (foreach() ise terminal bir operatördür.).
 * peek() methodu öncesinde filter() olmaz ise peek() methodu çalışmaz.
 * peek() bir intermediate operation (ara işlem) olup, stream içindeki her eleman üzerinde bir işlem yapmanızı sağlar, ancak stream'i değiştirmez.
 * Genellikle debugging (hata ayıklama) ve logging (loglama) için kullanılır.
 * Temel Özellikler:
 * 1. Stream'i değiştirmez - Elemanları sadece gözlemler
 * 2. Lazy evaluation - Terminal operation çağrılana kadar çalışmaz
 * 3. İşlemi görmek için kullanılır - Ara adımlarda neler olduğunu takip eder
 *
 */
