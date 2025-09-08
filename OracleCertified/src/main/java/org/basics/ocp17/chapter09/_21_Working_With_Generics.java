package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.List;

public class _21_Working_With_Generics {

    public static void main(String[] args) {

        // Integer sınıfı Number sınıfının sub class'ı olsada yinede hata verecektir.
        // ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE (İki tarafın da "Number" veya "Integer" olması gerekmektedir.)

        List<? extends Number> list = new ArrayList<Integer>(); // Yukarıdaki durumu aşabilmek için "wildcard" kullanılır.
        // <? extends Number> denildiğinde; sağ tarafta Number veya Number'ın sub class'larını kullanabiliriz.

        List<Integer> integers = List.of(1,5,20,3,4,8);
        List<Double> doubles = List.of(1.0,5.2,2.3,6.5,5.2,8.4,9.6,10.1);

        System.out.println(total(integers));
        System.out.println(total(doubles));

        System.out.println(totalConverted(integers));
        System.out.println(totalConverted(doubles));

        System.out.println("--------------------");

        List<? extends Bird> birds = new ArrayList<Bird>();
        // <? extends Bird> kullanımında yeni object eklenmesine izin verilmez.
        // birds.add(new Sparrow());    // DOES NOT COMPILE (Java bizi run-time da korur.)
        // birds.add(new Bird());       // DOES NOT COMPILE (Java bizi run-time da korur.)

        System.out.println("--------------------");

        List<HangGlider> hangGliders = new ArrayList<>();
        List<Goose> gooses = new ArrayList<>();

        // anyFlyer(hangGliders);     // DOES NOT COMPILE
        // anyFlyer(gooses);          // DOES NOT COMPILE

        groupOfFlyers(hangGliders);
        groupOfFlyers(gooses);

        System.out.println("--------------------");

        List<?> unbounded = new ArrayList<>();
        ArrayList<?> unbounded2 = new ArrayList<>();

        List<? extends Object> upperBounded = new ArrayList<>();        // Joker karakter türü argümanı '?' açıkça 'java.lang.Object'i genişletir
        ArrayList<? extends  Object> upperBounded2 = new ArrayList<>(); // Joker karakter türü argümanı '?' açıkça 'java.lang.Object'i genişletir
        // Aslında <? extends  Object> ile <?> aynı şeydir.

        List<Object> objects = new ArrayList<>();   // Bu yapıya eleman ekleme işlemi yapılabilir ancak <?> yapıya eleman ekleme işlemi yapılamaz.

    }

    // Number tipinde ve sub class'ları tipinde değer kabul edebilir.
    private static long total(List<? extends Number> list){
        long count = 0;
        for (Number number : list){
            count += number.longValue();
        }
        return count;
    }

    // type erasure: arka tarafta bizim generic kontrolümüz kaldırılır ve aiağıdaki yapıya dönüşür.
    private static long totalConverted(List list){
        long count = 0;
        for (Object obj : list){
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }

    static class Sparrow extends Bird {}

    static class Bird {}

    private static void anyFlyer(List<Flyer> flyer) {

    }

    private static void groupOfFlyers(List<? extends Flyer> flyer) {

    }

}

interface Flyer { void fly(); }

class HangGlider implements Flyer { public void fly() {} }

class Goose implements Flyer { public void fly() {} }



/**
 *
 * --------------- Creating Upper-Bounded Wildcards ---------------
 * Upper-Bounded Wildcard kullanımında "?" ve "extends" anahtar kelimesi kullanılmaktadır.
 * Bu wildcard kullanımı ile Generic yapı, alt tiplerinide alabilir.
 *
 *
 */
