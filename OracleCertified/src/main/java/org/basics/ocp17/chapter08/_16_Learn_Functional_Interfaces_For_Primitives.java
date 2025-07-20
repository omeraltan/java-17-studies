package org.basics.ocp17.chapter08;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class _16_Learn_Functional_Interfaces_For_Primitives {

    public static void main(String[] args) {

        doublePredicateExample();

    }

    private static void doublePredicateExample(){
        DoublePredicate dp1 = (d) -> d > 1.5;
        DoublePredicate dp2 = PredicatePrimitiveHelper::predicateDouble;
        DoublePredicate dp3 = d -> PredicatePrimitiveHelper.predicateDouble(d);

        DoublePredicate dp4 = Double::isInfinite;
        DoublePredicate dp5 = Double::isNaN;
        DoublePredicate dp6 = Double::isFinite;

        System.out.println(dp1.test(0.5));
        System.out.println(dp2.test(1.1));
        System.out.println(dp3.test(2.5));

        System.out.println(dp4.test(Double.POSITIVE_INFINITY));
        System.out.println(dp5.test(Double.NaN));
        System.out.println(dp6.test(Double.MAX_VALUE));
    }

    private static void intPredicateExample(){
        IntPredicate ip1 = (int d) -> d > 1.5;
        IntPredicate ip2 = PredicatePrimitiveHelper::predicateDouble;
        IntPredicate ip3 = PredicatePrimitiveHelper::predicateInt;
        IntPredicate ip4 = d -> PredicatePrimitiveHelper.predicateDouble(d);
        IntPredicate ip5 = d -> PredicatePrimitiveHelper.predicateInt(d);

        System.out.println(ip1.test(5));
        System.out.println(ip2.test(5));
        System.out.println(ip3.test(34));
        System.out.println(ip4.test(54));
        System.out.println(ip5.test(36));
    }

    private static void longPredicateExample(){
        LongPredicate lp1 = (long d) -> d > 1.5;
        LongPredicate lp2 = PredicatePrimitiveHelper::predicateLong;
        LongPredicate lp3 = PredicatePrimitiveHelper::predicateDouble;
        // LongPredicate lp4 = PredicatePrimitiveHelper::predicateInt; // DOES NOT COMPILE
        LongPredicate lp5 = d -> PredicatePrimitiveHelper.predicateLong(d);
        LongPredicate lp6 = d -> PredicatePrimitiveHelper.predicateDouble(d);
        // LongPredicate dp7 = d -> PredicatePrimitiveHelper.predicateInt(d); // DOES NOT COMPILE


        System.out.println(lp1.test(5));
        System.out.println(lp2.test(5));
        System.out.println(lp3.test(26));
        System.out.println(lp5.test(26));
        System.out.println(lp6.test(26));
    }

}

class PredicatePrimitiveHelper{
    static boolean predicateDouble(double d){
        return d > 1.2;
    }

    static boolean predicateInt(int i){
        return i > 2;
    }

    static boolean predicateLong(long i){
        return i > 2;
    }
}

/**
 *
 *
 *
 */
