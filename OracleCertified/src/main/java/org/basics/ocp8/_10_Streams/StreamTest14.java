package org.basics.ocp8._10_Streams;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamTest14 {

    public static void main(String[] args) {

        String[] array = new String[]{"w","o","l","f"};

        String result = "";
        for (String s : array) {
            result = result + s;
        }
        Stream<String> s1 = Stream.of("w","o","l","f");
        BinaryOperator<String> bo = (String str1, String str2) -> str1 + str2;
        Optional<String> opt = s1.reduce(bo);
        System.out.println(opt.get());

        Stream<String> s2 = Stream.of("w","o","l","f");
        String reduced = s2.reduce("#",bo);
        System.out.println(reduced);


    }

}
