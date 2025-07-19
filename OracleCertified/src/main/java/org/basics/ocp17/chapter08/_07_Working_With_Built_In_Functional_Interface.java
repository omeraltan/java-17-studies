package org.basics.ocp17.chapter08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class _07_Working_With_Built_In_Functional_Interface {

    public static void main(String[] args) {

        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("----------------");

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();

        System.out.println(s3.get());   // Empty String
        System.out.println(s4.get());   // Empty String

        System.out.println("----------------");

        Supplier<ArrayList<String>> s5 = ArrayList::new;
        ArrayList<String> a1 = s5.get();
        System.out.println(a1);

        System.out.println("----------------");

        Supplier<Double> s6 = () -> Math.random();
        Supplier<Double> s7 = Math::random;
        Supplier<Integer> s8 = new Random()::nextInt;

        System.out.println(s6.get());
        System.out.println(s7.get());
        System.out.println(s8.get());

        System.out.println("----------------");

        Supplier<String> s9 = String::new;
        Supplier<String> s10 = () -> "value";

        System.out.println(s9.get());
        System.out.println(s10.get());

        System.out.println("----------------");

        Supplier<Integer> s11 = () -> 100;
        Supplier<Integer> s12 = () -> Integer.valueOf(100);

        System.out.println(s11.get());
        System.out.println(s12.get());

        System.out.println("----------------");

        Supplier<Integer> s13 = SupplierHelper::method1;
        Supplier<Integer> s14 = () -> SupplierHelper.method1();
        Supplier<Integer> s15 = () -> {
          return SupplierHelper.method1();
        };
        Supplier<Integer> s16 = () -> 10;
        Supplier<Integer> s17 = SupplierHelper::method2;

        // Supplier<Integer> s18 = SupplierHelper::method3; // -> DOES NOT COMPILE
        // Supplier<Integer> s19 = SupplierHelper::method4; // -> DOES NOT COMPILE
        // Supplier<Integer> s20 = SupplierHelper::instanceMethod; // -> DOES NOT COMPILE (static method olmadığı için hata verir. Çünkü Sınıf ismi ile çağırılmaya çalışılıyor)

        Supplier<Integer> s21 = new SupplierHelper()::instanceMethod;

        System.out.println(s13.get());
        System.out.println(s14.get());
        System.out.println(s15.get());
        System.out.println(s16.get());
        System.out.println(s17.get());
        System.out.println(s21.get());

    }

}

class SupplierHelper{

    static int method1(){
        return new Random().nextInt();
    }

    static Integer method2(){
        return new Random().nextInt();
    }

    static long method3(){
        return new Random().nextInt();
    }

    static short method4(){
        return (short) new Random().nextInt();
    }

    int instanceMethod(){
        return new Random().nextInt();
    }

}

/**
 *
 * java.util.function paketi içerisinde bir çok functional interface bulunmaktadır.
 *
 * ---------- Common Functional Interfaces ----------
 * ------------------------------------------------------------------------------------
 * Functional Interface         Return type         Method name         # of parameters
 * ------------------------------------------------------------------------------------
 * Supplier<T>                  T                   get()               0
 * Consumer<T>                  void                accept(T)           1 (T)
 * BiConsumer<T, U>             void                accept(T,U)         2 (T, U)
 * Predicate<T>                 boolean             test(T)             1 (T)
 * BiPredicate<T, U>            boolean             test(T,U)           2 (T, U)
 * Function<T, R>               R                   apply(T)            1 (T)
 * BiFunction<T, U, R>          R                   apply(T,U)          2 (T, U)
 * UnaryOperator<T>             T                   apply(T)            1 (T)
 * BinaryOperator<T>            T                   apply(T,T)          2 (T, T)
 *
 * T, U ve R harfleri java.util.function paketindeki interfacelerdeki kullanılan harfleri ifade etmektedir.
 * Bu harfler Jenerikleri ifade etmektedir.
 *
 * ----- Implementing Supplier -----
 * Bir functional interface'dir. İçerisinde bir tane abstract method yer almaktadır (T get(); methodu).
 * Bu method geriye T tipinde bir değer dönmektedir.
 *
 *
 */
