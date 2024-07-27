package org.basics.ocp8._04_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class PredicateTest04 {

    public static void main(String[] args) {
        getControlName("Ömer");
    }

    public static void getControlName(String name){
        List<String> list = Arrays.asList("Ömer", "Ebru", "Adil", "Elif");
        BiPredicate<List<String>, String> listContains = List::contains;
        System.out.println(listContains.test(list, name));
    }

}
