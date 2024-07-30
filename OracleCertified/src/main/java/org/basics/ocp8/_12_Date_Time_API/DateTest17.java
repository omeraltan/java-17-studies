package org.basics.ocp8._12_Date_Time_API;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DateTest17 {

    public static void main(String[] args) {

        System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());
        // output : 60
        System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());
        // output : 3600
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());
        // output : 86400


    }

}
