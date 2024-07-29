package org.basics.ocp8._10_Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest27 {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
        Predicate<String> p1 = s -> s.length() < 5;
        Map<Boolean, List<String>> map = s1.collect(Collectors.partitioningBy(p1));
        System.out.println(map);


    }

}
