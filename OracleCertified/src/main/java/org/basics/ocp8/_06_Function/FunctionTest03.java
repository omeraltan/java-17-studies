package org.basics.ocp8._06_Function;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionTest03 {

    public static void main(String[] args) {

        Function<String, Integer> parseInt = FunctionTest03::parseMyString;
        Function<Integer,Integer> f2 = Math::abs;
        Integer value = parseInt.apply("123");
        System.out.println(value);
        System.out.println("--------");
        Arrays.stream("4,-9,16".split(",")).map(Integer::parseInt).forEach(System.out::println);
        System.out.println("--------");
        Arrays.stream("4,-9,16".split(",")).map(Integer::parseInt).map(f2).forEach(System.out::println);

    }

    public static int parseMyString(String str) {
        return Integer.parseInt(str);
    }

}
