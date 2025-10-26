package org.basics.ocp17.chapter10;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class _16_Working_With_Primitive_Streams {

    public static void main(String[] args) {

        var stream1 = IntStream.rangeClosed(1,10);
        OptionalDouble optional1 = stream1.average();

        optional1.ifPresent(System.out::println);
        System.out.println(optional1.getAsDouble());
        System.out.println(optional1.orElseGet(() -> Double.NaN));       // orElseGet -> DoubleSupplier

        System.out.println("--------------------");

        int sum = IntStream.empty().sum();
        System.out.println(sum);

        System.out.println("--------------------");

        LongStream stream2 = LongStream.of(5,10,7,5,10);
        OptionalDouble optional2 = stream2.average();
        optional2.ifPresent(System.out::println);
        if (optional2.isPresent()){
            System.out.println(optional2.getAsDouble());
            System.out.println(optional2.orElseGet(() -> Double.NaN));
        }

        System.out.println("--------------------");

        DoubleStream stream3 = DoubleStream.of(5.4,10.2,7.4,5.7,10);
        System.out.println(stream3.sum());

        System.out.println("--------------------");

        LongStream longs = LongStream.of(5,10);
        long sum2 = longs.sum();
        System.out.println(sum2);    // 15
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min(); // run infinitely (kod takılı kalır. PI sayısı dürekli üretildiği için min değeri bulamaz.)

    }

}

/**
 *
 * -------------------- Using Optional With Primitive Streams --------------------
 * Primitive Stream'ler kendileri ie uyumlu OptionalDouble, OptionalInt ve OptionalLong gibi sınıfları kullanırlar.
 *
 * -------------------- Optional Types For Primitives --------------------------------------
 *                                  OptionalDouble          OptionalInt         OptionalLong
 * -----------------------------------------------------------------------------------------
 * Getting as primitive             getAsDouble()           getAsInt()          getAsLong()
 * orElseGet() parameter type       DoubleSupplier          IntSupplier         LongSupplier
 * Return type of max() and min()   OptionalDouble          OptionalInt         OptionalLong
 * Return type of sum()             double                  int                 long
 * Return type of average()         OptionalDouble          OptionalDouble      OptionalDouble
 *
 *
 */
