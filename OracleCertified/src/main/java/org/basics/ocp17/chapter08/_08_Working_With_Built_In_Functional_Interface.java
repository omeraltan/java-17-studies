package org.basics.ocp17.chapter08;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _08_Working_With_Built_In_Functional_Interface {

    public static void main(String[] args) {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

        System.out.println("---------------");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);

        System.out.println("---------------");

        var map2 = new HashMap<String, String>();
        BiConsumer<String, String> b3 = map2::put;
        BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);

        b3.accept("chicken", "Cluck");
        b4.accept("chick", "Tweep");

        System.out.println(map2);

        System.out.println("---------------");

        BiConsumer<String, String> bc1 = String::concat;
        BiConsumer<String, String> bc2 = (str1, str2) -> str1.concat(str2);
        BiConsumer<String, String> bc3 = (str1, str2) ->
        {
            System.out.println(str1.concat(str2));
        };

        bc1.accept("hello", "world");
        bc2.accept("hello", "world");
        bc3.accept("hello", "world");



    }

}

/**
 *
 * ----- Implementing Consumer and BiConsumer -----
 * Consumer geriye bir değer dönmez ve void tipinde bir methoda sahiptir (accept(T t);).
 * BiConsumer ise iki tane parametre almaktadır (T, U). Aynı şekilde void tipinde bir methoda sahiptir (accept (T t, U u);).
 *
 *
 *
 */
