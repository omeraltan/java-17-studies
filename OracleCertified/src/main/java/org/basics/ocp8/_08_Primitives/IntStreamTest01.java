package org.basics.ocp8._08_Primitives;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamTest01 {

    public static void main(String[] args) {

        IntPredicate ip1 = i -> i % 2 == 0;
        IntStream.range(1,100).filter(ip1).forEach(System.out::println);

    }

}
