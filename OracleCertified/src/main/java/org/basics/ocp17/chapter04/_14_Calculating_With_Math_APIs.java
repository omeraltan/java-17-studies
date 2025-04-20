package org.basics.ocp17.chapter04;

import java.util.Random;

public class _14_Calculating_With_Math_APIs {

    public static void main(String[] args) {

        double value  = Math.min(12.2, 10.2);
        float  value2 = Math.min(9.21f, 23.21f);
        int    value3 = Math.min(12,23);
        long   value4 = Math.min(123,12323);

        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

        System.out.println("---------------");

        long low = Math.round(123.45);
        long high = Math.round(123.50);
        int fromFloat = Math.round(123.45f);

        System.out.println(low);        // 123
        System.out.println(high);       // 123
        System.out.println(fromFloat);  // 123

        System.out.println("---------------");

        double c = Math.ceil(3.14);     // 4.0
        double f = Math.floor(3.14);    // 3.0

        System.out.println(c);
        System.out.println(f);

        System.out.println("---------------");

        double squared = Math.pow(5,2);
        double area = Math.pow(5,3);

        System.out.println(squared);
        System.out.println(area);

        System.out.println("---------------");

        double num = Math.random();
        System.out.println(num);
        System.out.println(new Random().nextDouble());
        System.out.println(new Random().nextInt());
        System.out.println(new Random().nextInt(10));


    }

}

/**
 *
 * min()    : methodu için double alırsa double döner, float alırsa float döner, int alırsa int döner, long alırsa long döner.
 * round()  : ilgili sayıdan decimal kısımları kaldırır. Ondalık kısımlarını alta veya üste yuvarlar.
 * ceil()   : Bu method, sayının ondalık kısmı olduğunda bir üst sayıya yuvarlar.
 * floor()  : Bu method, sayının ondalık kısmı olduğunda, küsuratı atar tamsayı kısmını alır.
 * pow()    : İlgili sayı veriler diğer sayıya göre sayının üstünü alır.
 * random() : Bu method parametre almadan 0 ile 1 arasında bir sayı üretir. rando() methodu netxDouble(), nextInt(), netxInt(10) ile kullanılabilir.
 *
 *
 *
 */
