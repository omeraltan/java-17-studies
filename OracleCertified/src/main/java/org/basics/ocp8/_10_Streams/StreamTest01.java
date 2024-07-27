package org.basics.ocp8._10_Streams;

import java.util.stream.Stream;

public class StreamTest01 {

    public static void main(String[] args) {

        /*---------------------------------------Source------------------------------------*/
        Stream<String> stream = Stream.of("Ahmet", "Ali", "Mehmet", "Ayşe", "Murat");
        /*------Intermediate Operations-----|------Terminal Operation-----|*/
        stream.filter(s -> s.startsWith("A")).forEach(System.out::println);

    }

}
