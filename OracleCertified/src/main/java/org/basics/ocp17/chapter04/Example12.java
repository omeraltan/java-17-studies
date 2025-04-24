package org.basics.ocp17.chapter04;

import java.time.*;
import java.util.Set;

public class Example12 {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());

        System.out.println("---------------");

        LocalDate date1 = LocalDate.of(2022, Month.JANUARY,20);
        LocalDate date2 = LocalDate.of(2022,1,20);

        System.out.println(date1);
        System.out.println(date2);

        System.out.println("---------------");

        System.out.println(LocalTime.now());

        System.out.println("---------------");

        ZonedDateTime zoned1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, ZoneId.of("US/Eastern"));
        ZonedDateTime zoned2 = ZonedDateTime.of(LocalDateTime.of(2022, 1, 20, 6, 15, 30), ZoneId.of("Europe/Istanbul"));
        System.out.println(zoned1);
        System.out.println(zoned2);

        System.out.println("---------------");

        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Tokyo Time: " + tokyoTime);  // Tokyo zamanı
        System.out.println("New York Time: " + newYorkTime);  // New York zamanı

        System.out.println("---------------");

        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        zoneId.forEach(System.out::println);

        System.out.println("---------------");



    }

}
