package org.basics.ocp17.chapter10;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _10_Using_Streams {

    public static void main(String[] args) {

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero,one,two);

        animals.flatMap(Collection::stream)
            .forEach(System.out::println);

        System.out.println("--------------------");

        String[] string = "you never know what you have until you clean your room.".split(" ");
        Arrays.stream(string)
            .flatMap(word -> Arrays.stream(word.split("")))
            .distinct()
            .forEach(System.out::print);    // -> younevrkwhatilcm.

        System.out.println();

        System.out.println("--------------------");

        List<List<Integer>> values = Arrays.asList(Arrays.asList(1,3,5), Arrays.asList(2,4));

        values.stream()
            .flatMap(Collection::stream)    // -> Burada listeler birleştiriliyor
            .sorted()                       // -> Burada sıralama yappılıyor.
            .map(i -> i * i)         // -> Burada liste işleniyor.
            .forEach(System.out::println);  // -> Burada liste yazdırılıyor.

        System.out.println("--------------------");

        List<Integer> primeNum = Arrays.asList(5,7,11,13);
        List<Integer> oddNum   = Arrays.asList(1,3,5);
        List<Integer> evenNum  = Arrays.asList(2,4,6,8);

        List<List<Integer>> lists = Arrays.asList(primeNum,oddNum,evenNum);

        lists.stream()
            .flatMap(Collection::stream)
            .toList()
            .stream().sorted()
            .distinct()
            .forEach(System.out::print);

        System.out.println();

        System.out.println("--------------------");

        List<String> list = Arrays.asList("first element", "second element", "third element");
        Stream<String> firstWordStream = list
            .stream()
            .flatMap(str -> Stream.of(str.substring(0, str.indexOf(" "))));

        System.out.println(firstWordStream.toList());

        System.out.println("--------------------");

        String[][] array = new String[][]{{"a","b"}, {"c","d"}, {"e","f"}};
        String[] result = Stream.of(array)      // Stream<String[]>
            .flatMap(Stream::of)                // Stream<String>
            .toArray(String[]::new);            // [a,b,c,d,e,f]

        for (String s : result) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        String[][] array2 = new String[][]{{"a","b"}, {"c","d"}, {"e","f"}};

        List<String> collect = Stream.of(array2)
            .flatMap(Stream::of)
            .filter(x -> !"a".equals(x))
            .collect(Collectors.toList());

        collect.forEach(System.out::println);

        System.out.println("--------------------");

        var one2 = Stream.of("Bonobo");
        var two2 = Stream.of("Mama Gorilla", "Baby Gorilla");
        Stream.concat(one2,two2).forEach(System.out::println);      // concat() ile iki stream'in birleştirilmesi
    }

}

/**
 *
 * --------------------- Using flatMap ---------------------
 * flatMap methodu parametre olarak function alır.
 * Bu method streamden boş öğeleri kaldırmak yada bir stream listesini birleştirmek istediğimizde faydalı olacaktır.
 * ------------------ Concatenating Streams ----------------
 * İki tane stream'i birleştirmek için concat() methodu bulunmaktadır.
 *
 *
 */
