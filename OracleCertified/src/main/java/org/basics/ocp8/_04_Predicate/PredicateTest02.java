package org.basics.ocp8._04_Predicate;

import java.util.function.Predicate;

public class PredicateTest02 {

    public static void main(String[] args) {

        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = x -> x.length() > 0;
        Predicate<String> mergePredicate = nullCheck.and(emptyCheck); // -> iki fonksiyonun birleşiminin kontrolü

        String message ="hello world";
        String nullStr = null;

        System.out.println(mergePredicate.test(message));
        System.out.println(mergePredicate.test(nullStr));

    }

}
