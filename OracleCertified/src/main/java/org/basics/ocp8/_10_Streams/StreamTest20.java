package org.basics.ocp8._10_Streams;

import java.util.stream.DoubleStream;

public class StreamTest20 {

    public static void main(String[] args) {

        DoubleStream ds = DoubleStream.of(1.0, 2.0, 3.0, 2.5, 5, 20.4, 6.7);
        ds.forEach(System.out::println);
        System.out.println("limit test: ");
        DoubleStream DS2 = DoubleStream.generate(Math::random);
        DS2.limit(5).forEach(System.out::println);

    }

}
