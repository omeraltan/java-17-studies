package org.basics.ocp17.chapter04;

import java.time.*;

public class _16_Manupilating_Dates_And_Times {

    public static void main(String[] args) {

        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        System.out.println("---------------");

        System.out.println("1980: " + Year.isLeap(1980));
        System.out.println("2000: " + Year.isLeap(2000));
        System.out.println("2016: " + Year.isLeap(2016));
        System.out.println("2020: " + Year.isLeap(2020));
        System.out.println("2096: " + Year.isLeap(2096));
        System.out.println("2100: " + Year.isLeap(2100));
        System.out.println("2104: " + Year.isLeap(2104));
        System.out.println("2200: " + Year.isLeap(2200));
        System.out.println("2300: " + Year.isLeap(2300));
        System.out.println("2304: " + Year.isLeap(2304));
        System.out.println("2400: " + Year.isLeap(2400));

        System.out.println("---------------");

        var date1 = LocalDate.of(2024, Month.JANUARY, 20);
        var time1 = LocalTime.of(5,15);
        var dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        dateTime1 = dateTime1.minusDays(1);
        System.out.println(dateTime1);
        dateTime1 = dateTime1.minusHours(10);
        System.out.println(dateTime1);
        dateTime1 = dateTime1.minusSeconds(30);
        System.out.println(dateTime1);

        System.out.println("---------------");

        var date2 = LocalDate.of(2024,Month.JANUARY,20);
        var time2 = LocalTime.of(5,15);
        var dateTime2 = LocalDateTime.of(date2, time2).minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime2);



    }
}

/**
 *
 * Date ve Time sınıfları immutable özelliğe sahiptir. Kendisine atama yapılması gerekir.
 *
 *
 */
