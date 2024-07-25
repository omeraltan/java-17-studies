package org.basics.ocp8._06_Function;

import java.util.function.Function;

public class FunctionTest02 {

    public static void main(String[] args) {

        // Bu üç method aynıdır.
        Function<String, Integer> f1 = (String str) -> {return Integer.parseInt(str);};
        Function<String, Integer> f2 = Integer::parseInt; // -> Bu işlem static methodlar için geçerlidir.
        Function<String, Integer> f3 = str -> Integer.parseInt(str);

        Integer parsedValue = f1.apply("1000");
        System.out.println(parsedValue);
    }

}
