package org.basics.ocp8._10_Streams;

import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest03 {

    public static void main(String[] args) {

        Function<Integer, Integer> f1 = i -> i * 2;
        Function<Integer, Integer> f2 = (Integer i) -> i * 3;

        Stream.of(1,2,3,4,5,6,7,8,9).map(i -> i*2).forEach(System.out::println); // map methodu -> Function ile çalışır.
        System.out.println("-----");
        Stream.of(1,2,3,4,5).map(f1).forEach(System.out::println);
        System.out.println("-----");
        Stream.of(1,2,3,4,5).map(f2).forEach(System.out::println);

    }

}
