package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _21_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions","tigers","bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);                                         // lions, tigers, bears

        System.out.println("--------------------");

        var ohMy2 = Stream.of("lions","tigers","bears");
        String result2 = ohMy2.collect(Collectors.joining());
        System.out.println(result2);                                        // lionstigersbears

        System.out.println("--------------------");

        var ohMy3 = Stream.of("lions","tigers","bears");
        String result3 = ohMy3.collect(Collectors.joining(", ", "[","]"));
        System.out.println(result3);                                        // [lions, tigers, bears]

        System.out.println("--------------------");

        Stream<Integer> stream = Stream.of(10,20,30);
        String streamResult = stream.map(String::valueOf).collect(Collectors.joining(", ","[","]"));
        System.out.println(streamResult);                                   // [10, 20, 30]

        System.out.println("--------------------");

        var ohMy4 = Stream.of("lions","tigers","bears");
        Double result4 = ohMy4.collect(Collectors.averagingInt(String::length));
        System.out.println(result4);

        System.out.println("--------------------");

        IntStream numbers = IntStream.of(10,20,30);
        ToIntFunction<Integer> mapper = e -> e + 5;

        Double numberResult = numbers.boxed().collect(Collectors.averagingInt(mapper)); // numbers.boxed() ile IntStream → Stream<Integer>’e dönüştürülür; çünkü Collectors.averagingInt bir Stream<T> ister.
        System.out.println(numberResult);

        System.out.println("--------------------");

        var ohMy5 = Stream.of("lions","tigers","bears");
        TreeSet<String> result5 = ohMy5
            .filter(s -> s.startsWith("t"))
            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result5);

        System.out.println("--------------------");

        String frenchCounting = "un:deux:trois:quatre";
        List<String> gmailList = Pattern.compile(":")
            .splitAsStream(frenchCounting)
            .collect(Collectors.toList());
        gmailList.forEach(System.out::println);

        System.out.println("--------------------");

        var ohMy6 = Stream.of("lions","tigers","bears","tigers");
        Set<String> result6 = ohMy6
            .filter(s -> s.startsWith("t"))
            .collect(Collectors.toSet());
        System.out.println(result6);

        System.out.println("--------------------");

        String[] roseQuote = "a rose is a rose is a rose".split(" ");
        Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());
        words.forEach(System.out::println);

    }

}

/**
 *
 * --------------------- Collecting Results ---------------------------------------------------------------------------------------------------
 * collect() methodu terminal bir methoddur.
 * Collector sınıfında yer alan bir çok method vardır.
 * Bunları collect methodu içerisinde kullanabiliriz.
 *
 * ------------------------------------------ Examples Of Grouping/Partitioning Collectors ----------------------------------------------------
 * Collector                                        Description                                             Return value when passed to collect
 * --------------------------------------------------------------------------------------------------------------------------------------------
 * averagingDouble(ToDoubleFunction f)              Calculates average for three core primitive types       Double
 * averagingInt(ToIntFunction f)
 * counting()                                       Counts number of elements                               Long
 * filtering(Predicate p, Collector c)              Applies filter before calling downstream collector      R
 * groupingBy(Function f)                           Creates map grouping Map<K, List<T>> by specified       Map<K, List<T>>
 *                                                  function with optional map type supplier and
 *                                                  optional downstream collector
 * groupingBy(Function f, Collector dc)
 * groupingBy(Function f, Supplier s, Collector dc)
 *
 * joining(CharSequence cs)                         Creates single String using cd as delimiter             String
 *                                                  between elements if one is specified
 *
 * maxBy(Comparator c)                              Finds largest/smallest elements                         Optional<T>
 * minBy(Comparator c)
 *
 * mapping(Function f, Collector dc)                Adds another level of collectors                        Collector
 *
 * partitioningBy(Predicate p)                      Creates map grouping by specified predicate with        Map<Boolean, List<T>>
 *                                                  optional further downstream collector.
 * partitioningBy(Predicate p, Collector dc)
 *
 * summarizingDouble(ToDoubleFunction f)            Calculates average, min, max, etc.                      DoubleSummaryStatistics
 * summarizingInt(ToIntFunction f)                  Calculates average, min, max, etc.                      IntSummaryStatistics
 * summarizingLong(ToLongFunction f)                Calculates average, min, max, etc.                      LongSummaryStatistics
 *
 * summingDouble(ToDoubleFunction f)                Calculates sum for our three core primitive types       Double
 * summingInt(ToIntFunction f)                      Calculates sum for our three core primitive types       Integer
 * summingLong(ToLongFunction f)                    Calculates sum for our three core primitive types       Long
 *
 * teeing(Collector c1, Collector c2, BiFunction f) Works with results of two collectors to create new type R
 *
 * toList()                                         Creates arbitrary type of list or set                   List
 * toSet()                                          Creates arbitrary type of list or set                   Set
 *
 * toCollection(Supplier s)                         Creates Collection of specified type                    Collection
 *
 * toMap(Function k, Function v)                    Creates map using functions to map keys, values,        Map
 *                                                  optional merge function, and optional map type supplier
 * toMap(Function k, Function v, BinaryOperator m)
 * toMap(Function k, Function v, BinaryOperator m, Supplier s)
 *
 *
 */
