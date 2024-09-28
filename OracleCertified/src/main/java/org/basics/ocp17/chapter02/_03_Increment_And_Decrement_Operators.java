package org.basics.ocp17.chapter02;

public class _03_Increment_And_Decrement_Operators {

    public static void main(String[] args) {

        int parkAttendance = 0;
        System.out.println(parkAttendance);         // 0
        System.out.println(++parkAttendance);       // 1
        System.out.println(parkAttendance);         // 1
        System.out.println(parkAttendance--);       // 1
        System.out.println(parkAttendance);         // 0

    }

}

/**
 *
 * 1. ++ ve -- ifadeleri olarak kullanmaktayız. Artırım ve azaltı için kullanılmaktadır.
 * 2. Bu ifadelerin çalışma önceliği vardır ve ilk olarak çalışıcaklardır.
 * 3. Bu ifadeler için iki tane durum söz konusudur. Bunlar : "PreIncrement", "PostIncrement", "PreDecrement" ve "PostDecrement"
 *
 */
