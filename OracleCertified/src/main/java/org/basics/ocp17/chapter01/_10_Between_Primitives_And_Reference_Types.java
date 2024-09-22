package org.basics.ocp17.chapter01;

public class _10_Between_Primitives_And_Reference_Types {

    public static void main(String[] args) {
        String reference = "hello";
        int len = reference.length();
        // int bad = len.length();         // -> DOES NOT COMPILE

        // int value = null;               // -> DOES NOT COMPILE
        String value2= null;

        int primitive = Integer.parseInt("123");        // String to int
        Integer wrapper = Integer.valueOf("123");       // String to Integer

        System.out.println(primitive);
        System.out.println(wrapper);
    }

}

/**
 *
 * 1.   Sekiz primitive type'ın tamamı lowercase'dir.
 * 2.   Reference type'ların tamamı büyük harfle başlar (Bir zorunluluk değildir ama standarttır).
 * 3.   Reference type üzerinden bir method çağrımı yapılabilir. Primitive type'larda böyle bir konu söz konusu değildir.
 * 4.   Reference type'lara "null" değeri atayabiliriz.
 * 5.   Her primitive type'ın bir wrapper class'ı vardır.
 * 6.   Wrapper class'ların sahip olduğu valueOf(); methodları değerleri wrapper değerlere çevirir.
 *
 */
