package org.basics.ocp8._09_Binary;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest01 {

    public static void main(String[] args) {

        BiFunction<String, String, String> concat = (String x, String y) -> x.concat(y);
        System.out.println(concat.apply("a", "b"));
        // Bu aşağıdaki String::concat -> String alıp String döndüğü için ve String sınıfında olduğu için aşağıdaki şekliyle kullanılabilir.
        BiFunction<String, String, String> concat2 = String::concat;
        System.out.println(concat2.apply("a", "b"));

        BiFunction<Double,Double, Integer> bif1 = Double::compare;
        BiFunction<Double,Double, Integer> bif2 = Double::compareTo;

        Function<String, String> f1 = String::toUpperCase;
        Function<String, String> f2 = String::toLowerCase;
        Function<String, String> f3 = x -> x.toUpperCase();

        Function<String, char[]> f4 = x -> x.toCharArray();
        Function<String, char[]> f5 = String::toCharArray;


    }

}

/**
 *
 *
 *
 */
