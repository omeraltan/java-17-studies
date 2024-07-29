package org.basics.ocp8._10_Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest25 {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("lions", "tigers", "bears");
        Stream<String> s2 = Stream.of("lions", "tigers", "bears");

        String joined1 = s1.collect(Collectors.joining());
        System.out.println(joined1);

        String joined2 = s2.collect(Collectors.joining(","));
        System.out.println(joined2);

    }

}
