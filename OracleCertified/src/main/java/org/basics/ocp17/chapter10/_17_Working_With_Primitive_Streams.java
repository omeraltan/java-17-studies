package org.basics.ocp17.chapter10;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class _17_Working_With_Primitive_Streams {

    public static void main(String[] args) {

        IntSummaryStatistics stats = IntStream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
            .summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());

        System.out.println("--------------------");

        String limerick = "There was a young lady named Bright " +
            "who traveled much faster than light " +
            "in a relative way " +
            "and came back the previous night ";

        IntSummaryStatistics wordStatistics =
            Pattern.compile(" ")
                .splitAsStream(limerick)
                .mapToInt(String::length)
                .summaryStatistics();

        System.out.printf("""
                        Number of words = %d
                        Sum of the length of the words = %d
                        Minimum word size = %d
                        Maximum word size %d
                        Average word size = %f
                        """,
            wordStatistics.getCount(),
            wordStatistics.getSum(),
            wordStatistics.getMin(),
            wordStatistics.getMax(),
            wordStatistics.getAverage());

    }

}

/**
 *
 * -------------------- Summarizing Statistics --------------------
 * summaryStatistics() :
 *  1. IntStream, LongStream ve DoubleStream’lerde kullanılır.
 *  2. Tek geçişte count, sum, min, max ve average verilerini toplar.
 *  3. IntSummaryStatistics, LongSummaryStatistics veya DoubleSummaryStatistics döner.
 *  4. Dönen nesne içinde şunlar vardır:
 *          getCount() → eleman sayısı
 *          getSum() → toplam
 *          getMin() → minimum
 *          getMax() → maximum
 *          getAverage() → ortalama
 *
 *  5. Kullanım amacı:
 *      Bir akışı tek seferde tarayıp min, max, ort ve toplam gibi istatistikleri almak için.
 *      Her metrik için ayrı terminal işlem yapmaktansa, tek bir geçişle toplu veri toplama.
 * Not: Stream<T> (generic) üzerinde direkt yoktur; sayısal akışlar için kullanılır.
 *
 */
