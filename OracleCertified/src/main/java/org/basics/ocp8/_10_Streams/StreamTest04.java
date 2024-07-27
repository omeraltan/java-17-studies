package org.basics.ocp8._10_Streams;

import java.util.stream.DoubleStream;

public class StreamTest04 {

    public static void main(String[] args) {

        double sumValue = DoubleStream.of(1.0, 4, 9.0).map(Math::sqrt).peek(System.out::println).sum();
        System.out.println(sumValue);

    }

}
