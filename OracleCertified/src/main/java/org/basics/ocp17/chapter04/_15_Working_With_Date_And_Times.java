package org.basics.ocp17.chapter04;

import java.time.*;
import java.util.Set;

public class _15_Working_With_Date_And_Times {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(OffsetDateTime.now());

        System.out.println("---------------");

        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        var date2 = LocalDate.of(2022, 1, 20);

        System.out.println(date1);
        System.out.println(date2);

        System.out.println("---------------");

        var time1 = LocalTime.of(6,15);
        var time2 = LocalTime.of(6,15,30);
        var time3 = LocalTime.of(6,15,30,200);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println("---------------");

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20,6,15,30);
        var dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        System.out.println("---------------");

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022,1,20,6,15,30,200,zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);

        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);

        System.out.println("---------------");

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(ZoneId.systemDefault());
        for (String zoneId : zoneIds){
            System.out.println(zoneId);
        }



    }

}

/**
 *
 * java.time api deki sınıflar java.time.*; paketinde yer alır.
 * Day ve Date arasındaki fark; Date yıl, ay ve gün ü ifade eder (January 1, 2000). Bazende ayın bir gününü ifade etmektedir
 * LocalDate    : sadece yıl,ay ve gün bilgisini tutar.
 * LocalTime    : sadece saat, dakika, saniye ve nano saniye bilgisini tutar.
 * LocalDateTime: LocalDate ve LocalTime ın birleşimini tutar.
 * ZoneDateTime : LocalDate, LocalTime ve ayrıca zone bilgisini tutar.
 * Bu sınıfların her biri now() methoduna sahiptir ve geriye o andaki bilgiyi döner.
 *
 *
 */
