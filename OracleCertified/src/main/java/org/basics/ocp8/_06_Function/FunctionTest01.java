package org.basics.ocp8._06_Function;

import java.util.function.Function;

public class FunctionTest01 {

    public static void main(String[] args) {

        Function<String, Integer> lengthF1 = (String str) -> str.length();
        Integer l1 = lengthF1.apply("123");
        System.out.println(l1);
    }

}
