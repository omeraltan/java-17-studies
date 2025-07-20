package org.basics.ocp17.chapter08;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class _11_Working_With_Built_In_Functional_Interface {

    public static void main(String[] args) {

        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));

        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAd) -> string.concat(toAd);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));

        System.out.println("---------------");

        unaryOperatorExample();

        System.out.println("---------------");

        unaryOperatorExample2();

        System.out.println("---------------");

        unaryOperatorHelperExample();

        System.out.println("---------------");

        binaryOperatorExample();

        System.out.println("---------------");

        binaryOperatorExample2();

        System.out.println("---------------");

        binaryOperatorHelperExample();

    }

    private static void unaryOperatorExample(){
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));
    }

    private static void unaryOperatorExample2(){
        String str = "content";
        UnaryOperator<String> u1 = str::concat;
        System.out.println(u1.apply("chirp"));
    }

    private static void unaryOperatorHelperExample(){
        UnaryOperator<Integer> u1 = UnaryOperatorHelper::square;
        // UnaryOperator<Integer> u2 = UnaryOperatorHelper::square2; //  DOES NOT COMPILE (square2 methodu long parametre aldığı için)
        UnaryOperator<Long> u3 = UnaryOperatorHelper::square2;

        System.out.println(u1.apply(25));
        System.out.println(u3.apply(10L));
    }

    private static void binaryOperatorExample(){
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));
    }

    private static void binaryOperatorExample2(){
        BinaryOperator<Double> b1 = Math::pow;
        BinaryOperator<Integer> b2 = Math::max;

        System.out.println(b1.apply(2.0, 5.0));
        System.out.println(b2.apply(12, 15));
    }

    private static void binaryOperatorHelperExample(){
        BinaryOperator<Integer> b1 = BinaryOperatorHelper::multiply;
        BinaryOperator<Integer> b2 = (Integer i, Integer j) -> BinaryOperatorHelper.multiply(i, j);

        System.out.println(b1.apply(10, 6));
        System.out.println(b2.apply(10, 6));
    }

}

class UnaryOperatorHelper{

    static int square(int i){
        return i * i;
    }

    static long square2(long i){
        return i * i;
    }

}

class BinaryOperatorHelper{

    static int multiply(int i, int j){
        return i * j;
    }

}

/**
 *
 * ----- Implementing UnaryOperator And BinaryOperator -----
 * UnaryOperator ve BinaryOperator Functional'ın özelleşmiş halleridir.
 * UnaryOperator, Function interface'ini extend eder.
 * BinaryOperator ise BiFunction interface'ini extend eder.
 * UnaryOperator  : T apply(T t);
 * BinaryOperator : T apply(T t1, T t2);
 *
 */
