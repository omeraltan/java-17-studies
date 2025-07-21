package org.basics.ocp17.chapter08;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class _18_Learn_Functional_Interfaces_For_Primitives {

    public static void main(String[] args) {

        doubleUnaryOperatorExample();

        System.out.println("---------------");

        intUnaryOperatorExample();

        System.out.println("---------------");

        longUnaryOperatorExample();

    }

    private static void doubleUnaryOperatorExample(){
        DoubleUnaryOperator duo1 = Double::valueOf;
        DoubleUnaryOperator duo2 = Math::sqrt;
        DoubleUnaryOperator duo3 = Math::sin;
        DoubleUnaryOperator duo4 = (double d) -> d * 2;
        // DoubleUnaryOperator duo5 = (Double d) -> d * 2; // DOES NOT COMPILE (We wait a primitive type)
        DoubleUnaryOperator duo6 = PrimitiveUnaryOperatorHelper::multiply;

        System.out.println(duo1.applyAsDouble(5.2));
        System.out.println(duo2.applyAsDouble(5.2));
        System.out.println(duo3.applyAsDouble(5.2));
        System.out.println(duo4.applyAsDouble(5.2));
        System.out.println(duo6.applyAsDouble(5.2));
    }

    private static void intUnaryOperatorExample(){
        IntUnaryOperator iuo1 = Integer::valueOf;
        IntUnaryOperator iuo2 = (i) ->i * 5;
        IntUnaryOperator iuo3 = Math::toIntExact;
        IntUnaryOperator iuo4 = PrimitiveUnaryOperatorHelper::sum;

        System.out.println(iuo1.applyAsInt(10));
        System.out.println(iuo2.applyAsInt(10));
        System.out.println(iuo3.applyAsInt(10));
        System.out.println(iuo4.applyAsInt(10));
    }

    private static void longUnaryOperatorExample(){
        LongUnaryOperator luo1 = Long::valueOf;
        LongUnaryOperator lu02 = (i) -> i * 5;
        LongUnaryOperator luo3 = Math::toIntExact;
        LongUnaryOperator luo4 = PrimitiveUnaryOperatorHelper::subtract;

        System.out.println(luo1.applyAsLong(12));
        System.out.println(lu02.applyAsLong(2));
        System.out.println(luo3.applyAsLong(23));
        System.out.println(luo4.applyAsLong(101));
    }

}

class PrimitiveUnaryOperatorHelper{

    static double multiply(double value) {
        return value * 2;
    }

    static int sum(int num){
        return num + 100;
    }

    static long subtract(long num){
        return num - 100;
    }
}

/**
 *
 *
 *
 */
