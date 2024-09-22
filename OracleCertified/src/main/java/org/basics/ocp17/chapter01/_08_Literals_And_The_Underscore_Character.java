package org.basics.ocp17.chapter01;

public class _08_Literals_And_The_Underscore_Character {

    public static void main(String[] args) {

        int million = 1_000_000;
        int billion = 10_000_000;

        // double notArStart = _1000.00;        // -> DOES NOT COMPILE
        // double notAtEnd = 1000.00_;          // -> DOES NOT COMPILE
        // double notByDecimal = 1000_.00;      // -> DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0;
        double reallyUgly = 1_______2;



    }

}

/**
 *
 * 1.   Literalleri ayırmak için alt tire ( _ ) işareti kullanılmaktadır.
 * 2.   Bu okunabilirliği artıran bir kullanımdır.
 * 3.   Underscore işareti rakamdan hemen önce, rakamdan hemen sonra, noktadan heme önce veya sonra kullanamayız.
 *
 */
