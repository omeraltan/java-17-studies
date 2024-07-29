package org.basics.ocp8._10_Streams;

import java.util.stream.Stream;

public class StreamTest08 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Hello", "World");
        long elementSize = stream.count();
        System.out.println(elementSize);

    }

}
