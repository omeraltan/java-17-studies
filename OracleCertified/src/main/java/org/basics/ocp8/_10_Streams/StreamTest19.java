package org.basics.ocp8._10_Streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamTest19 {

    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();
        optional.ifPresent(System.out::println);

    }

}
