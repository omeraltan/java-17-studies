package org.basics.ocp17.chapter02;

public class _07_Comparing_Values {

    public static void main(String[] args) {

        // boolean monkey = true == 3;          // -> DOES NOT COMPILE
        // boolean ape = false != "Grape";      // -> DOES NOT COMPILE
        // boolean gorilla = 10.2 == "Koko";    // -> DOES NOT COMPILE

        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar);

        System.out.println("----------");

        System.out.println(null == null);

        System.out.println("----------");

        String str = null;
        Integer number = null;

        // System.out.println(str == number);   // -> DOES NOT COMPILE

        System.out.println("----------");

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb1 == sb2);

    }

}

/**
 *
 * Equality And Inequality
 * 1. Equality   (==) (a == 10)   : Eğer "a" değeri 10 ise "true" değerini dönecektir.
 * 2. Inequality (!=) (b != 3.14) : Eğer "b" değeri 3.14 ten farklı ise "true" değerini dönecektir.
 * 3. Equality operatörü iki referans değişken için kullanılırsa eğer refereans değişkenler aynı nesneyi gösteriyorsa eşitlik vardır.
 * 4. Equality And Inequality işlemlerinde tipleri birbirine mix edemeyiz.
 *
 */
