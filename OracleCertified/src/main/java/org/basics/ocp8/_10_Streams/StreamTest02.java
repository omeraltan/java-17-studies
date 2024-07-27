package org.basics.ocp8._10_Streams;

import java.util.stream.IntStream;

public class StreamTest02 {

    public static void main(String[] args) {

        /*----------Source----------|Intermediate Operations|----Terminal Operations----*/
        IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).forEach(System.out::println);

        IntStream.rangeClosed(1, 10).filter(StreamTest02::isEven).forEach(System.out::println);

    }

    public static boolean isEven(int i){
        return i % 2 == 0;
    }

}
