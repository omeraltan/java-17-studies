package org.basics.ocp8._10_Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest18 {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        IntStream is = s1.mapToInt(t -> t);
        is.forEach(System.out::println);
        System.out.println("-----");
        Stream<String> s2 = Stream.of("1", "2", "3", "4", "5", "6", "7");
        IntStream is2 = s2.mapToInt(Integer::parseInt);
        is2.forEach(System.out::println);

    }

}
