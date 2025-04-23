package org.basics.ocp17.chapter04;

import java.time.*;

public class _20_Account_For_Daylight_Saving_Time {

    public static void main(String[] args) {

        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1,30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date,time,zone);
        System.out.println(dateTime);
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getOffset());

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getOffset());

    }

}
