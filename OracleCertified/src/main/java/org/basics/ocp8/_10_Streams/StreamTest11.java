package org.basics.ocp8._10_Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest11 {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("key1", "key2", "key3");
        Optional<String> opt = s1.findFirst(); // -> findFirst() Terminal operation
        System.out.println(opt.get());
    }

}
