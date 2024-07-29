package org.basics.ocp8._10_Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest26 {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
        Map<Integer, List<String>> map = s1.collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        System.out.println("----------");
        Stream<String> s2 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
        Map<Integer, Set<String>> map2 = s2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2);

    }

}
