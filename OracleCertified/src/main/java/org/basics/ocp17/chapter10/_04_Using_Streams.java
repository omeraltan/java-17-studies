package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class _04_Using_Streams {

    public static void main(String[] args) {

        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);

        System.out.println(empty.count());          // 0
        System.out.println(singleElement.count());  // 1
        System.out.println(fromArray.count());      // 3

        System.out.println("--------------------");

        var list = List.of("a","b","c");
        Stream<String> fromList = list.stream();
        System.out.println(fromList.count());       // 3

        System.out.println("--------------------");

        var list2 = List.of("a","b","c");
        Stream<String> fromListParallel = list2.parallelStream();
        System.out.println(fromListParallel.count());

        System.out.println("--------------------");

        Stream<Double> randoms = Stream.generate(Math::random);
        // randoms.forEach(System.out::println);                   // infinite

        System.out.println("--------------------");
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        // oddNumbers.forEach(System.out::println);                    // infinite

        System.out.println("--------------------");
        Stream<Integer> oddNumberUnder100 = Stream.iterate(
          1,                    // seed
          n-> n < 100,        // Predicate to specify when done
          n -> n + 2          // UnaryOperator to get next value
        );
        oddNumberUnder100.forEach(System.out::println);

        System.out.println("--------------------");

        String[] values = {"value1", "value2", "value3"};   // Bir array üzerinden stream oluşturna
        Stream.of(values).forEach(System.out::println);

        Arrays.stream(values).forEach(System.out::println); // Bu şekilde de stream kullanılabilir.

        System.out.println("--------------------");

        Stream<Integer> stream = Stream.<Integer>builder()  // builder üzerinden de bir stream oluşturulabilir.
            .add(1)
            .add(2)
            .add(3)
            .add(4)
            .add(5)
            .build();
        stream.forEach(System.out::println);

        System.out.println("--------------------");

        Stream<String> words = Pattern.compile(" ").splitAsStream("a bb ccc"); // Pattern üzerinden stream
        words.forEach(System.out::println);

        System.out.println("--------------------");

        "abracadabra".chars().forEach(ch -> System.out.printf("%c ", ch));  // String üzerinden chars methodu çağırıldığında bir stream dönmektedir.



    }

}

/**
 *
 * -------------------- Creating Finite Streams --------------------
 * Stream interface'i java.util.stream paketinde yer alır.
 * T tipinde bir Stream parametresi almakta, Stream interface'i BaseStream interface'ini extends eder.
 * Stream interface'inin yanında IntStream, LongStream, DoubleStream gibi primitive tipler için kullanacağımız özelleşmiş Stream Interface'leride vardır.
 * Bunlarda yine aynı şekilde BaseStream Interface'ini kalıtır.
 * -------------------- Creating Infinite Streams --------------------
 * Sonsuz bir Stream oluşturabilmek için generate ve iterate methodlarını kullanabiliririz.
 * Stream.generate(Math::random)    -> Sürekli akan bir sayı generate edecektir.
 * Stream.iterate(1, n -> n + 2)    -> Birden başlayıp 2 şer 2 şer artıracaktır.
 *
 * -------------------- Creating a source --------------------------------------------------------------------------------------------------
 * Method                       Finite or infinite          Notes
 * -----------------------------------------------------------------------------------------------------------------------------------------
 * Stream.empty()                                   Finite                      Creates Stream with zero elements
 * Stream.of(varargs)                               Finite                      Creates Stream with elements listed.
 * coll.stream()                                    Finite                      Creates Stream from Collection.
 * coll.parallelStream()                            Finite                      Creates Stream from Collection where the stream can run in parallel.
 * Stream.generate(supplier)                        Infinite                    Creates Stream by calling Supplier for each element upon request.
 * Stream.iterate(seed, unaryOperator)              Infinite                    Creates Stream by using seed for first element and then calling UnaryOperator for each subsequent element upon request.
 * Stream.iterate(seed, predicate, unaryOperator)   Finite or Infinite          Creates Stream by using seed for element and then calling UnaryOperator for each subsequent element upon request. Stops if predicate returns false.
 *
 */
