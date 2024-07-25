package org.basics.ocp8._05_Consumer;

import java.util.function.Consumer;

public class ConsumerTest01 {

    public static void main(String[] args) {

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("Hello World");
    }

}

/**
 *
 * java.util.function.Consumer
 * void accept(T t);
 *
 */
