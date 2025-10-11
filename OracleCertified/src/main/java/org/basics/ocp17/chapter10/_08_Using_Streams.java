package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class _08_Using_Streams {

    public static void main(String[] args) {

        var array = new String[]{"w","o","l","f"};
        StringBuilder result = new StringBuilder();
        for (var s : array){
            result.append(s);
        }
        System.out.println(result);

        System.out.println("--------------------");

        Stream<String> stream1 = Stream.of("w","o","l","f");
        String word1 = stream1.reduce("", (s,c) -> s + c);
        System.out.println(word1);

        System.out.println("--------------------");

        Stream<String> stream2 = Stream.of("w","o","l","f");
        String word2 = stream2.reduce("",String::concat);                   // Burada ilk değer boşluk ile başlıyor.
        System.out.println(word2);

        System.out.println("--------------------");

        Stream<Integer> stream3 = Stream.of(3,5,6);
        System.out.println(stream3.reduce(1,(a,b) -> a*b)); // Burada ilk değer 1 ile başlıyor.

        System.out.println("--------------------");

        Stream<String> stream4 = Stream.of("w","o","l","f");
        String word4 = stream4.reduce("---",String::concat);
        System.out.println(word4);

        System.out.println("--------------------");

        Stream<Integer> stream5 = Stream.of(3,5,6);
        System.out.println(stream5.reduce(2,(a,b) ->
            {
                System.out.println("a: " + a + " , b : " + b);
                return a * b;
            }
        ));

        System.out.println("--------------------");

        BinaryOperator<Integer> op = (a,b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElement = Stream.of(3,5,6);

        empty.reduce(op).ifPresent(System.out::println);        // no output
        oneElement.reduce(op).ifPresent(System.out::println);   // 3
        threeElement.reduce(op).ifPresent(System.out::println); // 90

        System.out.println("--------------------");

        Stream<String> stream6 = Stream.of("w","o","l","f!");
        int length = stream6.reduce(0, (i,s) -> i+s.length(), (a,b) -> a+b);
        System.out.println(length);

        System.out.println("--------------------");

        Stream<String> stream7 = List.of("ab","abc","abcd","abcde").parallelStream();
        int length2 = stream7.reduce(0,(Integer i, String s) ->
            {
                System.out.println(i + "-" + s);
                return i + s.length();
            },
            (Integer a, Integer b) ->
            {
                System.out.println("Combiner : " + a + "-" + b);
                return a + b;
            }
        );
        System.out.println(length2);

        System.out.println("--------------------");

        List<Integer> ages = Arrays.asList(25,30,45,28,32);
        int computedAges = ages.parallelStream().reduce(0,(a,b) -> a + b, Integer::sum);
        System.out.println(computedAges);

        System.out.println("--------------------");



    }

}

/**
 *
 * -------------------- Reducing --------------------
 * reduce() methodunun 3 tane overloaded versiyonu bulunmaktadır. Reduction özellik gösterir.
 * Stream'deki tüm elemanları process eder. reduce() methodu Stream'deki elemanları tek bir object'e indirger.
 *
 * Boş Stream'ler için senaryo:
 * Eğer stream boş ise bu durumda Optional.empty değeri geriye döner.
 * Eğer stream de bir değer varsa bu değer döndürülür.
 * Eğer stream de birden fazla eleman varsa bu durumda accumulatır bu değerleri combine etmek için çalışıcaktır.
 *
 *
 *
 */
