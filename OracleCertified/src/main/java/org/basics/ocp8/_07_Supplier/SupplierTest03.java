package org.basics.ocp8._07_Supplier;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierTest03 {

    public static void main(String[] args) {

        Supplier<String> str1 = () -> new String("hello");
        Supplier<String> str2 = String::new;

        Function<String, Integer> f1 = Integer::new;
        Function<Integer, Integer> f2 = Integer::new;

    }

}
