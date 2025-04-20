package org.basics.ocp17.chapter04;

public class _06_Creating_And_Manipulating_Strings {

    public static void main(String[] args) {

        var start = "AniMaL     ";
        var trimmed = start.trim();                                 // -> "AniMal"
        var lowerCase = trimmed.toLowerCase();                      // -> "animal"
        var result = lowerCase.replace('a', 'A');  // -> "AnimAl"
        System.out.println(result);

        String result2 = "AniMaL     ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result2);

    }

}

/**
 *
 * 1. Method Chaining : Methodların zincirleme şeklinde arka arkaya çağırılmasıdır.
 *
 */
