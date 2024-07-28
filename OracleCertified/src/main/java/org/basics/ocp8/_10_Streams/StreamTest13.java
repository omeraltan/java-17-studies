package org.basics.ocp8._10_Streams;

import java.util.stream.Stream;

public class StreamTest13 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("element1", "element2", "element3"); // -> Source
        stream.forEach(System.out::println); // -> foreach() is a terminal operation

    }

}
