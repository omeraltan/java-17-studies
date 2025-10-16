package org.basics.ocp17.chapter10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _13_Using_Streams {

    public static void main(String[] args) {

        var list = List.of("Toby","Anna","Leroy","Alex");
        list.stream()
            .filter(n -> n.length() == 4)       // filtreleme yapar
            .sorted()                                 // sırlama yapar
            .limit(2)                         // sadece iki tane alır
            .forEach(System.out::println);            // yazdırır (Bu şekilde bir zincirleme işlemler gerçekleştirilir.)

        System.out.println("--------------------");

        Stream.generate(() -> "Elsa")
            .filter(n -> n.length() == 4)
            // .sorted()                               // sorted yanlış yerde kullanıldığı için sonlanmaz (OutOfMemoryError)
            .limit(2)
            .forEach(System.out::println);

        System.out.println("--------------------");

        Stream.generate(() -> "Elsa")
            .filter(n -> n.length() == 4)
            .limit(2)                           // Burada filtrelemeden sonra kısıtlanıyor (sadece 2 tanesini alıyor.)
            .sorted()                                   // sorted doğru yerde kullanıldığı için hata vermez.
            .forEach(System.out::println);

        System.out.println("--------------------");

//        Stream.generate(() -> "Olaf Lazisson")          // Bu kod parçasıda takılı kalır
//            .filter(n -> n.length() == 4)        //  String ifade 4 karakterden fazla olduğu için hiçbir şekilde filtreleme yapılamaz
//            .limit(2)
//            .sorted()
//            .forEach(System.out::println);

        System.out.println("--------------------");

        long count = Stream.of("goldfish","finch")      // Hatta iki pipeline birlikte zincirlenebilir.
            .filter(s -> s.length() > 5)
            .collect(Collectors.toList())            // Burada listeye dönüştürülüyor.
            .stream()                                // listeden tekrardan stream oluşturuluyor
            .count();

        System.out.println(count);

        System.out.println("--------------------");

        List<String> helper = Stream.of("goldfish","finch")
            .filter(s -> s.length() > 5)
            .collect(Collectors.toList());
        long count2 = helper.stream()
            .count();
        System.out.println(count2);


    }

}

/**
 *
 * -------------------- Putting Together The Pipeline --------------------
 * Bir Stream üzerinde zincirleme olarak methodları kullanabiliriz.
 *
 *      ---------------- Intermediate Operations --------- terminal operation -----
 *      stream() --> filter() --> sorted() --> limit() --> forEach()
 *
 */
