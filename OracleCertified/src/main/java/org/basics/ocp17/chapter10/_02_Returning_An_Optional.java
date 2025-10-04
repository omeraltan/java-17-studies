package org.basics.ocp17.chapter10;

import java.util.Optional;

public class _02_Returning_An_Optional {

    public static void main(String[] args) {

        Optional<Double> opt = average();
        System.out.println(opt.orElse(Double.NaN));         // opt de değer olmadığında orElse ile Double.NAN değeri kullanılacaktır.
        System.out.println(opt.orElseGet(Math::random));    // opt de değer olmadığında Supplier ile bir Math.random kullanılarak bir değer oluşturulmaktadır.

        System.out.println("-------------------------");

        Optional<Double> opt2 = average(90,100);
        System.out.println(opt2.orElse(Double.NaN));        // değer olduğu için orElse kullanılmayacaktır.
        System.out.println(opt2.orElseGet(Math::random));   // değer olduğu için orElseGet kullanılmayacaktır.
        System.out.println(opt2.orElseThrow());             // değer olduğu için orElseThrow kullanılmayacaktır ve hata fırlatmayacaktır. Hata olması durumunda NoSuchElementException fırlatacaktır.

        System.out.println("-------------------------");
        Optional<Double> opt3 = average();
        // System.out.println(opt3.orElseThrow(IllegalArgumentException::new));
        // System.out.println(opt3.orElseGet(() -> new IllegalArgumentException())); // DOES NOT COMPILE (orElseGet methodunun overload methodu yoktur.)

        System.out.println("-------------------------");
        Optional<Double> opt4 = average();
        System.out.println(opt4.or(() -> Optional.of(10.2)));   // or methodu geriye Optional dönmektedir.





    }

    public static Optional<Double> average(int... scores){
        if (scores.length == 0){
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

}

/**
 *
 * -------------------- Dealing With An Empty Optional --------------------
 * Bir önceki tanımladığımız tablodaki methodlar bir değer olmadığında ne yapılması gerektiğimiz methodlardır.
 * Optional methodları ile ilgili eğer değer varsa çalışmazlar.
 * Optional lara alternatif olarak null değer dönebiliriz. BU durumda belkide birkaç yetersiz durum ortaya çıkacaktır.
 * null ifadesi de sonuç olarak döndürülebilir ancak null'ın özel bir değer olduğunu ifade etmenin bir yolu yoktur.
 *
 *
 *
 */
