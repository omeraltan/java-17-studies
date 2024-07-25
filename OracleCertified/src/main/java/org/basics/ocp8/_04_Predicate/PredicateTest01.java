package org.basics.ocp8._04_Predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest01 {

    public static void main(String[] args) {
        Stream.of("hello","world","sample","data","hi").filter(str -> str.startsWith("h")).forEach(System.out::println);
        Predicate<String> str1 = str -> str.startsWith("h");
        Stream.of("hello","world","sample","data","hi").filter(str1::test);
    }


}

/**
 *
 * java.util.function.Predicate<T> #boolean test(T t)
 *
 */
