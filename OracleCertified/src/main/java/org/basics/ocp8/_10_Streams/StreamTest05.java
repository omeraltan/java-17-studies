package org.basics.ocp8._10_Streams;

import java.util.stream.Stream;

public class StreamTest05 {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.iterate(10, n -> n + 3);
        stream.skip(3).limit(5).forEach(System.out::println);

    }

}
