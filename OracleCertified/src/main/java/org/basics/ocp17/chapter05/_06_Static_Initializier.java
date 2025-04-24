package org.basics.ocp17.chapter05;

import java.util.List;

import static java.util.Arrays.asList;

public class _06_Static_Initializier {

    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    public static void main(String[] args) {

        System.out.println("main - begin");
        System.out.println(NUM_SECONDS_PER_MINUTE);
        System.out.println(NUM_MINUTES_PER_HOUR);
        System.out.println(NUM_SECONDS_PER_HOUR);

        System.out.println("---------------");

        List<String> list = asList("one", "two");   // -> static import for "asList"
        list.forEach(System.out::println);
    }

    static {
        System.out.println("Static Initializer - 1");
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        System.out.println("Static Initializer - 2");
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }

}

/**
 *
 * static initializer ların çalışma sırası tanımlandığı sıradadır.
 * static initializer lar sınıf yüklendiği zaman çalışır duruma gelir.
 * instance variable lara static initializer lar içerisinden erişim sağlanamaz.
 * static imports : Bu ifade static variable ları ve static methodları sınıfımıza import etmek için kullanılır.
 * static imports : Bu ifadeler "import static" diye kullanılabilir "static import" diye değil
 * static imports : Bu ifadeler için aynı isimde variable lar veya methodlar için çakışma olur (Örneğin Integer sınıfındaki MAX_VALUE ve Long sınıfındaki MAX_VALUE gibi).
 */
