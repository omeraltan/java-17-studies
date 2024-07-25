package org.basics.ocp8._07_Supplier;

import java.util.function.Supplier;

public class SupplierTest02 {

    public static void main(String[] args) {

        Supplier<String> s1 = () -> "test";
        Supplier<Integer> s2 = () -> 100;

        System.out.println(s1.get());
        System.out.println(s2.get());

    }

}
