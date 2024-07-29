package org.basics.ocp8._10_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest12 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("monkey","2","horse");
        Stream<String> infinite = Stream.generate(() -> "horse");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        // System.out.println(list.stream().anyMatch(pred)); // -> true
        // System.out.println(list.stream().allMatch(pred)); // -> false
        System.out.println(list.stream().noneMatch(pred));   // -> false

    }

}
