package org.basics.ocp17.chapter04;

import java.time.*;

public class _19_Working_With_Instants {

    public static void main(String[] args) {

        var now = Instant.now();
        var later = Instant.now();
        System.out.println(now);
        System.out.println(later);

        System.out.println("---------------");

        var date = LocalDate.of(2022,5,25);
        var time = LocalTime.of(11,55,00);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date, time, zone);
        var instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
        System.out.println(instant);


    }

}

/**
 *
 * Instant sınıfı "GMT" saat diliminde belirli bir zamanı temsil eder.
 *
 *
 */
