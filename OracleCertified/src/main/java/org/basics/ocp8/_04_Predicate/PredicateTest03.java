package org.basics.ocp8._04_Predicate;

import java.util.function.Predicate;

public class PredicateTest03 {

    public static void main(String[] args) {

        Predicate<String> p1 = (String x) -> x.isEmpty();
        Predicate<String> p2 = String::isEmpty;

        System.out.println(p1.test("a"));
        System.out.println(p1.test(""));
        System.out.println(p2.test("c"));

    }

}
