package org.basics.ocp17.chapter04;

public class _10_Understanding_Arrays {

    public static void main(String[] args) {

        char[] letters1 = null;
        char[] letters2 = new char[5];
        char[] letters3 = {'a', 'b', 'c'};

        int length = letters2.length;

        System.out.println(length);
        System.out.println(letters3);
        System.out.println(letters3.length);
        System.out.println(letters3 instanceof Object);
        System.out.println(letters3.getClass());
        System.out.println(letters3 instanceof char[]);

        int[] numbs = null;
        System.out.println(numbs);



    }

}

/**
 *
 * 1. Array belirli sayıdaki eleman için memory de yer tanımı olan bir veri yapısıdır.
 * 2. Bir Array'in elemanları genel olarak aynı yapıdadır.
 *
 */
