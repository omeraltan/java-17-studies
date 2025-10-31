package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class _11_Using_Streams {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("brown-","bear-");
        s1
            .sorted()
            .forEach(System.out::print);    // -> bear-brown-

        System.out.println();

        System.out.println("--------------------");

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::print);

        System.out.println();

        System.out.println("--------------------");

        Stream<String> s3 = Stream.of("brown bear-", "grizzly-");
        // s3.sorted(Comparator::reverseOrder()); // DOES NOT COMPILE

        // Comparator<String> comparator = Comparator::reverseOrder;
        Supplier<Comparator> supplier = Comparator::reverseOrder;   // -> Supplier ile uyumludur.

        System.out.println("--------------------");

        List<String> words = Arrays.asList("follow your heart but take your brain with you.".split(" "));
        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        words.stream()
            .distinct()
            .sorted(lengthCompare)
            .forEach(System.out::println);

        System.out.println("--------------------");

        List<String> words2 = Arrays.asList("follow your heart but take your brain with you.".split(" "));
        Comparator<String> lengthCompare2 = Comparator.comparingInt(String::length);
        words2.stream()
            .distinct()
            .sorted(lengthCompare2.thenComparing(Comparator.naturalOrder()))
            .forEach(System.out::println);

    }

}

/**
 *
 * ------------------- Sorting --------------------
 * sorted() methodu stream'deki elemanları sıralar.
 * İki tane versiyonu yer almaktadır.
 * Bir tanesi parametre almayan             : sorted()
 * Diğeri ise Comparator parametresi alan   : sorted(Comparator<? super T> comparator)
 *
 */
