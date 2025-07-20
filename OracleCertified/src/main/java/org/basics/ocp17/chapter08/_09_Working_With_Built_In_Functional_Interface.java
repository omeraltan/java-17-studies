package org.basics.ocp17.chapter08;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _09_Working_With_Built_In_Functional_Interface {

    public static void main(String[] args) {

        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        System.out.println("---------------");

        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));

        System.out.println("---------------");

        predicateExample();

        System.out.println("---------------");

        predicateHelperExample();

        System.out.println("---------------");

        biPredicateExample();

        System.out.println("---------------");

        biPredicateHelperExample();

    }

    private static void predicateExample(){
        Predicate<List<Integer>> p1 = (List<Integer> list) -> list.contains(100);
        Predicate<List<Integer>> p2 = List::isEmpty;

        System.out.println(p1.test(List.of(10, 20, 50, 100)));
        System.out.println(p2.test(List.of(1,2,3)));
    }

    private static void predicateHelperExample(){
        Predicate<Long> p1 = PredicateHelper::checkSize;
        Predicate<Integer> p2 = PredicateHelper::checkSize;
        Predicate<PredicateHelper> p3 = PredicateHelper::sampleMethod;
        // Predicate<PredicateHelper> p4 = PredicateHelper::sampleStaticMethod; // DOES NOT COMPILE
        Predicate<PredicateHelper> p5 = PredicateHelper::sampleStaticMethod2;

        System.out.println(p1.test(20L));
        System.out.println(p2.test(10));
        System.out.println(p3.test(new PredicateHelper(100)));
        System.out.println(p5.test(new PredicateHelper(10)));
    }

    private static void biPredicateExample(){
        BiPredicate<String,String> b1 = String::startsWith;
        BiPredicate<String,String> b2 = (string, prefix) -> string.startsWith(prefix);
        BiPredicate<String,String> b3 = String::contains;
        BiPredicate<String,String> b4 = (string, suffix) -> string.endsWith(suffix);
        BiPredicate<String,String> b5 = String::contains;

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
        System.out.println(b3.test("hello", "world"));
        System.out.println(b4.test("hello", "world"));
        System.out.println(b5.test("iLikeJava","java"));
    }

    private static void biPredicateHelperExample(){
        BiPredicate<Integer, Integer> b1 = BiPredicateHelper::check;
        BiPredicate<String, Integer> b2 = BiPredicateHelper::check2;

        System.out.println(b1.test(1,5));
        System.out.println(b2.test("hello", 5));
    }

}

class PredicateHelper{
    private int size;

    public PredicateHelper(int size){
        this.size = size;
    }

    static boolean checkSize(long size){
        return size > 10;
    }

    static boolean checkSize(int size){
        return size > 10;
    }

    boolean sampleMethod(){
        return this.size == 10;
    }

    static boolean sampleStaticMethod(){
        return false;
    }

    static boolean sampleStaticMethod2(PredicateHelper ph){
        return ph == null;
    }

}

class BiPredicateHelper{

    static boolean check(Integer i, Integer j){
        return i > j;
    }

    static Boolean check2(String s, Integer i){
        return s.length() > i;
    }

}

/**
 *
 * ----- Implementin Predicate and BiPredicate -----
 * Predicate; filtreleme yani eşleştirme için kullanılır.
 * BiPredicate; Predicate ile aynı şekilde çalışır sadece bir yerne iki tane parametre alır.
 * İkisininde methodu "test" 'tir ve geriye boolean döner.
 * boolean test (T t);
 * boolean test (T t, U u);
 *
 */
