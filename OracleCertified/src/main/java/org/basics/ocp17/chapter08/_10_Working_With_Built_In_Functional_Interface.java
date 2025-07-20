package org.basics.ocp17.chapter08;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _10_Working_With_Built_In_Functional_Interface {

    public static void main(String[] args) {

        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));

        System.out.println("---------------");

        functionExample();

        System.out.println("---------------");

        functionExample2();

        System.out.println("---------------");

        functionExample3();

        System.out.println("---------------");

        biFunctionExample();

    }

    private static void functionExample(){
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        Function<String, String> f3 = String::toUpperCase;
        Function<String, String> f4 = s -> s.toUpperCase();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));
        System.out.println(f3.apply("hello"));
        System.out.println(f4.apply("hello"));
    }

    private static void functionExample2(){
        String str = "content";
        Function<String, Integer> f1 = str::indexOf;
        System.out.println(f1.apply("o"));
    }

    private static void functionExample3(){
        Function<List<Integer>, Integer> f1 = List::size;
        Function<List<Integer>, Integer> f2 = (list) -> list.size();

        System.out.println(f1.apply(List.of(1,2,3)));
        System.out.println(f2.apply(List.of(1,2,3)));
    }

    private static void biFunctionExample(){
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));
    }

}

/**
 *
 * ----- Implementing Function and BiFunction -----
 * Function interface'i apply(); methoduna sahiptir. T tipinde bir parametre alır ve geriye R tipinde bir değer döner.
 * R apply (T t);
 * BiFunction interface'i apply(T t, U u); methodu sahiptir. T ve U tipinde iki tane parametre alır ve gerite R tipinfe bir değer döner.
 * R apply (T t, U u);
 *
 *
 */
