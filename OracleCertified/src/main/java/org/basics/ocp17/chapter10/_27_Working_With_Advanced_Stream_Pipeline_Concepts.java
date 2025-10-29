package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _27_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        record Separations(String spaceSeparated, String commaSeparated){}

        var list = List.of("x","y","z");

        Separations result = list.stream()
                .collect(Collectors.teeing(
                    Collectors.joining(" "),
                    Collectors.joining(","),
                    (s,c) -> new Separations(s,c)));
        System.out.println(result);


        System.out.println("--------------------");

        List<Double> numbers1 = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0);

        Double average = numbers1.stream()
            .collect(Collectors.teeing(
                Collectors.summingDouble(Double::doubleValue),  // Toplam hesapla
                Collectors.counting(),                          // Sayı say
                (sum, count) -> sum / count        // Böl ve ortalama bul
            ));

        System.out.println(average); // 30.0

        System.out.println("--------------------");

        List<Integer> numbers2 = Arrays.asList(5, 2, 8, 1, 9, 3, 7);

        record MinMax(int min, int max) {}

        MinMax result2 = numbers2.stream()
            .collect(Collectors.teeing(
                Collectors.minBy(Integer::compareTo),  // En küçük
                Collectors.maxBy(Integer::compareTo),  // En büyük
                (minOpt, maxOpt) -> new MinMax(
                    minOpt.orElse(Integer.MAX_VALUE),
                    maxOpt.orElse(Integer.MIN_VALUE)
                )
            ));

        System.out.println(result2); // MinMax[min=1, max=9]

        System.out.println("--------------------");

        List<Integer> numbers3 = Arrays.asList(10, 20, 30, 40, 50);

        record Stats(long count, int total) {}

        Stats stats = numbers3.stream()
            .collect(Collectors.teeing(
                Collectors.counting(),                    // Sayı
                Collectors.summingInt(Integer::intValue), // Toplam
                Stats::new                                // Constructor ile birleştir
            ));

        System.out.println(stats); // Stats[count=5, total=150]

        System.out.println("--------------------");

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        record NumberGroups(String evens, String odds) {}

        NumberGroups groups = numbers4.stream()
            .collect(Collectors.teeing(
                Collectors.mapping(
                    n -> n % 2 == 0 ? String.valueOf(n) : "",
                    Collectors.joining(", ")
                ),  // Çift sayılar
                Collectors.mapping(
                    n -> n % 2 != 0 ? String.valueOf(n) : "",
                    Collectors.joining(", ")
                ),  // Tek sayılar
                NumberGroups::new
            ));

        System.out.println(groups); // NumberGroups[evens=2, 4, 6, 8, 10, odds=1, 3, 5, 7, 9]

        System.out.println("--------------------");

        record Book(String name, String author, Integer year, Integer soldCopies){}

        List<Book> books = Arrays.asList(
            new Book("1984", "George Orwell", 1949, 30000000),
            new Book("Animal Farm", "George Orwell", 1945, 20000000),
            new Book("The Hobbit", "J.R.R. Tolkien", 1937, 140000000)
        );

        record BookStats(long totalBooks, long totalSales) {}

        BookStats bookStats = books.stream()
            .collect(Collectors.teeing(
                Collectors.counting(),                          // Kitap sayısı
                Collectors.summingLong(Book::soldCopies),       // Toplam satış
                BookStats::new
            ));

        System.out.println(bookStats); // BookStats[totalBooks=3, totalSales=190000000]

    }

}

/**
 *
 * -------------------- Teeing Collectors --------------------
 * Aynı stream’i aynı anda iki farklı collector'a “çatallayıp” sonuçlarını birleştirir.
 * Tek geçişte iki sonuç üretip merger ile tek sonuca dönüştürür. Java 12+.
 * teeing(Collector<? super T, ?, R1> c1, Collector<? super T, ?, R2> c2, BiFunction<? super R1, ? super R2, ? extends R> merger) -> Aynı veriyi c1 ve c2 ile ayrı ayrı toplar; çıkan R1 ve R2 sonuçlarını merger ile tek R çıktısına çevirir.
 * teeing yapısı ile çoklu terminal işlemi kullanmış oluyoruz.
 *
 *
 */
