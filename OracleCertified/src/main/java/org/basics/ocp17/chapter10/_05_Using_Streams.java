package org.basics.ocp17.chapter10;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class _05_Using_Streams {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("monkey","gorilla","bonobo");
        System.out.println(s1.count());                                          // 3

        System.out.println("---------------------");

        Stream<String> s2 = Stream.of("monkey","ape","bonobo");
        Optional<String> min = s2.min((x1,x2) -> x1.length() - x2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((x1,x2) -> 0);
        System.out.println(minEmpty.isPresent());   // false

        System.out.println("---------------------");

        Stream<String> s3 = Stream.of("monkey","ape","bonobo","horse","hypothalamus");
        Optional<String> min3 = s3.min(Comparator.comparingInt(String::length));
        // Optional<String> max3 = s3.max(Comparator.comparing(String::length));       // IllegalStateException (s3 stream i min3 tarafından birkez kullanıldı ve kapatıldı)
        System.out.println(min3);

        System.out.println("---------------------");

        Optional<Double> highest = Stream.of(24.5,23.6,27.9,21.1,23.4,25.5).max(Double::compareTo);
        Optional<Double> lowest = Stream.of(24.5,23.6,27.9,21.1,23.4,25.5).min(Double::compareTo);
        System.out.println(highest);
        System.out.println(lowest);

        System.out.println("---------------------");

        Stream<String> s = Stream.of("monkey","gorilla","bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        System.out.println("---------------------");



    }

}

/**
 *
 * -------------------- Using Common Terminal Operations --------------------
 * Terminal operation'lar sonlandırıcı işlemlerdir.
 * Bunlar intermediate operation'lar olmadanda kullanılabilirler. Tersi mümkün değildir.
 * Reduction: termianl operation'ın özelleşmiş halidir. Reduction işleminde, Stream'de yer alan tüm elemanlar bir primitive değere, object'e indirgenir.
 * -------------------- Terminal Stream Operations ------------------------------------------
 * Method               What happens for infinite streams       Return value        Reduction
 * ------------------------------------------------------------------------------------------
 * count()              Does not terminate                      long                Yes             -> Sonlu bir stream de kaç elemanın olduğu bilgisini dönecektir.
 * min()                Does not terminate                      Optional<T>         Yes
 * max()                Does not terminate                      Optional<T>         Yes
 * findAny()            Terminates                              Optional<T>         No              -> Stream boş olmadığı sürece bir değer dönecektir. Genellikle de ilk değeri döner. Boş ise Optional.empty döner.
 * findFirst()          Terminates                              Optional<T>         No              -> Stream boş olmadığı sürece bir değer dönecektir. İlk değeri döner. Boş ise Optional.empty döner.
 * allMatch()           Sometimes terminates                    boolean             No
 * anyMatch()           Sometimes terminates                    boolean             No
 * noneMatch()          Sometimes terminates                    boolean             No
 * forEach()            Does not terminate                      void                No
 * reduce()             Does not terminate                      Varies              Yes
 * collect()            Does not terminate                      Varies              Yes
 *
 *
 *
 *
 */
