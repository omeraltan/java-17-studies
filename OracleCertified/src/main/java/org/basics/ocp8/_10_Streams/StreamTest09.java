package org.basics.ocp8._10_Streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest09 {

    public static void main(String[] args) {

        Stream<String> animalStream1 = Stream.of("dog", "monkey", "horse");
        Stream<String> animalStream2 = Stream.of("dog", "monkey", "horse");
        Comparator<String> comparator = (String s1, String s2) -> s1.length() - s2.length();
        Optional<String> minLengthElement = animalStream1.min(comparator);
        System.out.println(minLengthElement);
        Optional<String> maxLengthElement = animalStream2.max(comparator);
        System.out.println(maxLengthElement);

    }

}
