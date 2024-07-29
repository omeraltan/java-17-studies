package org.basics.ocp8._11_Optional;

import java.util.Optional;

public class OptionalTest01 {

    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> nonEmptyOptional = Optional.of("abracadabra");
        System.out.println(nonEmptyOptional);

        //Optional<String> nullStr = Optional.of(null);
        //System.out.println(nullStr); // return nullPointerException

        Optional<String> emptyStr = Optional.ofNullable(null);
        System.out.println(emptyStr); // return Optional.empty
    }

}
