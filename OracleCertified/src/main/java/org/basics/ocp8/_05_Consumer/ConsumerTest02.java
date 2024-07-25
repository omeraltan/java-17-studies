package org.basics.ocp8._05_Consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest02 {

    public static void main(String[] args) {
        Stream<String> strings = Stream.of("hello", "world");
        Consumer<String> printString = System.out::println;
        strings.forEach(printString);
    }

}
