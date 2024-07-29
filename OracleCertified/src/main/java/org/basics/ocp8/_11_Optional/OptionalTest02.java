package org.basics.ocp8._11_Optional;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {

        Optional<String> string = Optional.of("    Hello    ");
        string.map(String::trim).ifPresent(System.out::println);

    }

}
