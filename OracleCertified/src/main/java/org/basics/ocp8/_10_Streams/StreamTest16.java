package org.basics.ocp8._10_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest16 {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("horse", "dog", "bird", "monkey", "cat");
        List<String> list = s1.collect(Collectors.toList()); // collect() -> methodu stream'deki elemanları listeye çevirir.
        list.forEach(System.out::println);
        System.out.println("------");
        Stream<String> s2 = Stream.of("horse", "dog", "bird", "monkey");
        List<String> list2 = s2.filter(animal -> animal.length() > 3).collect(Collectors.toList());
        list2.forEach(System.out::println);

    }

}
