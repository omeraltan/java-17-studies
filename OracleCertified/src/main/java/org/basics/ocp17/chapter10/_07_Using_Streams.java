package org.basics.ocp17.chapter10;

import java.util.List;
import java.util.stream.Stream;

public class _07_Using_Streams {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("Monkey","Gorilla","Bonobo");
        s1.forEach(System.out::println);

        System.out.println("-------------------");

        Stream<Integer> s2 = Stream.of(1);
        // for (Integer : s2) {} // DOES NOT COMPILE (Traditional for döngüsü Stream'ler ile birlikte kullanılamazlar. Çünkü Stream, iterable interface'ini kalıtmaz.)

        System.out.println("-------------------");

        streamForEach();

        System.out.println("-------------------");

        streamForEach2();

        System.out.println("-------------------");

        collectionForEach();

        System.out.println("-------------------");

        streamForLoop();

    }

    private static void streamForEach() {
        Stream<String> s = Stream.of("Monkey","Gorilla","Bonobo");
        s.forEach(System.out::println);
    }

    private static void streamForEach2() {
        Stream<String> s = Stream.of("Monkey","Gorilla","Bonobo");
        s.forEach(e -> System.out.println(e + "-"));
    }

    private static void collectionForEach() {
        List<String> list = List.of("Monkey","Gorilla","Bonobo");
        list.forEach(System.out::println);
    }

    private static void streamForLoop() {
        Stream<Integer> s = Stream.of(1);
        // for (Integer : s) {} // DOES NOT COMPILE
    }




}

/**
 *
 * -------------------- Iterating --------------------
 * Java Collection framework'ünde olduğu gibi Stream'de yer alan elemanlar üzerinde de dönebiliriz.
 * Bunun için foreach methodu kullanılmaktadır. Foreach methodu consumer bir parametre alır ve void tipinde bir dönüşe sahiptir.
 * Sonsuz Stream'ler için foreach methodu stream'i sonlandırmaz, geriye bir değer dönmez, reduction bir özelliğe sahip değildir.
 * forEach() methodu hem Collection üzerinde hemde Stream üzerinde yer almaktadır.
 *
 *
 */
