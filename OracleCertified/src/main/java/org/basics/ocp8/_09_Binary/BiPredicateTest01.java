package org.basics.ocp8._09_Binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest01 {

    public static void main(String[] args) {

        List aList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BiPredicate<List<Integer>, Integer> bip = (List<Integer> list, Integer i) -> list.contains(i);
        BiPredicate<List<Integer>, Integer> listContains = List::contains;
        System.out.println(bip.test(aList, 3));
        System.out.println(listContains.test(aList, 5));
        System.out.println("-------------");
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (String x, String y) -> x.startsWith(y);

        System.out.println(b1.test("hello", "h"));
        System.out.println(b2.test("java", "ja"));


    }

}

