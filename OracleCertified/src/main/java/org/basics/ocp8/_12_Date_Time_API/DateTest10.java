package org.basics.ocp8._12_Date_Time_API;

import java.time.*;

public class DateTest10 {

    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZoneId zoneId = ZoneId.of("Europe/Berlin");

        LocalDateTime ldt = LocalDateTime.now(zoneId);
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt, zoneId);
        System.out.println(zdt2);

        LocalDate localDate = zdt2.toLocalDate();
        LocalTime localTime = zdt2.toLocalTime();
        LocalDateTime localDateTime = zdt.toLocalDateTime();

    }

}
