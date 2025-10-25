package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _15_Working_With_Primitive_Streams {

    public static void main(String[] args) {

        Stream<String> objStream1 = Stream.of("penguin","fish");
        IntStream intStream1 =objStream1.mapToInt(s -> s.length());
        intStream1.forEach(System.out::println);

        System.out.println("--------------------");

        Stream<String> objStream2 = Stream.of("penguin","fish");
        DoubleStream intStream2 =objStream2.mapToDouble(String::length);
        intStream2.forEach(System.out::println);

        System.out.println("--------------------");

        List<String> list = Arrays.asList("3","6","8","14","15");

        list.stream().mapToInt(Integer::parseInt)
            .filter(num -> num % 3 == 0)
            .forEach(System.out::println);

        System.out.println("--------------------");

        var integerList = List.of(1,5,20,4,3,7,11);
        IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));
        ints.forEach(i -> System.out.print(i + ","));
        System.out.println();
        DoubleStream doubles = integerList.stream().flatMapToDouble(x -> DoubleStream.of(x));
        System.out.println("sum : " + doubles.sum());
        LongStream longs = integerList.stream().flatMapToLong(x -> LongStream.of(x));
        System.out.println("min : " + longs.min());

        System.out.println("--------------------");

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9,10);

        List<List<Integer>> mainList = Arrays.asList(list1,list2,list3);

        IntStream intStream = mainList
            .stream()
            .flatMapToInt(lists -> lists.stream().mapToInt(Integer::intValue));

        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("--------------------");

        String [][] arrayOfArrays = {{"1","2"},{"5","6"},{"3","4"}};
        IntStream intStream3 = Arrays.stream(arrayOfArrays)
            .flatMapToInt(childArray -> Arrays.stream(childArray).mapToInt(Integer::parseInt));
        intStream3.forEach(i -> System.out.print(i + " "));


    }

}

/**
 *
 * -------------------- Mapping Streams --------------------
 * Bir primitive stream oluşturmak için diğer bir yöntemde başka bir stream tipini maplemektir.
 * ---------------------------------------- Mapping Methods Between Types Of Streams -----------------------------------------------
 * Source stream class          To create Stream        To create DoubleStream      To create IntStream         To create LongStream
 * ---------------------------------------------------------------------------------------------------------------------------------
 * Stream<T>                    map()                   mapToDouble()               mapToInt()                  mapToLong()
 * DoubleStream                 mapToObj()              map()                       mapToInt()                  mapToLong()
 * IntStream                    mapToObj()              mapToDouble()               map()                       mapToLong()
 * LongStream                   mapToObj()              mapToDouble()               mapToInt()                  map()
 *
 * -------------------- Using flatMap() --------------------
 * Bu yaklaşım primitive stream'lerde de kullanılabilir. Aynı şekilde düzenli Stream'lerdeki gibi çalışır. Sadece method isimleri farklıdır.
 * Örneğin: flatMapToInt(), flatMapToDouble(), flatMapToLong()
 *
 * --------------------------------- Function Parameters When Mapping Between Types Of Streams -------------------------------------
 * Source stream class          To create Stream        To create DoubleStream      To create IntStream         To create LongStream
 * ---------------------------------------------------------------------------------------------------------------------------------
 * Stream<T>                    Function<T,R>           ToDoubleFunction<T>         ToIntFunction<T>            ToLongFunction<T>
 * DoubleStream                 DoubleFunction<R>       DoubleUnaryOperator         DoubleIntFunction           DoubleToLongFunction
 * IntStream                    IntFunction<R>          IntToDoubleFunction         IntUnaryOperator            IntToLongFunction
 * LongStream                   LongFunction<R>         LongToDoubleFunction        LongToOntFunction           LongUnaryOperator
 *
 *
 */
