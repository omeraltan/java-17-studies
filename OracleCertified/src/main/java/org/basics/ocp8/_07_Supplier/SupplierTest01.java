package org.basics.ocp8._07_Supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest01 {

    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Integer> supplier = random::nextInt;
        // nextInt methodu static değildir. Bu case için direkt sınıf ismi::methodIsmi şeklinde kullanamayız.

        Stream.generate(supplier).limit(10).forEach(System.out::println);
    }

}

/**
 *
 * public interface Supplier<T>
 * T get();
 *
 */
