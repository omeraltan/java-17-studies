package org.basics.ocp8._10_Streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest22 {

    public static void main(String[] args) {

        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
            .collect(Collectors.toMap(name -> name, name -> name.length()));
        nameLength.forEach((name, length) -> System.out.println(name + " " + length));

    }

}
