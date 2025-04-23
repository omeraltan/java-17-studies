package org.basics.ocp17.chapter04;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class _18_Working_With_Durations {

    public static void main(String[] args) {

        var daily = Duration.ofDays(1);             // PT24H
        var hourly = Duration.ofHours(1);           // PT1H
        var everyMinute = Duration.ofMinutes(1);    // PT1M
        var everyTenSeconds = Duration.ofMillis(1); // PT0.001S
        var everyNano = Duration.ofNanos(1);        // PT0.000000001S

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyNano);

        System.out.println("--------------------");

        var daily2 = Duration.of(1, ChronoUnit.DAYS);
        var hourly2 = Duration.of(1, ChronoUnit.HOURS);
        var everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
        var everyTenSeconds2 = Duration.of(10, ChronoUnit.SECONDS);
        var everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        var everyNano2 = Duration.of(1, ChronoUnit.NANOS);

        System.out.println(daily2);
        System.out.println(hourly2);
        System.out.println(everyMinute2);
        System.out.println(everyTenSeconds2);
        System.out.println(everyMilli);
        System.out.println(everyNano2);

        System.out.println("--------------------");

        var one = LocalTime.of(5,15);
        var two = LocalTime.of(6,39);
        var date = LocalDate.of(2016,1,20);
        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));
        // System.out.println(ChronoUnit.MINUTES.between(one, date)); DateTimeException

        System.out.println("--------------------");

        LocalTime time = LocalTime.of(3,12,45);
        System.out.println(time);
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated);
        LocalTime truncated2 = time.truncatedTo(ChronoUnit.HOURS);
        System.out.println(truncated2);

        System.out.println("--------------------");

        var date2 = LocalDate.of(2022,1,20);
        var time2 = LocalTime.of(6,15);
        var dateTime2 = LocalDateTime.of(date2,time2);
        var duration = Duration.ofHours(6);
        System.out.println(dateTime2.plus(duration));
        System.out.println(time2.plus(duration));
        // System.out.println(date2.plus(duration)); UnsupportedTemporalTypeException

        System.out.println("--------------------");

        var dateTime = LocalDateTime.of(2025, 4,23, 7,10);
        var durationDate = Duration.ofDays(365);
        System.out.println(dateTime.plus(durationDate));

        System.out.println("--------------------");

        var date3 = LocalDate.of(2022,5,25);
        var period3 = Period.ofDays(1);
        var days = Duration.ofDays(1);

        System.out.println(date3.plus(period3));
        // System.out.println(date3.plus(days)); UnsupportedTemporalTypeException

    }

}

/**
 *
 * Duration sınıfı daha küçük zamanlar için kullanışlıdır.
 * Duration; gün, saat, dakika, saniye, milisaniye ve nano saniye üzerinde işlemler yapabilir.
 * Period da "P" ile ifade edilirken Durationda "PT"ile ifade edilir.
 * Bir biri ile uyumsuz çiftler arasında işlem yaptıramayız. Örneğin ChronoUnit.MINUTES.between() iki time parametresi bekler.
 * Period ve Duration aynı değildir. Farklı zaman dilimleri için kullanılırlar.
 *
 *                       Can use with Period?                        Can use with Duration?
 *                       --------------------                        ----------------------
 * LocalDate                      Yes                                           No
 * LocalDateTime                  Yes                                           Yes
 * LocalTime                      No                                            Yes
 * ZonedDateTime                  Yes                                           Yes
 *
 */
