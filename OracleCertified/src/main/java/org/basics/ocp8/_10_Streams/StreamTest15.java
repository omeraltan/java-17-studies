package org.basics.ocp8._10_Streams;

import java.util.stream.Stream;

public class StreamTest15 {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(3,5,6);
        System.out.println(stream.reduce(2, (a,b) -> a * b));

    }

}
