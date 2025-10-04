package org.basics.ocp17.chapter10;

import java.util.Optional;

public class _01_Returning_An_Optional {

    public static void main(String[] args) {

        System.out.println(average(90,100));    // Optional[95.0]
        System.out.println(average());                  // Optional.empty

        System.out.println("--------------------");

        Optional<Double> opt = average(90,100);
        if (opt.isPresent()){                           // Eğer değer varsa koşulun içine gir demektir.
            System.out.println(opt.get());              // 95.0 (get() iel değer alınıyor.)
        }

        System.out.println("--------------------");

        String value = "";

        Optional o = (value == null) ? Optional.empty() : Optional.of(value);   // Eğer value null ise Optional.empty() dön değilse Optional.of() döner.
        // Bunun yerine ofNullable kullanılmaktadır.
        Optional b = Optional.ofNullable(value);        // value değeri null olsada herhangi bir sorun olmayacaktır.
        System.out.println(b);

        System.out.println("--------------------");

        Optional<Double> c = average(90,100);
        c.ifPresent(System.out::println);

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
 * Lambda ve method reference syntax'ı functional interface'lerde kullanılmaktadır.
 * Stream API, functional programming için kullandığımız bir kütüphanedir.
 * --------------- Returning an Optional ---------------
 * Üniversitede bir Java dersi aldığımızı varsayalım. Java ile ilgili yapılan iki sınavdan 90 ve 100 aldığımızı varsayarsak ortalamamız 95 olacaktır.
 * Diyelim ki Java ile ilgili henüz derslerin başındayız ve herhangi bir sınavada girmedik o zaman ortalamamız ne olacak?
 * Bunun için sıfır demek doğru bir yaklaşım olmayacaktır. Ortada henüz bir data olmadığı için ortalamanın 0 (sıfır) olacağı denmesi yanlış olacaktır.
 * Sonuç olmadığı için "Henüz Belirli Değil", "Bilinmiyor" yada "Uygun Değil" gibi ifadelerin karşılığı "Optional" type olmaktadır.
 * Optional type Stream API ile oldukça yoğun bir şekilde kullanılmaktadır.
 * Optional'ı bir kutu olarak düşünürsek; bu kutu boş olabilir veya içinde bir değer olabilir.
 * Bu durumda:
 * 1 - Boş iken : Optional.empty();
 * 2 - Dolu iken: Optional.of(95);      şeklinde örneklendirilebilir.
 *
 * ---------------------------------------- Common Optional instance methods ----------------------------------------
 * Method                           When Optional is empty                          When Optional contains value
 * ------------------------------------------------------------------------------------------------------------------
 * get()                            Throws exception                                Returns value
 * ifPresent(Consumer c)            Does nothing                                    Calls Consumer with value
 * isPresent()                      Returns false                                   Returns true
 * orElse(T other)                  Returns other parameter                         Returns value
 * orElseGet(Supplier s)            Returns result of calling Supplier              Returns value
 * orElseThrow()                    Throws NoSuchElementException                   Returns value
 * orElseThrow(Supplier s)          Throws exception created by calling Supplier    Returns value
 *
 */
