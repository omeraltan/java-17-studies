package org.basics.ocp17.chapter10;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class _06_Using_Streams {

    public static void main(String[] args) {

        var list = List.of("monkey","2","chimp");
        Stream<String> infinite1 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));   // true
        System.out.println(list.stream().allMatch(pred));   // false
        System.out.println(list.stream().noneMatch(pred));  // false
        System.out.println(infinite1.anyMatch(pred));        // true

        System.out.println("--------------------");

        Stream<String> s1 = Stream.empty();
        Stream<String> s2 = Stream.empty();
        Stream<String> s3 = Stream.empty();

        System.out.println(s1.allMatch(p -> p.length() == 3));  // true     (Eğer stream boş ise geriye true değer dönmektedir.)
        System.out.println(s2.noneMatch(p -> p.length() == 3)); // true     (Eğer stream boş ise geriye true değer dönmektedir.)
        System.out.println(s3.anyMatch(p -> p.length() == 3));  // false    (Eğer stream boş ise geriye false değer dönmektedir.)

        System.out.println("--------------------");

        Stream<Integer> s4 = Stream.of(10,20,30,40,50);
        Stream<Integer> s5 = Stream.of(10,20,30,40,50);
        Stream<Integer> s6 = Stream.of(10,20,30,40,50);

        System.out.println(s4.allMatch(p -> p > 5));    // true
        System.out.println(s5.noneMatch(p -> p < 5));   // true
        System.out.println(s6.anyMatch(p -> p < 15));   // true

        System.out.println("--------------------");

        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        boolean result1 = infinite2.allMatch(s -> s.length() > 10);
        System.out.println(result1);                                            // false (infinite de değerler devam eder ancak allMatch çalıştığında ve koşul any olduğu için false döner)

        System.out.println("--------------------");

        Stream<String> infinite3 = Stream.generate(() -> "chimp");
        boolean result2 = infinite3.allMatch(s -> s.length() > 4);      // break (burada allMatch methodu takılı kaldığı için kırılır)
        System.out.println(result2);

        System.out.println("--------------------");

    }

}

/**
 *
 * -------------------- Matching --------------------
 * allMatch(), anyMatch() ve noneMatch() methodları Predicate parametresi alırlar ve geriye boolean bir değer dönerler.
 *
 *
 *
 */
