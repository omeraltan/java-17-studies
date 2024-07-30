package org.basics.ocp8._12_Date_Time_API;

import java.time.Duration;
import java.time.LocalTime;

public class DateTest15 {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(10, 30);
        LocalTime now = LocalTime.now();

        Duration d1 = Duration.between(now, localTime);
        System.out.println(d1);

        /**
         *
         * PT-4H-20M-8.30382S
         * H -> Hour
         * M -> Minute
         * S -> Second
         *
         */

        Duration d2 = Duration.ofHours(20);
        Duration d3 = Duration.ofMinutes(30);
        Duration d4 = Duration.ofSeconds(75);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }

}
