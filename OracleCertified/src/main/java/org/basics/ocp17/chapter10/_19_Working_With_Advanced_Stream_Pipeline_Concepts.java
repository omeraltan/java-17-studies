package org.basics.ocp17.chapter10;

import javax.swing.text.html.Option;
import java.util.Optional;

public class _19_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        threeDigit(Optional.of(123));

        threeDigit2(Optional.of(123));

        optionalExample();

        optionalMapExample2();

        optionalFlatMap();

    }

    private static void threeDigit(Optional<Integer> optional){
        optional.map(n -> "" + n)
            .filter(s -> s.length() == 3)
            .ifPresent(System.out::println);
    }

    private static void threeDigit2(Optional<Integer> optional){
        optional
            .filter(s -> s >= 100 && s <= 999)
            .ifPresent(System.out::println);
    }

    private static void optionalExample(){
        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim)
            .map(String::toUpperCase)
            .ifPresent(System.out::println);
    }

    private static void optionalMapExample2(){
        Optional<String> optional = Optional.of("value");
        String upperCase = optional
            .map(String::toUpperCase)
            .get();
        System.out.println(upperCase);
    }

    /**
     * flatMap() kullanılır çünkü calculator() metodu zaten Optional<Integer> döndürüyor.
     * Problem:
     * map() kullanırsan Optional<Optional<Integer>> olur (iç içe Optional).
     * flatMap() iç içe Optional'ı tek katmana indirir: Optional<Integer>.
     * Kural:
     * Metodun dönüşü Optional<T> ise flatMap() kullan.
     * Metodun dönüşü T ise map() kullan.
     * Bu kodda calculator() → Optional<Integer> döndürdüğü için flatMap() kullanılmalı.
     */
    private static void optionalFlatMap(){
        Optional<Integer> optional = Optional.of(100);
        Optional<Integer> result = optional.flatMap(_19_Working_With_Advanced_Stream_Pipeline_Concepts::calculator);
        System.out.println(result.get());
    }

    static Optional<Integer> calculator(Integer opt){
        return Optional.of(opt * 10);
    }

}

/**
 *
 * -------------------- Chaining Optionals --------------------
 * Optional metodları birbirine bağlanarak zincirleme işlem yapılabilir. Her metod kendine özgü işlevlere sahiptir:
 *  filter()    ->  ile koşul kontrolü yapılır
 *  map()       ->  ile dönüşümler yapılır
 *  flatMap()   ->  ile iç içe Optional'lar düzleştirilir
 *  orElse()    ->  ile varsayılan değer kullanılır
 *  ifPresent() ->  ile varsa işlem yapılır
 * Her metodun çıktısı bir sonraki adıma girdi olarak geçer ve böylece temiz, okunabilir bir akış oluşur.
 * Başarısız bir adım olursa akış durur, sonraki adımlar çalışmaz.
 * Bu yapı kullanıcı işlemlerinden API çağrılarına ve veri işleme adımlarına kadar birçok senaryoda kullanılır.
 *
 */
