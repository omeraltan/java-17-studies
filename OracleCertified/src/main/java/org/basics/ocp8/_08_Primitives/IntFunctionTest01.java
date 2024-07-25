package org.basics.ocp8._08_Primitives;

import java.util.function.Function;
import java.util.function.IntFunction;

public class IntFunctionTest01 {

    public static void main(String[] args) {

        Function<Integer, Integer> f1 = Math::abs;
        IntFunction<Integer> f2 = Math::abs;

        System.out.println(f1.apply(-20));
        System.out.println(f2.apply(-20));

    }

}
