package org.basics.ocp17.chapter10;

import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _14_Working_With_Primitive_Streams {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1,2,3);
        System.out.println(stream1.reduce(0, (s,n) -> s + n));

        System.out.println("--------------------");

        Stream<Integer> stream2 = Stream.of(1,2,3);
        System.out.println(stream2.mapToInt(x -> x ).sum());        // mapToInt() -> Bu method Stream Integer'ı IntStream'e dönüştürecektir.
                                                                            // IntStream üzerinde farklı methodlar vardır ve sum() methodu bunlardan biridir.
        System.out.println("--------------------");

        IntStream intStream = IntStream.of(1,2,3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        System.out.println("--------------------");

        DoubleStream empty = DoubleStream.empty();
        System.out.println(empty);

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0,1.1,1.2);
        varargs.forEach(System.out::println);

        System.out.println("--------------------");

        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        System.out.println("--------------------");

        IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
        count.forEach(System.out::print);   // 12345
        System.out.println();
        IntStream range = IntStream.range(1,6);
        range.forEach(System.out::print); // 12345
        System.out.println();
        IntStream rangeClosed = IntStream.rangeClosed(1,5);
        rangeClosed.forEach(System.out::print); // 12345
        System.out.println();

        System.out.println("--------------------");

        OptionalDouble temperature = DoubleStream.of(-10.1,-5.4,6.0,-3.4,8.9,2.2)
            .filter(temp -> temp > 0)
            .findFirst();
        System.out.println("First matching temperature > 0 is " + temperature.getAsDouble());

        System.out.println("--------------------");

        IntStream temperatures = IntStream.of(-5,-6,-7,-5,2,-8,-9);
        IntPredicate positiveTemperature = temp -> temp > 0;
        int temp = temperatures
            .filter(positiveTemperature)
            .findAny()
            .getAsInt();
        System.out.println(temp);

        System.out.println("--------------------");

        boolean anyMatch = IntStream.of(-56,-57,-55,-52,-48,-51,-49).anyMatch(degreee -> degreee > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);

        boolean allMatch = IntStream.of(-56,-57,-55,-52,-48,-51,-49).allMatch(degreee -> degreee > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);

        boolean noneMatch = IntStream.of(-56,-57,-55,-52,-48,-51,-49).noneMatch(degreee -> degreee > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);

        System.out.println("--------------------");

        String text = "ömerdenemehowareyou";
        IntStream intStream2 = text.chars();
        intStream2.forEach(System.out::println);


    }

}

/**
 *
 * -------------------- Working With Primitive Streams --------------------
 * Stream interface inin yanında ayrıca primitive tiplerle uygun bir şekilde çalışan interfaceler yer almaktadır.
 * Bunlar IntStream, LongStream, DoubleStream şeklindedir.
 * Bu interface'lerde Stream interface'inde olduğu gibi BaseStream interface'ini kalıtmaktadır.
 *
 * -------------------- Creating Primitive Streams --------------------
 *  IntStream       : int, short, byte ve chart ile uyumludur.
 *  LongStream      : long ile uyumludur.
 *  DoubleStream    : double ve float ile uyumludur.
 *
 * ----------------------------------- Common Primitive Stream Methods -------------------------------------------------------------------------------------------------------------------------
 * Method                                       Primitive Stream                                        Description
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * OptionalDouble average()                     IntStream, LongStream, DoubleStream                     Arithmetic mean of elements
 * Stream<T> boxed()                            IntStream, LongStream, DoubleStream                     Stream<T> where T is wrapper class associated with primitive value
 * OptionalInt max()                            IntStream                                               Maximum element of stream
 * OptionalLong max()                           LongStream
 * OptionalDouble max()                         DoubleStream
 * OptionalInt min()                            IntStream                                               Minimum element of stream
 * OptionalLong min()                           LongStream
 * OptionalDouble min()                         DoubleStream
 * IntStream range(int a, int b)                IntStream                                               Returns primitive stream from a (inclusive) to b (exclusive)
 * LongStream range(long a, long b)             LongStream
 * IntStream rangeClosed(int a, int b)          IntStream                                               Returns primitive stream from a (inclusive) to b (inclusive)
 * LongStream rangeClosed(long a, long b)       LongStream
 * int sum()                                    IntStream                                               Returns sum of elements in stream
 * long sum()                                   LongStream
 * double sum()                                 DoubleStream
 * IntSummaryStatistics summaryStatistics()     IntStream                                               Returns object containing numerous stream statistics such as average, min, max, etc.
 * LongSummaryStatistics summaryStatistics()    LongStream
 * DoubleSummaryStatistics summaryStatistics()  DoubleStream
 *
 *
 *
 */
