package org.basics.ocp8._10_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest06 {

    public static void main(String[] args) {

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        /*------- Single Stream flatMap() -------*/
        animals.flatMap((List<String> l) -> l.stream()).forEach((String x) -> System.out.println(x)); // Burada flatMap() ile yapılan, verilen bütün streamleri tek bir strea e dönüştürmektir.


        List<Integer[]> listArray = Arrays.asList(new Integer[]{1,2,3}, new Integer[]{4,5,6});
        listArray.stream().flatMap(array -> Arrays.stream(array)).map(i -> i*i).forEach(System.out::println);

    }

}
