package org.basics.ocp8._10_Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTest07 {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("brown-","bear-");
        s.sorted().forEach(System.out::println);
        System.out.println("-----");
        Stream<String> s2 = Stream.of("ömer","ebru","adil","elif");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

}
