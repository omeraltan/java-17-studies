package org.basics.ocp17.chapter08;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _13_Using_Convenience_Methods_On_Functional_Interfaces {

    public static void main(String[] args) {

        // Predicate örneği:
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        // Yukarıdaki brownEggs ve otherEggs'in kısa yazımı aşağıdaki gibidir.
        Predicate<String> brownEggs2 = egg.and(brown);
        Predicate<String> otherEggs2 = egg.and(brown.negate());

        // Consumer örneği:
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.println(",2: " + x);

        Consumer<String> combined = c1.andThen(c2); // andThen methodunda ilk önce sol taraf çalışır (c1).
        combined.accept("Annie"); // 1: Annie,2: Annie

        System.out.println("---------------");

        // Function örneği:
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;

        Function<Integer, Integer> combined2 = after.compose(before); // compose methodunda ik önce sağ taraf çalışır (before).
        System.out.println(combined2.apply(3));




    }

}

/**
 *
 * Tanım gereği tüm functional interface'ler tek bir abstract method'a sahiptir.
 * Bu tek bir methoda sahip olacağı anlamına gelmez.
 * Functional interface'ler default yada static methodlara sahip olabilirler.
 *
 * --------------- Convenience Methods ---------------
 * -------------------------------------------------------------------------------------------
 * Interface Instance       Method return type      Method name     Method parameters
 * -------------------------------------------------------------------------------------------
 * Consumer                 Consumer                andThen()       Consumer
 * Function                 Function                andThen()       Function
 * Function                 Function                compose()       Function
 * Predicate                Predicate               and()           Predicate
 * Predicate                Predicate               negate()        ---
 * Predicate                Predicate               or()            Predicate
 *
 * Binary interface'lerde de benzer methodlar bulunmaktadır.
 *
 */
