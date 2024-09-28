package org.basics.ocp17.chapter02;

public class _04_Binary_Arithmetic_Operators {

    public static void main(String[] args) {

        int price = 2 * 5 + 3 * 4 - 8;
        System.out.println(price);

        System.out.println(9 / 3);      // 3
        System.out.println(9 % 3);      // 0

        System.out.println(10 / 3);     // 3
        System.out.println(10 % 3);     // 1

        System.out.println(11 / 3);     // 3
        System.out.println(11 % 3);     // 2

        System.out.println(12 / 3);     // 4
        System.out.println(12 % 3);     // 0

    }

}

/**
 *
 * 1. Mantıksal ifadeler oluşturmak, temel değişken atamaları yapmak gibi işlemlerde kullanılır.
 * 2. Binary operatorler sıklıkla diğer binary operatorler ile combine edilirler.
 * 3. Parantezlerin operator önceliği vardır.
 * 4. Javada köşeli parantezleri operatorler için kullanamayız [].
 * 5.
 *
 */
